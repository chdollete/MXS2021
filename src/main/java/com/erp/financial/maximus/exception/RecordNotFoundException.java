package com.erp.financial.maximus.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 3384056482119002822L;

	public RecordNotFoundException(String message) {
		super(message);
	}

}
