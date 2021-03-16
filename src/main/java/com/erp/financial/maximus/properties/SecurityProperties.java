package com.erp.financial.maximus.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:messages_en.properties")
@ConfigurationProperties("security")
public class SecurityProperties {
	
	private String unAuthMessage;
	private String unAuthDescription;
	
	//Getters and Setters
	public String getUnAuthMessage() {
		return unAuthMessage;
	}
	public void setUnAuthMessage(String unAuthMessage) {
		this.unAuthMessage = unAuthMessage;
	}
	public String getUnAuthDescription() {
		return unAuthDescription;
	}
	public void setUnAuthDescription(String unAuthDescription) {
		this.unAuthDescription = unAuthDescription;
	}
	
	

}
