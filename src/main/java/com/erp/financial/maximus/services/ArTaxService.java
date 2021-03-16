package com.erp.financial.maximus.services;

import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;

import com.erp.financial.maximus.entity.ArTxCd;

public interface ArTaxService {
	
	public int createTax(ArTxCd tax) throws DataIntegrityViolationException;
	public void updateTax(ArTxCd tax);
	public ArTxCd findArTaxbyTaxName(String taxName, int taxCmpCode);
	public List<ArTxCd> findArTaxListByCmpCode(int taxCmpCode);

}
