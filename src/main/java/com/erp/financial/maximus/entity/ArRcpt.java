package com.erp.financial.maximus.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ar_rcpt database table.
 * 
 */
@Entity
@Table(name="ar_rcpt")
@NamedQuery(name="ArRcpt.findAll", query="SELECT a FROM ArRcpt a")
public class ArRcpt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RCT_CODE", unique=true, nullable=false)
	private int rctCode;

	@Column(name="AD_BANK_ACCOUNT")
	private int adBankAccount;

	@Column(name="AR_CUSTOMER")
	private int arCustomer;

	@Column(name="AR_RECEIPT_BATCH")
	private int arReceiptBatch;

	@Column(name="AR_SALESPERSON")
	private int arSalesperson;

	@Column(name="AR_TAX_CODE")
	private int arTaxCode;

	@Column(name="AR_WITHHOLDING_TAX_CODE")
	private int arWithholdingTaxCode;

	@Column(name="GL_FUNCTIONAL_CURRENCY")
	private int glFunctionalCurrency;

	@Column(name="RCT_AD_BRNCH", nullable=false)
	private int rctAdBrnch;

	@Column(name="RCT_AD_CMPNY", nullable=false)
	private int rctAdCmpny;

	@Column(name="RCT_AMNT")
	private double rctAmnt;

	@Column(name="RCT_APPLD_DPST")
	private double rctAppldDpst;

	@Column(name="RCT_APPRVD_RJCTD_BY", length=25)
	private String rctApprvdRjctdBy;

	@Column(name="RCT_APPRVL_STATUS", length=15)
	private String rctApprvlStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RCT_CNVRSN_DT")
	private Date rctCnvrsnDt;

	@Column(name="RCT_CNVRSN_RT")
	private double rctCnvrsnRt;

	@Column(name="RCT_CRD_NMBR", length=25)
	private String rctCrdNmbr;

	@Column(name="RCT_CRTD_BY", length=25)
	private String rctCrtdBy;

	@Column(name="RCT_CST_NM", length=255)
	private String rctCstNm;

	@Column(name="RCT_CSTMR_DPST")
	private byte rctCstmrDpst;

	@Column(name="RCT_DESC", length=250)
	private String rctDesc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RCT_DT")
	private Date rctDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RCT_DT_APPRVD_RJCTD")
	private Date rctDtApprvdRjctd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RCT_DT_CRTD")
	private Date rctDtCrtd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RCT_DT_LST_MDFD")
	private Date rctDtLstMdfd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RCT_DT_PSTD")
	private Date rctDtPstd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RCT_DT_RCNCLD")
	private Date rctDtRcncld;

	@Column(name="RCT_LCK")
	private byte rctLck;

	@Column(name="RCT_LST_MDFD_BY", length=25)
	private String rctLstMdfdBy;

	@Column(name="RCT_LV_SHFT", length=25)
	private String rctLvShft;

	@Column(name="RCT_NMBR", length=25)
	private String rctNmbr;

	@Column(name="RCT_PRNTD")
	private byte rctPrntd;

	@Column(name="RCT_PSTD")
	private byte rctPstd;

	@Column(name="RCT_PSTD_BY", length=25)
	private String rctPstdBy;

	@Column(name="RCT_PYMNT_MTHD", length=25)
	private String rctPymntMthd;

	@Column(name="RCT_RCNCLD")
	private byte rctRcncld;

	@Column(name="RCT_RFRNC_NMBR", length=25)
	private String rctRfrncNmbr;

	@Column(name="RCT_RSN_FR_RJCTN", length=100)
	private String rctRsnFrRjctn;

	@Column(name="RCT_SBJCT_TO_CMMSSN")
	private byte rctSbjctToCmmssn;

	@Column(name="RCT_SLD_TO", length=25)
	private String rctSldTo;

	@Column(name="RCT_TYP", length=15)
	private String rctTyp;

	@Column(name="RCT_VD")
	private byte rctVd;

	@Column(name="RCT_VD_APPRVL_STATUS", length=15)
	private String rctVdApprvlStatus;

	@Column(name="RCT_VD_PSTD")
	private byte rctVdPstd;

	public ArRcpt() {
	}

	public int getRctCode() {
		return this.rctCode;
	}

	public void setRctCode(int rctCode) {
		this.rctCode = rctCode;
	}

	public int getAdBankAccount() {
		return this.adBankAccount;
	}

	public void setAdBankAccount(int adBankAccount) {
		this.adBankAccount = adBankAccount;
	}

	public int getArCustomer() {
		return this.arCustomer;
	}

	public void setArCustomer(int arCustomer) {
		this.arCustomer = arCustomer;
	}

	public int getArReceiptBatch() {
		return this.arReceiptBatch;
	}

	public void setArReceiptBatch(int arReceiptBatch) {
		this.arReceiptBatch = arReceiptBatch;
	}

	public int getArSalesperson() {
		return this.arSalesperson;
	}

	public void setArSalesperson(int arSalesperson) {
		this.arSalesperson = arSalesperson;
	}

	public int getArTaxCode() {
		return this.arTaxCode;
	}

	public void setArTaxCode(int arTaxCode) {
		this.arTaxCode = arTaxCode;
	}

	public int getArWithholdingTaxCode() {
		return this.arWithholdingTaxCode;
	}

	public void setArWithholdingTaxCode(int arWithholdingTaxCode) {
		this.arWithholdingTaxCode = arWithholdingTaxCode;
	}

	public int getGlFunctionalCurrency() {
		return this.glFunctionalCurrency;
	}

	public void setGlFunctionalCurrency(int glFunctionalCurrency) {
		this.glFunctionalCurrency = glFunctionalCurrency;
	}

	public int getRctAdBrnch() {
		return this.rctAdBrnch;
	}

	public void setRctAdBrnch(int rctAdBrnch) {
		this.rctAdBrnch = rctAdBrnch;
	}

	public int getRctAdCmpny() {
		return this.rctAdCmpny;
	}

	public void setRctAdCmpny(int rctAdCmpny) {
		this.rctAdCmpny = rctAdCmpny;
	}

	public double getRctAmnt() {
		return this.rctAmnt;
	}

	public void setRctAmnt(double rctAmnt) {
		this.rctAmnt = rctAmnt;
	}

	public double getRctAppldDpst() {
		return this.rctAppldDpst;
	}

	public void setRctAppldDpst(double rctAppldDpst) {
		this.rctAppldDpst = rctAppldDpst;
	}

	public String getRctApprvdRjctdBy() {
		return this.rctApprvdRjctdBy;
	}

	public void setRctApprvdRjctdBy(String rctApprvdRjctdBy) {
		this.rctApprvdRjctdBy = rctApprvdRjctdBy;
	}

	public String getRctApprvlStatus() {
		return this.rctApprvlStatus;
	}

	public void setRctApprvlStatus(String rctApprvlStatus) {
		this.rctApprvlStatus = rctApprvlStatus;
	}

	public Date getRctCnvrsnDt() {
		return this.rctCnvrsnDt;
	}

	public void setRctCnvrsnDt(Date rctCnvrsnDt) {
		this.rctCnvrsnDt = rctCnvrsnDt;
	}

	public double getRctCnvrsnRt() {
		return this.rctCnvrsnRt;
	}

	public void setRctCnvrsnRt(double rctCnvrsnRt) {
		this.rctCnvrsnRt = rctCnvrsnRt;
	}

	public String getRctCrdNmbr() {
		return this.rctCrdNmbr;
	}

	public void setRctCrdNmbr(String rctCrdNmbr) {
		this.rctCrdNmbr = rctCrdNmbr;
	}

	public String getRctCrtdBy() {
		return this.rctCrtdBy;
	}

	public void setRctCrtdBy(String rctCrtdBy) {
		this.rctCrtdBy = rctCrtdBy;
	}

	public String getRctCstNm() {
		return this.rctCstNm;
	}

	public void setRctCstNm(String rctCstNm) {
		this.rctCstNm = rctCstNm;
	}

	public byte getRctCstmrDpst() {
		return this.rctCstmrDpst;
	}

	public void setRctCstmrDpst(byte rctCstmrDpst) {
		this.rctCstmrDpst = rctCstmrDpst;
	}

	public String getRctDesc() {
		return this.rctDesc;
	}

	public void setRctDesc(String rctDesc) {
		this.rctDesc = rctDesc;
	}

	public Date getRctDt() {
		return this.rctDt;
	}

	public void setRctDt(Date rctDt) {
		this.rctDt = rctDt;
	}

	public Date getRctDtApprvdRjctd() {
		return this.rctDtApprvdRjctd;
	}

	public void setRctDtApprvdRjctd(Date rctDtApprvdRjctd) {
		this.rctDtApprvdRjctd = rctDtApprvdRjctd;
	}

	public Date getRctDtCrtd() {
		return this.rctDtCrtd;
	}

	public void setRctDtCrtd(Date rctDtCrtd) {
		this.rctDtCrtd = rctDtCrtd;
	}

	public Date getRctDtLstMdfd() {
		return this.rctDtLstMdfd;
	}

	public void setRctDtLstMdfd(Date rctDtLstMdfd) {
		this.rctDtLstMdfd = rctDtLstMdfd;
	}

	public Date getRctDtPstd() {
		return this.rctDtPstd;
	}

	public void setRctDtPstd(Date rctDtPstd) {
		this.rctDtPstd = rctDtPstd;
	}

	public Date getRctDtRcncld() {
		return this.rctDtRcncld;
	}

	public void setRctDtRcncld(Date rctDtRcncld) {
		this.rctDtRcncld = rctDtRcncld;
	}

	public byte getRctLck() {
		return this.rctLck;
	}

	public void setRctLck(byte rctLck) {
		this.rctLck = rctLck;
	}

	public String getRctLstMdfdBy() {
		return this.rctLstMdfdBy;
	}

	public void setRctLstMdfdBy(String rctLstMdfdBy) {
		this.rctLstMdfdBy = rctLstMdfdBy;
	}

	public String getRctLvShft() {
		return this.rctLvShft;
	}

	public void setRctLvShft(String rctLvShft) {
		this.rctLvShft = rctLvShft;
	}

	public String getRctNmbr() {
		return this.rctNmbr;
	}

	public void setRctNmbr(String rctNmbr) {
		this.rctNmbr = rctNmbr;
	}

	public byte getRctPrntd() {
		return this.rctPrntd;
	}

	public void setRctPrntd(byte rctPrntd) {
		this.rctPrntd = rctPrntd;
	}

	public byte getRctPstd() {
		return this.rctPstd;
	}

	public void setRctPstd(byte rctPstd) {
		this.rctPstd = rctPstd;
	}

	public String getRctPstdBy() {
		return this.rctPstdBy;
	}

	public void setRctPstdBy(String rctPstdBy) {
		this.rctPstdBy = rctPstdBy;
	}

	public String getRctPymntMthd() {
		return this.rctPymntMthd;
	}

	public void setRctPymntMthd(String rctPymntMthd) {
		this.rctPymntMthd = rctPymntMthd;
	}

	public byte getRctRcncld() {
		return this.rctRcncld;
	}

	public void setRctRcncld(byte rctRcncld) {
		this.rctRcncld = rctRcncld;
	}

	public String getRctRfrncNmbr() {
		return this.rctRfrncNmbr;
	}

	public void setRctRfrncNmbr(String rctRfrncNmbr) {
		this.rctRfrncNmbr = rctRfrncNmbr;
	}

	public String getRctRsnFrRjctn() {
		return this.rctRsnFrRjctn;
	}

	public void setRctRsnFrRjctn(String rctRsnFrRjctn) {
		this.rctRsnFrRjctn = rctRsnFrRjctn;
	}

	public byte getRctSbjctToCmmssn() {
		return this.rctSbjctToCmmssn;
	}

	public void setRctSbjctToCmmssn(byte rctSbjctToCmmssn) {
		this.rctSbjctToCmmssn = rctSbjctToCmmssn;
	}

	public String getRctSldTo() {
		return this.rctSldTo;
	}

	public void setRctSldTo(String rctSldTo) {
		this.rctSldTo = rctSldTo;
	}

	public String getRctTyp() {
		return this.rctTyp;
	}

	public void setRctTyp(String rctTyp) {
		this.rctTyp = rctTyp;
	}

	public byte getRctVd() {
		return this.rctVd;
	}

	public void setRctVd(byte rctVd) {
		this.rctVd = rctVd;
	}

	public String getRctVdApprvlStatus() {
		return this.rctVdApprvlStatus;
	}

	public void setRctVdApprvlStatus(String rctVdApprvlStatus) {
		this.rctVdApprvlStatus = rctVdApprvlStatus;
	}

	public byte getRctVdPstd() {
		return this.rctVdPstd;
	}

	public void setRctVdPstd(byte rctVdPstd) {
		this.rctVdPstd = rctVdPstd;
	}

}