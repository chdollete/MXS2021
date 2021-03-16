package com.erp.financial.maximus.dao.impl.ar;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import com.erp.financial.maximus.dao.ArTaxDao;
import com.erp.financial.maximus.entity.ArTxCd;
import com.erp.financial.maximus.properties.ResponseProperties;
import com.erp.financial.maximus.services.impl.AdCompanyServiceImpl;

@Repository
public class ArTaxDaoImpl implements ArTaxDao {
	private static final Logger LOG = LoggerFactory.getLogger(ArTaxDaoImpl.class);

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private ResponseProperties respProperties;
	
	
	@Override
	public int saveTaxCode(ArTxCd tax) {
		em.persist(tax);
		return tax.getTcCode();
	}

	@Override
	public int updateTaxCode(ArTxCd tax) {
		int update=0;
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaUpdate<ArTxCd> criteriaUpdate = criteriaBuilder.createCriteriaUpdate(ArTxCd.class);
		Root<ArTxCd> root = criteriaUpdate.from(ArTxCd.class);
		criteriaUpdate.set(ArTxCd.TC_NAME,tax.getTcNm());
		criteriaUpdate.set(ArTxCd.TC_DESC,tax.getTcDesc());
		criteriaUpdate.set(ArTxCd.TC_TYPE,tax.getTcTyp());
		criteriaUpdate.set(ArTxCd.TC_RATE,tax.getTcRt());
		criteriaUpdate.set(ArTxCd.TC_ENABLE,tax.getTcEnbl());
		
		
		Predicate pred1 = criteriaBuilder.equal(root.get(ArTxCd.TC_CODE).as(Integer.class), tax.getTcCode());
		criteriaUpdate.where(pred1);
		update+=em.createQuery(criteriaUpdate).executeUpdate();
		return update;
	}

	@Override
	public ArTxCd getTaxCodeByTaxName(String taxName, int taxCmpCode) {
		CriteriaBuilder critBuilder = em.getCriteriaBuilder();
		CriteriaQuery<ArTxCd> critQuery = critBuilder.createQuery(ArTxCd.class);
		Root<ArTxCd> root = critQuery.from(ArTxCd.class);
		Predicate wherecriteria = null;
		Predicate predTaxName = critBuilder.equal(root.get(ArTxCd.TC_NAME), taxName);
		Predicate predTaxCmpCode = critBuilder.equal(root.get(ArTxCd.TC_CMP_CODE), taxCmpCode);
		wherecriteria = critBuilder.and(predTaxName,predTaxCmpCode);
		critQuery.select(root).where(wherecriteria);
		
		TypedQuery<ArTxCd> tq = em.createQuery(critQuery);
		ArTxCd tax = tq.getSingleResult();
		return tax;
	}

	@Override
	public List<ArTxCd> getTaxListByCmpCode(int taxCmpCode) {
		CriteriaBuilder critBuilder = em.getCriteriaBuilder();
		CriteriaQuery<ArTxCd> critQuery = critBuilder.createQuery(ArTxCd.class);
		Root<ArTxCd> root = critQuery.from(ArTxCd.class);
		Predicate wherecriteria = null;
		//Predicate predTaxName = critBuilder.equal(root.get(ArTxCd.TC_NAME), taxName);
		Predicate predTaxCmpCode = critBuilder.equal(root.get(ArTxCd.TC_CMP_CODE), taxCmpCode);
		wherecriteria = critBuilder.and(predTaxCmpCode);
		critQuery.select(root).where(wherecriteria);
		
		TypedQuery<ArTxCd> tq = em.createQuery(critQuery);
		List<ArTxCd> taxList = null;
		try {
			taxList = tq.getResultList();
		} catch (EmptyResultDataAccessException | NoResultException ex) {
			LOG.error(respProperties.getRecordNotFound() + " " + ex.getMessage());
		}
		return taxList;
	}

}
