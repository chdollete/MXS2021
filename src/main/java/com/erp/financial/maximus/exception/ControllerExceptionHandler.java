package com.erp.financial.maximus.exception;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.erp.financial.maximus.endpoint.dto.ResponseMessageDTO;
import com.erp.financial.maximus.properties.ResponseProperties;
import com.erp.financial.maximus.properties.SecurityProperties;

@ControllerAdvice
@ResponseBody
public class ControllerExceptionHandler {
	
	@Autowired
	private ResponseProperties responseProperties;
	
	@Autowired
	private SecurityProperties securityProperties;
	
	private static final String ERROR = "Error";
	private static final String ERROR_UNCONTROLLED = "MAXIMUS INTERNAL SERVER ERROR";
	private static final Logger LOG = LoggerFactory.getLogger(ControllerExceptionHandler.class);

	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<ResponseMessageDTO> recordNotFoundException(RecordNotFoundException ex, WebRequest request) {
		ResponseMessageDTO message = new ResponseMessageDTO(
		HttpStatus.NOT_FOUND.value(),
		new Date(),
		ex.getMessage(),
		request.getDescription(false),
		ERROR);

		return new ResponseEntity<ResponseMessageDTO>(message, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(PersistenceException.class)
	public ResponseEntity<ResponseMessageDTO> persistenceException(PersistenceException ex, WebRequest request) {
		ResponseMessageDTO message = new ResponseMessageDTO(
		HttpStatus.INTERNAL_SERVER_ERROR.value(),
		new Date(),
		ex.getMessage(),
		request.getDescription(false),
		ERROR);

		return new ResponseEntity<ResponseMessageDTO>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(TransactionRequiredException.class)
	public ResponseEntity<ResponseMessageDTO> transactionRequiredException(TransactionRequiredException ex, WebRequest request) {
		ResponseMessageDTO message = new ResponseMessageDTO(
		HttpStatus.INTERNAL_SERVER_ERROR.value(),
		new Date(),
		ex.getMessage(),
		request.getDescription(false),
		ERROR);

		return new ResponseEntity<ResponseMessageDTO>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(InvalidRequestException.class)
	public ResponseEntity<ResponseMessageDTO> invalidRequestException(InvalidRequestException ex, WebRequest request) {
		ResponseMessageDTO message = new ResponseMessageDTO(
		HttpStatus.BAD_REQUEST.value(),
		new Date(),
		ex.getMessage(),
		request.getDescription(false),
		ERROR);

		return new ResponseEntity<ResponseMessageDTO>(message, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(RecordAlreadyExistsException.class)
	public ResponseEntity<ResponseMessageDTO> recordAlreadyExistsException(RecordAlreadyExistsException ex, WebRequest request) {
		ResponseMessageDTO message = new ResponseMessageDTO(
				HttpStatus.PRECONDITION_FAILED.value(),
				new Date(),
				ex.getMessage(),
				request.getDescription(false),
				ERROR);

		return new ResponseEntity<ResponseMessageDTO>(message, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<ResponseMessageDTO> httpMessageNotReadableException(HttpMessageNotReadableException ex, WebRequest request) {

		ResponseMessageDTO message = new ResponseMessageDTO(
		HttpStatus.BAD_REQUEST.value(),
		new Date(),
		ex.getMessage().substring(0, 121),
		request.getDescription(false),
		ERROR);

		return new ResponseEntity<ResponseMessageDTO>(message, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseMessageDTO> methodArgumentNotValidException(MethodArgumentNotValidException ex, WebRequest request) {

		//Get all errors
        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(x -> x.getDefaultMessage())
                .collect(Collectors.toList());

		ResponseMessageDTO message = new ResponseMessageDTO(
		HttpStatus.BAD_REQUEST.value(),
		new Date(),
		responseProperties.getInvalidRequestBodyFormat(),
		errors,
		ERROR);

		return new ResponseEntity<ResponseMessageDTO>(message, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AccessDeniedException.class)
	public ResponseEntity<ResponseMessageDTO> accessDeniedException(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accDeniedEx) throws IOException, ServletException {
		
		String msg = accDeniedEx.getMessage();
		String desc = securityProperties.getUnAuthDescription();
		
		ResponseMessageDTO message = new ResponseMessageDTO(
		HttpStatus.UNAUTHORIZED.value(),
		new Date(),
		msg,
		desc,
		ERROR);

		LOG.error("Unauthorized error: {}", accDeniedEx.getMessage());
		return new ResponseEntity<ResponseMessageDTO>(message, HttpStatus.UNAUTHORIZED);
	}

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<ResponseMessageDTO> dataIntegrityViolationException(DataIntegrityViolationException ex, WebRequest request) {

		ResponseMessageDTO message = new ResponseMessageDTO(
				HttpStatus.BAD_REQUEST.value(),
				new Date(),
				responseProperties.getDataIntegrityError(),
				request.getDescription(false),
				ERROR);

				return new ResponseEntity<ResponseMessageDTO>(message, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MessagingException.class)
	public ResponseEntity<ResponseMessageDTO> messagingException(MessagingException ex, WebRequest request) {

		ResponseMessageDTO message = new ResponseMessageDTO(
				HttpStatus.BAD_GATEWAY.value(),
				new Date(),
				responseProperties.getEmailBlastError(),
				request.getDescription(false),
				ERROR);

				return new ResponseEntity<ResponseMessageDTO>(message, HttpStatus.BAD_GATEWAY);
	}


	/**
	 * Captures all uncontrolled Exceptions
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ResponseEntity<ResponseMessageDTO>  defaultErrorHandlerException(final HttpServletRequest request, 
			final HttpServletResponse response, final Exception e) {

		LOG.error(e.getMessage(), e);

		int statusCode = HttpStatus.INTERNAL_SERVER_ERROR.value();
		Date timestamp = Calendar.getInstance().getTime();
		String message = e.toString(); 
		String description = ERROR_UNCONTROLLED;
		String type = ERROR;

		ResponseMessageDTO responseMessage = new ResponseMessageDTO(statusCode, timestamp, message, description, type);

		return new ResponseEntity<ResponseMessageDTO>(responseMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
