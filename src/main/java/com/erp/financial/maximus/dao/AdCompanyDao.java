package com.erp.financial.maximus.dao;

import com.erp.financial.maximus.entity.AdCmpny;

public interface AdCompanyDao {

	public int createCompany(AdCmpny cmp);
	public int updateCompany(AdCmpny cmp);
	public AdCmpny findCompanyByCmpShrtName(String cmpShrtName);
}
