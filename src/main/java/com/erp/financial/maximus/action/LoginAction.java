package com.erp.financial.maximus.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginAction {
	
	@Autowired 
	private Environment env;
	 
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
}
