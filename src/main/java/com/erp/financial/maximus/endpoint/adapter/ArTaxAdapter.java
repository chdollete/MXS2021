package com.erp.financial.maximus.endpoint.adapter;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.erp.financial.maximus.endpoint.dto.ArTaxDTO;
import com.erp.financial.maximus.entity.ArTxCd;
import com.erp.financial.maximus.exception.InvalidRequestException;

public class ArTaxAdapter {

	private static final Set<String> taxTypes = Set.of("INCLUSIVE","EXCLUSIVE","ZERO-RATED","EXEMPT","NONE");
	private static final String INVALID_TAX_TYPE="Invalid Tax Type.";
	
	public static final ArTxCd arTaxDTOtoEntityParser(ArTaxDTO taxDTO) throws ParseException{
		ArTxCd  tax = new ArTxCd();
		tax.setTcNm(taxDTO.getTaxName());
		tax.setTcDesc(taxDTO.getTaxDesc());
		String taxType = taxDTO.getTaxType().trim().toUpperCase();
		if(!taxTypes.contains(taxType)) {
			throw new InvalidRequestException(INVALID_TAX_TYPE);
		}
		tax.setTcTyp(taxType);
		tax.setTcRt(taxDTO.getTaxRate());
		tax.setTcEnbl((byte)taxDTO.getTaxEnable());
		tax.setTcAdCmpny(taxDTO.getTaxCmpCode());
		return tax;
	}
	
	public static final ArTaxDTO arTaxEntityToDTOParser(ArTxCd tax) {
		ArTaxDTO taxDTO = new ArTaxDTO();
		taxDTO.setTaxCode(tax.getTcCode());
		taxDTO.setTaxName(tax.getTcNm());
		taxDTO.setTaxDesc(tax.getTcDesc());
		taxDTO.setTaxType(tax.getTcTyp());
		taxDTO.setTaxRate(tax.getTcRt());
		taxDTO.setTaxCmpCode(tax.getTcAdCmpny());
		return taxDTO;
	}
	
	
	public static final List<ArTaxDTO> arTaxEntityListToDTOListParser(List<ArTxCd> taxList){
		List<ArTaxDTO> taxDTOList = new ArrayList<ArTaxDTO>();
		for (ArTxCd tax : taxList) {
			ArTaxDTO taxDTO = arTaxEntityToDTOParser(tax);
			taxDTOList.add(taxDTO);
		}
		return taxDTOList;
	}

}
