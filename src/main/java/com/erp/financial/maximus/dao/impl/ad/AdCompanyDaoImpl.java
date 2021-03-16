package com.erp.financial.maximus.dao.impl.ad;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.erp.financial.maximus.dao.AdCompanyDao;
import com.erp.financial.maximus.entity.AdCmpny;

@Repository
public class AdCompanyDaoImpl implements AdCompanyDao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public int createCompany(AdCmpny cmp) {
		em.persist(cmp);
		return cmp.getCmpCode();
	}

	@Override
	public int updateCompany(AdCmpny cmp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AdCmpny findCompanyByCmpShrtName(String cmpShrtName) {
		// TODO Auto-generated method stub
		return null;
	}

}
