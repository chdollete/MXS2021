package com.erp.financial.maximus.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.financial.maximus.dao.AdCompanyDao;
import com.erp.financial.maximus.entity.AdCmpny;
import com.erp.financial.maximus.exception.InvalidRequestException;
import com.erp.financial.maximus.services.AdCompanyService;

@Service("adCompanyService")
@Transactional
@Lazy
public class AdCompanyServiceImpl implements AdCompanyService {
	private static final Logger LOG = LoggerFactory.getLogger(AdCompanyServiceImpl.class);

	@Autowired
	private AdCompanyDao cmpDao;
	
	private String WELCOME_NOTE="WELCOME to ";
	
	@Override
	public int createCompany(AdCmpny cmp) throws DataIntegrityViolationException {
		int cmpCode = 0;
		try {
			cmp.setCmpWlcmNt(WELCOME_NOTE+cmp.getCmpDesc());
			cmp.setCmpRtndEarnngs("00000");
			cmpCode = cmpDao.createCompany(cmp);
		} catch (DataIntegrityViolationException e) {
			throw new InvalidRequestException(e.getMessage());
		}
		return cmpCode;
	}

	@Override
	public int updateCompanyDetailsByCmpShrtName(AdCmpny cmp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AdCmpny getCompanyDetailsbyCmpShrtName(String smpShrtName) {
		// TODO Auto-generated method stub
		return null;
	}

}
