package com.erp.financial.maximus.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class AccessDeniedException extends RuntimeException{

	private static final long serialVersionUID = -4431437481534724567L;

	public AccessDeniedException(String message) {
		super(message);
	}

}
