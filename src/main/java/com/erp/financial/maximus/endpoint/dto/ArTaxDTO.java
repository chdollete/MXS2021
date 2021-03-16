package com.erp.financial.maximus.endpoint.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ArTaxDTO {

	@JsonInclude(value = Include.ALWAYS)
	private int taxCode;
	@JsonInclude(value = Include.ALWAYS)
	private String taxName;
	@JsonInclude(value = Include.ALWAYS)
	private String taxDesc;
	@JsonInclude(value = Include.ALWAYS)
	private String taxType;
	@JsonInclude(value = Include.ALWAYS)
	private double taxRate;
	@JsonInclude(value = Include.ALWAYS)
	private int taxEnable;
	@JsonInclude(value = Include.ALWAYS)
	private int taxCmpCode;
	@JsonInclude(value = Include.ALWAYS)
	private String taxCmpShortName;

	public int getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(int taxCode) {
		this.taxCode = taxCode;
	}

	public String getTaxName() {
		return taxName;
	}

	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

	public String getTaxDesc() {
		return taxDesc;
	}

	public void setTaxDesc(String taxDesc) {
		this.taxDesc = taxDesc;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public int getTaxEnable() {
		return taxEnable;
	}

	public void setTaxEnable(int taxEnable) {
		this.taxEnable = taxEnable;
	}

	public int getTaxCmpCode() {
		return taxCmpCode;
	}

	public void setTaxCmpCode(int taxCmpCode) {
		this.taxCmpCode = taxCmpCode;
	}

	public String getTaxCmpShortName() {
		return taxCmpShortName;
	}

	public void setTaxCmpShortName(String taxCmpShortName) {
		this.taxCmpShortName = taxCmpShortName;
	}

}
