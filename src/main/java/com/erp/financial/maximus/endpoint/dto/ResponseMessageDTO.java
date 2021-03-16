package com.erp.financial.maximus.endpoint.dto;

import java.util.Date;
import java.util.List;

public class ResponseMessageDTO {
	private int statusCode;
	private Date timestamp;
	private String message;
	private String description;
	private String type;
	List<String> descriptions;

	public ResponseMessageDTO() {

	}

	public ResponseMessageDTO(int statusCode, Date timestamp, String message, String description, String type) {
		this.statusCode = statusCode;
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
		this.type = type;
	}

	public ResponseMessageDTO(int statusCode, Date timestamp, String message, List<String> descriptions, String type) {
		this.statusCode = statusCode;
		this.timestamp = timestamp;
		this.message = message;
		this.descriptions = descriptions;
		this.type = type;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<String> descriptions) {
		this.descriptions = descriptions;
	}
}
