package com.erp.financial.maximus.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidRequestException extends RuntimeException{

	private static final long serialVersionUID = 4892650086711733695L;

	public InvalidRequestException(String message) {
		super(message);
	}
	
	public InvalidRequestException() {
		super();
	}

}
