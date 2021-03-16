package com.erp.financial.maximus.config.security.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.erp.financial.maximus.entity.AdRspnsblty;
import com.erp.financial.maximus.entity.AdUsr;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsImpl implements UserDetails{
	/**
	 * auto-generated serialId
	 */
	private static final long serialVersionUID = 7678513016185082282L;
	private static final String EMPTY = "";
	private int id;
	private String username;
	private String empId;
	@JsonIgnore
	private static Set<AdRspnsblty> profiles;
	private Collection<? extends GrantedAuthority> authorities;
	
	
	public static UserDetailsImpl build(AdUsr user, String userResponsibility) {
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		AdRspnsblty userResponsibilty = new AdRspnsblty();
		userResponsibilty.setRsNm(user.getUsrPstn());
		profiles = new HashSet<AdRspnsblty>();
		profiles.add(userResponsibilty);
		for (AdRspnsblty responsibilty : profiles){
			SimpleGrantedAuthority sga = new SimpleGrantedAuthority(responsibilty.getRsNm());
			authorities.add(sga);
		}
		/*
		return new UserDetailsImpl(
				user.getId(), 
				user.getManId(),
				userName,
				user.getProfiles(), 
				authorities);
		*/
		
		return new UserDetailsImpl(
				1, 
				user.getUsrCode()+"",
				user.getUsrNm(),
				profiles, 
				authorities);
	}
	
	public UserDetailsImpl(int id, String empId, String username, 
			Set<AdRspnsblty> profiles, Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.empId = empId;
		this.username = username;
		this.profiles = profiles;
		this.authorities = authorities;
	}

	//Overriden methods

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsImpl user = (UserDetailsImpl) o;
		boolean eql = Objects.equals(id, user.id);
		return eql;
	}

	public int getId() {
		return id;
	}

	public String getEmpId() {
		return empId;
	}

	public Set<AdRspnsblty> getProfiles() {
		return profiles;
	}

}
