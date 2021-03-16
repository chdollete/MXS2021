package com.erp.financial.maximus.dao;

import java.util.List;

import com.erp.financial.maximus.entity.ArTxCd;

public interface ArTaxDao {

	public int saveTaxCode(ArTxCd tax);
	public int updateTaxCode(ArTxCd tax);
	public ArTxCd getTaxCodeByTaxName(String taxName, int taxCmpCode);
	public List<ArTxCd> getTaxListByCmpCode(int taxCmpCode);
	
}
