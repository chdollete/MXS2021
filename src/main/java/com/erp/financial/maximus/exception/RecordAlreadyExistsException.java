package com.erp.financial.maximus.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
public class RecordAlreadyExistsException extends RuntimeException{

	private static final long serialVersionUID = -7080695658202648143L;

	public RecordAlreadyExistsException(String message) {
		super(message);
	}

}
