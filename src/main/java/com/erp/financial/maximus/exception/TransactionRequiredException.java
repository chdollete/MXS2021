package com.erp.financial.maximus.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class TransactionRequiredException extends RuntimeException{

	private static final long serialVersionUID = 1423535886406235469L;

	public TransactionRequiredException(String message) {
		super(message);
	}

}
