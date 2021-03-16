package com.erp.financial.maximus.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class PersistenceException extends RuntimeException{

	private static final long serialVersionUID = 1423535886406235469L;

	public PersistenceException(String message) {
		super(message);
	}

}
