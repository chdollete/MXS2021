package com.erp.financial.maximus.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:messages_en.properties")
@ConfigurationProperties("response")
public class ResponseProperties {
	
	private String invalidRequestBodyFormat;
	private String recordAlreadyExists;
	private String recordNotFound;
	private String noResultsFound;
	private String dataIntegrityError;
	private String errorUncontrolled;
	private String typeSuccess;
	private String typeError;
	private String emailBlastError;
	
	//Getters and Setters
	
	public String getInvalidRequestBodyFormat() {
		return invalidRequestBodyFormat;
	}
	public void setInvalidRequestBodyFormat(String invalidRequestBodyFormat) {
		this.invalidRequestBodyFormat = invalidRequestBodyFormat;
	}
	public String getRecordAlreadyExists() {
		return recordAlreadyExists;
	}
	public void setRecordAlreadyExists(String recordAlreadyExists) {
		this.recordAlreadyExists = recordAlreadyExists;
	}
	public String getRecordNotFound() {
		return recordNotFound;
	}
	public void setRecordNotFound(String recordNotFound) {
		this.recordNotFound = recordNotFound;
	}
	public String getErrorUncontrolled() {
		return errorUncontrolled;
	}
	public void setErrorUncontrolled(String errorUncontrolled) {
		this.errorUncontrolled = errorUncontrolled;
	}
	public String getTypeSuccess() {
		return typeSuccess;
	}
	public void setTypeSuccess(String typeSuccess) {
		this.typeSuccess = typeSuccess;
	}
	public String getTypeError() {
		return typeError;
	}
	public void setTypeError(String typeError) {
		this.typeError = typeError;
	}
	public String getEmailBlastError() {
		return emailBlastError;
	}
	public void setEmailBlastError(String emailBlastError) {
		this.emailBlastError = emailBlastError;
	}
	public String getNoResultsFound() {
		return noResultsFound;
	}
	public void setNoResultsFound(String noResultsFound) {
		this.noResultsFound = noResultsFound;
	}
	public String getDataIntegrityError() {
		return dataIntegrityError;
	}
	public void setDataIntegrityError(String dataIntegrityError) {
		this.dataIntegrityError = dataIntegrityError;
	}
}
