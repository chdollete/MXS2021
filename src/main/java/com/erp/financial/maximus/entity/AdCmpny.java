package com.erp.financial.maximus.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ad_cmpny database table.
 * 
 */
@Entity
@Table(name="ad_cmpny")
@NamedQuery(name="AdCmpny.findAll", query="SELECT a FROM AdCmpny a")
public class AdCmpny implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CMP_CODE", unique=true, nullable=false)
	private int cmpCode;

	@Column(name="CMP_ADDRSS", length=255)
	private String cmpAddrss;

	@Column(name="CMP_CNTRY", length=25)
	private String cmpCntry;

	@Column(name="CMP_CTY", length=50)
	private String cmpCty;

	@Column(name="CMP_DESC", length=50)
	private String cmpDesc;

	@Column(name="CMP_EML", length=25)
	private String cmpEml;

	@Column(name="CMP_FX", length=15)
	private String cmpFx;

	@Column(name="CMP_INDSTRY", length=25)
	private String cmpIndstry;

	@Column(name="CMP_NM", nullable=false, length=50)
	private String cmpNm;

	@Column(name="CMP_PHN", length=15)
	private String cmpPhn;

	@Column(name="CMP_RTND_EARNNGS", nullable=false, length=100)
	private String cmpRtndEarnngs;

	@Column(name="CMP_SHRT_NM", nullable=false, length=25)
	private String cmpShrtNm;

	@Column(name="CMP_TIN", length=25)
	private String cmpTin;

	@Column(name="CMP_WLCM_NT", length=50)
	private String cmpWlcmNt;

	@Column(name="CMP_ZP", length=10)
	private String cmpZp;

	@Column(name="GEN_FIELD")
	private int genField;

	@Column(name="GL_FUNCTIONAL_CURRENCY")
	private int glFunctionalCurrency;

	public AdCmpny() {
	}

	public int getCmpCode() {
		return this.cmpCode;
	}

	public void setCmpCode(int cmpCode) {
		this.cmpCode = cmpCode;
	}

	public String getCmpAddrss() {
		return this.cmpAddrss;
	}

	public void setCmpAddrss(String cmpAddrss) {
		this.cmpAddrss = cmpAddrss;
	}

	public String getCmpCntry() {
		return this.cmpCntry;
	}

	public void setCmpCntry(String cmpCntry) {
		this.cmpCntry = cmpCntry;
	}

	public String getCmpCty() {
		return this.cmpCty;
	}

	public void setCmpCty(String cmpCty) {
		this.cmpCty = cmpCty;
	}

	public String getCmpDesc() {
		return this.cmpDesc;
	}

	public void setCmpDesc(String cmpDesc) {
		this.cmpDesc = cmpDesc;
	}

	public String getCmpEml() {
		return this.cmpEml;
	}

	public void setCmpEml(String cmpEml) {
		this.cmpEml = cmpEml;
	}

	public String getCmpFx() {
		return this.cmpFx;
	}

	public void setCmpFx(String cmpFx) {
		this.cmpFx = cmpFx;
	}

	public String getCmpIndstry() {
		return this.cmpIndstry;
	}

	public void setCmpIndstry(String cmpIndstry) {
		this.cmpIndstry = cmpIndstry;
	}

	public String getCmpNm() {
		return this.cmpNm;
	}

	public void setCmpNm(String cmpNm) {
		this.cmpNm = cmpNm;
	}

	public String getCmpPhn() {
		return this.cmpPhn;
	}

	public void setCmpPhn(String cmpPhn) {
		this.cmpPhn = cmpPhn;
	}

	public String getCmpRtndEarnngs() {
		return this.cmpRtndEarnngs;
	}

	public void setCmpRtndEarnngs(String cmpRtndEarnngs) {
		this.cmpRtndEarnngs = cmpRtndEarnngs;
	}

	public String getCmpShrtNm() {
		return this.cmpShrtNm;
	}

	public void setCmpShrtNm(String cmpShrtNm) {
		this.cmpShrtNm = cmpShrtNm;
	}

	public String getCmpTin() {
		return this.cmpTin;
	}

	public void setCmpTin(String cmpTin) {
		this.cmpTin = cmpTin;
	}

	public String getCmpWlcmNt() {
		return this.cmpWlcmNt;
	}

	public void setCmpWlcmNt(String cmpWlcmNt) {
		this.cmpWlcmNt = cmpWlcmNt;
	}

	public String getCmpZp() {
		return this.cmpZp;
	}

	public void setCmpZp(String cmpZp) {
		this.cmpZp = cmpZp;
	}

	public int getGenField() {
		return this.genField;
	}

	public void setGenField(int genField) {
		this.genField = genField;
	}

	public int getGlFunctionalCurrency() {
		return this.glFunctionalCurrency;
	}

	public void setGlFunctionalCurrency(int glFunctionalCurrency) {
		this.glFunctionalCurrency = glFunctionalCurrency;
	}

}