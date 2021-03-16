package com.erp.financial.maximus.config.security.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.financial.maximus.entity.AdUsr;

@Service("userDetailsService")
@Lazy
public class UserDetailsServiceImpl implements UserDetailsService {
	

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		/* Commented lines retained for future reference */
//		UserSalarios user = userSalariosDao.findByUsername(userName);
//		return UserDetailsImpl.build(user);
		return null;
	}
	
	
	@Transactional
	public UserDetails loadUserByUserEmpId(String userName, String userPass) throws UsernameNotFoundException {
		
		//UserSalarios user = userSalariosDao.findByEmployeeId(manId);
		AdUsr user = new AdUsr();
		user.setUsrCode(1);
		user.setUsrNm(userName);
		user.setUsrPstn("ROLE_ADMINISTRATOR");
		user.setUsrPsswrd("admin1");
		return UserDetailsImpl.build(user, userName);
	}
	
	@Transactional
	public UserDetails loadUserByUserResponsibillty(String userName, String userResponsibity) throws UsernameNotFoundException {
		AdUsr user = new AdUsr();
		user.setUsrCode(1);
		user.setUsrNm(userName);
		user.setUsrPstn(userResponsibity);
		return UserDetailsImpl.build(user, userName);
	}

}
