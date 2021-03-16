package com.erp.financial.maximus.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_GATEWAY)
public class MessagingException  extends RuntimeException{

	private static final long serialVersionUID = 9206430130639007867L;
	
	public MessagingException(String message) {
		super(message);
	}

}
