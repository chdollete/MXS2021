package com.erp.financial.maximus.services.impl;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.financial.maximus.dao.ArTaxDao;
import com.erp.financial.maximus.entity.ArTxCd;
import com.erp.financial.maximus.exception.InvalidRequestException;
import com.erp.financial.maximus.services.ArTaxService;


@Service("arTaxService")
@Transactional
@Lazy
public class ArTaxServiceImpl implements ArTaxService {

	@Autowired
	private ArTaxDao taxDao;
	
	private static final String TAXNAME_ALREADY_EXIST="Tax Name was already Exist.";
	
	@Override
	public int createTax(ArTxCd tax) throws DataIntegrityViolationException {
		int taxCode = 0;
		try {
			ArTxCd existingTax = taxDao.getTaxCodeByTaxName(tax.getTcNm(), tax.getTcAdCmpny());
			if(existingTax==null) {
				taxCode = taxDao.saveTaxCode(tax);
			}else {
				throw new InvalidRequestException(TAXNAME_ALREADY_EXIST);
			}
			
			
		} catch (DataIntegrityViolationException e) {
			throw new InvalidRequestException(e.getMessage());
		}
		return taxCode;
	}

	@Override
	public void updateTax(ArTxCd tax) {
		try {
			taxDao.updateTaxCode(tax);
		} catch (Exception e) {
			throw new InvalidRequestException(e.getMessage());
		}

	}

	@Override
	public ArTxCd findArTaxbyTaxName(String taxName, int taxCmpCode) {
		ArTxCd tax= null;
		try {
			tax = taxDao.getTaxCodeByTaxName(taxName, taxCmpCode);
		} catch (NoResultException e) {
			throw new NoResultException();
		}
		return tax;
	}

	@Override
	public List<ArTxCd> findArTaxListByCmpCode(int taxCmpCode) {
		List<ArTxCd> taxList = null;
		try {
			taxList = taxDao.getTaxListByCmpCode(taxCmpCode);
		} catch (NoResultException e) {
			throw new NoResultException();
		}
		return taxList;
	}

}
