package com.erp.financial.maximus.services;

import org.springframework.dao.DataIntegrityViolationException;

import com.erp.financial.maximus.entity.AdCmpny;

public interface AdCompanyService {

	public int createCompany(AdCmpny cmp) throws DataIntegrityViolationException;
	public int updateCompanyDetailsByCmpShrtName(AdCmpny cmp);
	public AdCmpny getCompanyDetailsbyCmpShrtName(String smpShrtName);
}
