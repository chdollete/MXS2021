package com.erp.financial.maximus.config.security;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.impl.TextCodec;

@Component
public class JwtUtil {

	private static final Logger LOG = LoggerFactory.getLogger(JwtUtil.class);
	private static final String APPLICATION = "Maximus";

	private String token;
	private static final String EMPTY="";

	@Value("${application.app.jwtSecret}")
	private String jwtSecret;

	@Value("${application.app.jwtExpirationMs}")
	private int jwtExpirationMs;

	@Value("${application.app.jwtPortalKey}")
	private String jwtPortalSecret;

	private byte[] getSignKey(String key) {

		String jwtKey = key;
		byte[] decodedBytes = null;

		try {
			decodedBytes = jwtKey.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			LOG.info("secret key parse error: " + e);
		}

		return decodedBytes;
	}

	public String generateJwtToken(Map<String, Object> claims) {
		byte[] signKey = getSignKey(jwtSecret);

		Date expiration = (Date) claims.get("tokenExp");

		this.token = Jwts.builder().
				setSubject("APPLICATION-Auth-Transaction").
				setIssuer(APPLICATION).
				addClaims(claims)
				.setIssuedAt(new Date())
				.setExpiration(expiration)
				.signWith(SignatureAlgorithm.HS256, signKey)
				.compact();

		LOG.info("JWT Token = " + token);

		return this.token;
	}

	public String parseJwt(String headerAuth) {
		String jwt = "";
		if (StringUtils.hasText(headerAuth) && headerAuth.startsWith("Bearer ")) {
			jwt = headerAuth.substring(7, headerAuth.length());
			return jwt;
		}

		return null;
	}

	public String getUserNameFromJwtToken(String token) {

		byte[] signKey = getSignKey(jwtSecret);
		Claims claims = Jwts.parser().setSigningKey(signKey).parseClaimsJws(token).getBody();
		String userName = claims.get("userName", String.class);
		return userName;

	}

	public String getUserPasswordFromJwtToken(String token) {

		byte[] signKey = getSignKey(jwtSecret);
		Claims claims = Jwts.parser().setSigningKey(signKey).parseClaimsJws(token).getBody();
		String userName = claims.get("userPass", String.class);
		return userName;

	}
	
	public String getUserResponsibilityFromJwtToken(String token) {

		byte[] signKey = getSignKey(jwtSecret);
		Claims claims = Jwts.parser().setSigningKey(signKey).parseClaimsJws(token).getBody();
		
		ArrayList userResList = claims.get("profiles", ArrayList.class);
		if(userResList==null || userResList.size()==0) {
			return EMPTY;
		}
		HashMap userRes = (HashMap)userResList.get(0);
		String claimsRes = userRes.get("authority").toString();
		return claimsRes;

	}


	public String getUserEmpIdFromJwtToken(String token) {

		byte[] signKey = getSignKey(jwtSecret);
		Claims claims = Jwts.parser().setSigningKey(signKey).parseClaimsJws(token).getBody();
		String employeeId = claims.get("employeeId", String.class);

		return employeeId;

	}

	public boolean validateJwtToken(String authToken) {
		String jwtKey = jwtSecret;
		byte[] signKey = getSignKey(jwtKey);

		try {
			Jwts.parser().setSigningKey(signKey).parseClaimsJws(authToken);
			return true;
		} catch (SignatureException e) {
			LOG.error("Invalid JWT signature: {}", e.getMessage());
		} catch (MalformedJwtException e) {
			LOG.error("Invalid JWT token: {}", e.getMessage());
		} catch (ExpiredJwtException e) {
			LOG.error("JWT token is expired: {}", e.getMessage());
		} catch (UnsupportedJwtException e) {
			LOG.error("JWT token is unsupported: {}", e.getMessage());
		} catch (IllegalArgumentException e) {
			LOG.error("JWT claims string is empty: {}", e.getMessage());
		}

		return false;
	}

	// validate jwt portal
	public Jws<Claims> validateJwtPortal(String authToken) {

		byte[] signKey = getSignKey(jwtPortalSecret);
		Jws<Claims> jwsClaims = null;

		try {
			jwsClaims = Jwts.parser().setSigningKey(signKey).parseClaimsJws(authToken);
		} catch (SignatureException e) {
			LOG.error("Invalid JWT signature: {}", e.getMessage());
		} catch (MalformedJwtException e) {
			LOG.error("Invalid JWT token: {}", e.getMessage());
		} catch (ExpiredJwtException e) {
			LOG.error("JWT token is expired: {}", e.getMessage());
		} catch (UnsupportedJwtException e) {
			LOG.error("JWT token is unsupported: {}", e.getMessage());
		} catch (IllegalArgumentException e) {
			LOG.error("JWT claims string is empty: {}", e.getMessage());
		}

		return jwsClaims;
	}

	// extract user data
	public Map<String, Object> getUserDataPortal(Jws<Claims> jwsClaims) {

		Map<String, Object> payload = null;
		Claims claims = jwsClaims.getBody();

		if (claims != null) {

			Map<String, Object> rsrcMap = claims.get("resource", LinkedHashMap.class);
			String userName = (String) rsrcMap.get("alias");
			String empId = claims.get("employeeId", String.class);
			Date expiration = claims.get("exp", Date.class);

			payload = new LinkedHashMap();
			payload.put("userName", userName);
			payload.put("employeeId", empId);
			payload.put("tokenExp", expiration);
		}

		return payload;
	}

	// Getters and Setters

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
