package com.erp.financial.maximus.config.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.erp.financial.maximus.config.security.impl.UserDetailsServiceImpl;

/**
 * a filter that executes once per request
 */
public class AuthTokenFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private UserDetailsServiceImpl userDetailsService;

	// private static final String allowedResponsibility = "ROLE_ADMINISTRATOR";

	private static final Logger LOG = LoggerFactory.getLogger(AuthTokenFilter.class);
	private static final String XSALAUTHORIZATION = "X-SAL-Authorization";

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		try {
			String jwt = jwtUtil.parseJwt(request.getHeader(XSALAUTHORIZATION));

			if (jwt != null && jwtUtil.validateJwtToken(jwt)) {
				// String employeeId = jwtUtil.getUserEmpIdFromJwtToken(jwt);
				String userName = jwtUtil.getUserNameFromJwtToken(jwt);
				//String userPassword = jwtUtil.getUserPasswordFromJwtToken(jwt);
				String userResponsibility = jwtUtil.getUserResponsibilityFromJwtToken(jwt);
				UserDetails userDetails = userDetailsService.loadUserByUserResponsibillty(userName, userResponsibility);

				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());
				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

				SecurityContextHolder.getContext().setAuthentication(authentication);
			}

		} catch (Exception e) {
			LOG.error("Cannot set user authentication: {}", e.getMessage());
		}

		try {
			filterChain.doFilter(request, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
