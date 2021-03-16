package com.erp.financial.maximus.endpoint.dto;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class AdCompanyDTO {

	@JsonInclude(value = Include.ALWAYS)
	private int cmpCode;
	@NotNull
	@JsonInclude(value = Include.ALWAYS)
	private String cmpShortName;
	@JsonInclude(value = Include.ALWAYS)
	private String cmpName;
	@JsonInclude(value = Include.ALWAYS)
	private String cmpDescription;
	@JsonInclude(value = Include.ALWAYS)
	private String cmpTin;
	@JsonInclude(value = Include.ALWAYS)
	private String cmpZipCode;
	@JsonInclude(value = Include.ALWAYS)
	private String cmpIndustry;

	public int getCmpCode() {
		return cmpCode;
	}

	public void setCmpCode(int cmpCode) {
		this.cmpCode = cmpCode;
	}

	public String getCmpShortName() {
		return cmpShortName;
	}

	public void setCmpShortName(String cmpShortName) {
		this.cmpShortName = cmpShortName;
	}

	public String getCmpName() {
		return cmpName;
	}

	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}

	public String getCmpDescription() {
		return cmpDescription;
	}

	public void setCmpDescription(String cmpDescription) {
		this.cmpDescription = cmpDescription;
	}

	public String getCmpTin() {
		return cmpTin;
	}

	public void setCmpTin(String cmpTin) {
		this.cmpTin = cmpTin;
	}

	public String getCmpZipCode() {
		return cmpZipCode;
	}

	public void setCmpZipCode(String cmpZipCode) {
		this.cmpZipCode = cmpZipCode;
	}

	public String getCmpIndustry() {
		return cmpIndustry;
	}

	public void setCmpIndustry(String cmpIndustry) {
		this.cmpIndustry = cmpIndustry;
	}

	
}
