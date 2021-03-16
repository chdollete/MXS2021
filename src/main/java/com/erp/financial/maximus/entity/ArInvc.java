package com.erp.financial.maximus.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ar_invc database table.
 * 
 */
@Entity
@Table(name="ar_invc")
@NamedQuery(name="ArInvc.findAll", query="SELECT a FROM ArInvc a")
public class ArInvc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="INV_CODE", unique=true, nullable=false)
	private int invCode;

	@Column(name="AD_PAYMENT_TERM")
	private int adPaymentTerm;

	@Column(name="AR_CUSTOMER")
	private int arCustomer;

	@Column(name="AR_INVOICE_BATCH")
	private int arInvoiceBatch;

	@Column(name="AR_SALESPERSON")
	private int arSalesperson;

	@Column(name="AR_TAX_CODE")
	private int arTaxCode;

	@Column(name="AR_WITHHOLDING_TAX_CODE")
	private int arWithholdingTaxCode;

	@Column(name="GL_FUNCTIONAL_CURRENCY")
	private int glFunctionalCurrency;

	@Column(name="INV_AD_BRNCH", nullable=false)
	private int invAdBrnch;

	@Column(name="INV_AD_CMPNY", nullable=false)
	private int invAdCmpny;

	@Column(name="INV_AMNT_DUE")
	private double invAmntDue;

	@Column(name="INV_AMNT_PD")
	private double invAmntPd;

	@Column(name="INV_APPRVD_RJCTD_BY", length=25)
	private String invApprvdRjctdBy;

	@Column(name="INV_APPRVL_STATUS", length=10)
	private String invApprvlStatus;

	@Column(name="INV_BLL_TO_ADDRSS", length=255)
	private String invBllToAddrss;

	@Column(name="INV_BLL_TO_ALT_CNTCT", length=50)
	private String invBllToAltCntct;

	@Column(name="INV_BLL_TO_CNTCT", length=50)
	private String invBllToCntct;

	@Column(name="INV_BLL_TO_PHN", length=15)
	private String invBllToPhn;

	@Column(name="INV_BLLNG_FTR", length=255)
	private String invBllngFtr;

	@Column(name="INV_BLLNG_FTR2", length=255)
	private String invBllngFtr2;

	@Column(name="INV_BLLNG_FTR3", length=255)
	private String invBllngFtr3;

	@Column(name="INV_BLLNG_HDR", length=255)
	private String invBllngHdr;

	@Column(name="INV_BLLNG_HDR2", length=255)
	private String invBllngHdr2;

	@Column(name="INV_BLLNG_HDR3", length=255)
	private String invBllngHdr3;

	@Column(name="INV_BLLNG_SGNTRY", length=50)
	private String invBllngSgntry;

	@Column(name="INV_CLNT_PO", length=25)
	private String invClntPo;

	@Column(name="INV_CM_INVC_NMBR", length=25)
	private String invCmInvcNmbr;

	@Column(name="INV_CM_RFRNC_NMBR", length=100)
	private String invCmRfrncNmbr;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INV_CNVRSN_DT")
	private Date invCnvrsnDt;

	@Column(name="INV_CNVRSN_RT")
	private double invCnvrsnRt;

	@Column(name="INV_CRDT_MMO")
	private byte invCrdtMmo;

	@Column(name="INV_CRTD_BY", length=25)
	private String invCrtdBy;

	@Lob
	@Column(name="INV_CSTMR_ATTNTN")
	private String invCstmrAttntn;

	@Column(name="INV_CSTMR_ATTNTN_ID")
	private int invCstmrAttntnId;

	@Lob
	@Column(name="INV_CSTMR_PRINCPL")
	private String invCstmrPrincpl;

	@Column(name="INV_CSTMR_PRINCPL_ID")
	private int invCstmrPrincplId;

	@Column(name="INV_DBT_MEMO")
	private byte invDbtMemo;

	@Column(name="INV_DESC", length=250)
	private String invDesc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INV_DT")
	private Date invDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INV_DT_APPRVD_RJCTD")
	private Date invDtApprvdRjctd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INV_DT_CRTD")
	private Date invDtCrtd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INV_DT_LST_MDFD")
	private Date invDtLstMdfd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INV_DT_PSTD")
	private Date invDtPstd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INV_EFFCTVTY_DT")
	private Date invEffctvtyDt;

	@Column(name="INV_LST_MDFD_BY", length=25)
	private String invLstMdfdBy;

	@Column(name="INV_LV_FRGHT", length=25)
	private String invLvFrght;

	@Column(name="INV_LV_SHFT", length=25)
	private String invLvShft;

	@Column(name="INV_NMBR", length=25)
	private String invNmbr;

	@Column(name="INV_PRNTD")
	private byte invPrntd;

	@Column(name="INV_PSTD")
	private byte invPstd;

	@Column(name="INV_PSTD_BY", length=25)
	private String invPstdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INV_RCVD_DT")
	private Date invRcvdDt;

	@Column(name="INV_RFRNC_NMBR", length=50)
	private String invRfrncNmbr;

	@Column(name="INV_RSN_FR_RJCTN", length=100)
	private String invRsnFrRjctn;

	@Column(name="INV_SBJCT_TO_CMMSSN")
	private byte invSbjctToCmmssn;

	@Column(name="INV_SGNTRY_TTL", length=50)
	private String invSgntryTtl;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INV_SHP_DT")
	private Date invShpDt;

	@Column(name="INV_SHP_TO_ADDRSS", length=255)
	private String invShpToAddrss;

	@Column(name="INV_SHP_TO_ALT_CNTCT", length=50)
	private String invShpToAltCntct;

	@Column(name="INV_SHP_TO_CNTCT", length=50)
	private String invShpToCntct;

	@Column(name="INV_SHP_TO_PHN", length=15)
	private String invShpToPhn;

	@Column(name="INV_SO_NMBR", length=25)
	private String invSoNmbr;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INV_TRNSCTN_DT")
	private Date invTrnsctnDt;

	@Column(name="INV_VD")
	private byte invVd;

	public ArInvc() {
	}

	public int getInvCode() {
		return this.invCode;
	}

	public void setInvCode(int invCode) {
		this.invCode = invCode;
	}

	public int getAdPaymentTerm() {
		return this.adPaymentTerm;
	}

	public void setAdPaymentTerm(int adPaymentTerm) {
		this.adPaymentTerm = adPaymentTerm;
	}

	public int getArCustomer() {
		return this.arCustomer;
	}

	public void setArCustomer(int arCustomer) {
		this.arCustomer = arCustomer;
	}

	public int getArInvoiceBatch() {
		return this.arInvoiceBatch;
	}

	public void setArInvoiceBatch(int arInvoiceBatch) {
		this.arInvoiceBatch = arInvoiceBatch;
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

	public int getInvAdBrnch() {
		return this.invAdBrnch;
	}

	public void setInvAdBrnch(int invAdBrnch) {
		this.invAdBrnch = invAdBrnch;
	}

	public int getInvAdCmpny() {
		return this.invAdCmpny;
	}

	public void setInvAdCmpny(int invAdCmpny) {
		this.invAdCmpny = invAdCmpny;
	}

	public double getInvAmntDue() {
		return this.invAmntDue;
	}

	public void setInvAmntDue(double invAmntDue) {
		this.invAmntDue = invAmntDue;
	}

	public double getInvAmntPd() {
		return this.invAmntPd;
	}

	public void setInvAmntPd(double invAmntPd) {
		this.invAmntPd = invAmntPd;
	}

	public String getInvApprvdRjctdBy() {
		return this.invApprvdRjctdBy;
	}

	public void setInvApprvdRjctdBy(String invApprvdRjctdBy) {
		this.invApprvdRjctdBy = invApprvdRjctdBy;
	}

	public String getInvApprvlStatus() {
		return this.invApprvlStatus;
	}

	public void setInvApprvlStatus(String invApprvlStatus) {
		this.invApprvlStatus = invApprvlStatus;
	}

	public String getInvBllToAddrss() {
		return this.invBllToAddrss;
	}

	public void setInvBllToAddrss(String invBllToAddrss) {
		this.invBllToAddrss = invBllToAddrss;
	}

	public String getInvBllToAltCntct() {
		return this.invBllToAltCntct;
	}

	public void setInvBllToAltCntct(String invBllToAltCntct) {
		this.invBllToAltCntct = invBllToAltCntct;
	}

	public String getInvBllToCntct() {
		return this.invBllToCntct;
	}

	public void setInvBllToCntct(String invBllToCntct) {
		this.invBllToCntct = invBllToCntct;
	}

	public String getInvBllToPhn() {
		return this.invBllToPhn;
	}

	public void setInvBllToPhn(String invBllToPhn) {
		this.invBllToPhn = invBllToPhn;
	}

	public String getInvBllngFtr() {
		return this.invBllngFtr;
	}

	public void setInvBllngFtr(String invBllngFtr) {
		this.invBllngFtr = invBllngFtr;
	}

	public String getInvBllngFtr2() {
		return this.invBllngFtr2;
	}

	public void setInvBllngFtr2(String invBllngFtr2) {
		this.invBllngFtr2 = invBllngFtr2;
	}

	public String getInvBllngFtr3() {
		return this.invBllngFtr3;
	}

	public void setInvBllngFtr3(String invBllngFtr3) {
		this.invBllngFtr3 = invBllngFtr3;
	}

	public String getInvBllngHdr() {
		return this.invBllngHdr;
	}

	public void setInvBllngHdr(String invBllngHdr) {
		this.invBllngHdr = invBllngHdr;
	}

	public String getInvBllngHdr2() {
		return this.invBllngHdr2;
	}

	public void setInvBllngHdr2(String invBllngHdr2) {
		this.invBllngHdr2 = invBllngHdr2;
	}

	public String getInvBllngHdr3() {
		return this.invBllngHdr3;
	}

	public void setInvBllngHdr3(String invBllngHdr3) {
		this.invBllngHdr3 = invBllngHdr3;
	}

	public String getInvBllngSgntry() {
		return this.invBllngSgntry;
	}

	public void setInvBllngSgntry(String invBllngSgntry) {
		this.invBllngSgntry = invBllngSgntry;
	}

	public String getInvClntPo() {
		return this.invClntPo;
	}

	public void setInvClntPo(String invClntPo) {
		this.invClntPo = invClntPo;
	}

	public String getInvCmInvcNmbr() {
		return this.invCmInvcNmbr;
	}

	public void setInvCmInvcNmbr(String invCmInvcNmbr) {
		this.invCmInvcNmbr = invCmInvcNmbr;
	}

	public String getInvCmRfrncNmbr() {
		return this.invCmRfrncNmbr;
	}

	public void setInvCmRfrncNmbr(String invCmRfrncNmbr) {
		this.invCmRfrncNmbr = invCmRfrncNmbr;
	}

	public Date getInvCnvrsnDt() {
		return this.invCnvrsnDt;
	}

	public void setInvCnvrsnDt(Date invCnvrsnDt) {
		this.invCnvrsnDt = invCnvrsnDt;
	}

	public double getInvCnvrsnRt() {
		return this.invCnvrsnRt;
	}

	public void setInvCnvrsnRt(double invCnvrsnRt) {
		this.invCnvrsnRt = invCnvrsnRt;
	}

	public byte getInvCrdtMmo() {
		return this.invCrdtMmo;
	}

	public void setInvCrdtMmo(byte invCrdtMmo) {
		this.invCrdtMmo = invCrdtMmo;
	}

	public String getInvCrtdBy() {
		return this.invCrtdBy;
	}

	public void setInvCrtdBy(String invCrtdBy) {
		this.invCrtdBy = invCrtdBy;
	}

	public String getInvCstmrAttntn() {
		return this.invCstmrAttntn;
	}

	public void setInvCstmrAttntn(String invCstmrAttntn) {
		this.invCstmrAttntn = invCstmrAttntn;
	}

	public int getInvCstmrAttntnId() {
		return this.invCstmrAttntnId;
	}

	public void setInvCstmrAttntnId(int invCstmrAttntnId) {
		this.invCstmrAttntnId = invCstmrAttntnId;
	}

	public String getInvCstmrPrincpl() {
		return this.invCstmrPrincpl;
	}

	public void setInvCstmrPrincpl(String invCstmrPrincpl) {
		this.invCstmrPrincpl = invCstmrPrincpl;
	}

	public int getInvCstmrPrincplId() {
		return this.invCstmrPrincplId;
	}

	public void setInvCstmrPrincplId(int invCstmrPrincplId) {
		this.invCstmrPrincplId = invCstmrPrincplId;
	}

	public byte getInvDbtMemo() {
		return this.invDbtMemo;
	}

	public void setInvDbtMemo(byte invDbtMemo) {
		this.invDbtMemo = invDbtMemo;
	}

	public String getInvDesc() {
		return this.invDesc;
	}

	public void setInvDesc(String invDesc) {
		this.invDesc = invDesc;
	}

	public Date getInvDt() {
		return this.invDt;
	}

	public void setInvDt(Date invDt) {
		this.invDt = invDt;
	}

	public Date getInvDtApprvdRjctd() {
		return this.invDtApprvdRjctd;
	}

	public void setInvDtApprvdRjctd(Date invDtApprvdRjctd) {
		this.invDtApprvdRjctd = invDtApprvdRjctd;
	}

	public Date getInvDtCrtd() {
		return this.invDtCrtd;
	}

	public void setInvDtCrtd(Date invDtCrtd) {
		this.invDtCrtd = invDtCrtd;
	}

	public Date getInvDtLstMdfd() {
		return this.invDtLstMdfd;
	}

	public void setInvDtLstMdfd(Date invDtLstMdfd) {
		this.invDtLstMdfd = invDtLstMdfd;
	}

	public Date getInvDtPstd() {
		return this.invDtPstd;
	}

	public void setInvDtPstd(Date invDtPstd) {
		this.invDtPstd = invDtPstd;
	}

	public Date getInvEffctvtyDt() {
		return this.invEffctvtyDt;
	}

	public void setInvEffctvtyDt(Date invEffctvtyDt) {
		this.invEffctvtyDt = invEffctvtyDt;
	}

	public String getInvLstMdfdBy() {
		return this.invLstMdfdBy;
	}

	public void setInvLstMdfdBy(String invLstMdfdBy) {
		this.invLstMdfdBy = invLstMdfdBy;
	}

	public String getInvLvFrght() {
		return this.invLvFrght;
	}

	public void setInvLvFrght(String invLvFrght) {
		this.invLvFrght = invLvFrght;
	}

	public String getInvLvShft() {
		return this.invLvShft;
	}

	public void setInvLvShft(String invLvShft) {
		this.invLvShft = invLvShft;
	}

	public String getInvNmbr() {
		return this.invNmbr;
	}

	public void setInvNmbr(String invNmbr) {
		this.invNmbr = invNmbr;
	}

	public byte getInvPrntd() {
		return this.invPrntd;
	}

	public void setInvPrntd(byte invPrntd) {
		this.invPrntd = invPrntd;
	}

	public byte getInvPstd() {
		return this.invPstd;
	}

	public void setInvPstd(byte invPstd) {
		this.invPstd = invPstd;
	}

	public String getInvPstdBy() {
		return this.invPstdBy;
	}

	public void setInvPstdBy(String invPstdBy) {
		this.invPstdBy = invPstdBy;
	}

	public Date getInvRcvdDt() {
		return this.invRcvdDt;
	}

	public void setInvRcvdDt(Date invRcvdDt) {
		this.invRcvdDt = invRcvdDt;
	}

	public String getInvRfrncNmbr() {
		return this.invRfrncNmbr;
	}

	public void setInvRfrncNmbr(String invRfrncNmbr) {
		this.invRfrncNmbr = invRfrncNmbr;
	}

	public String getInvRsnFrRjctn() {
		return this.invRsnFrRjctn;
	}

	public void setInvRsnFrRjctn(String invRsnFrRjctn) {
		this.invRsnFrRjctn = invRsnFrRjctn;
	}

	public byte getInvSbjctToCmmssn() {
		return this.invSbjctToCmmssn;
	}

	public void setInvSbjctToCmmssn(byte invSbjctToCmmssn) {
		this.invSbjctToCmmssn = invSbjctToCmmssn;
	}

	public String getInvSgntryTtl() {
		return this.invSgntryTtl;
	}

	public void setInvSgntryTtl(String invSgntryTtl) {
		this.invSgntryTtl = invSgntryTtl;
	}

	public Date getInvShpDt() {
		return this.invShpDt;
	}

	public void setInvShpDt(Date invShpDt) {
		this.invShpDt = invShpDt;
	}

	public String getInvShpToAddrss() {
		return this.invShpToAddrss;
	}

	public void setInvShpToAddrss(String invShpToAddrss) {
		this.invShpToAddrss = invShpToAddrss;
	}

	public String getInvShpToAltCntct() {
		return this.invShpToAltCntct;
	}

	public void setInvShpToAltCntct(String invShpToAltCntct) {
		this.invShpToAltCntct = invShpToAltCntct;
	}

	public String getInvShpToCntct() {
		return this.invShpToCntct;
	}

	public void setInvShpToCntct(String invShpToCntct) {
		this.invShpToCntct = invShpToCntct;
	}

	public String getInvShpToPhn() {
		return this.invShpToPhn;
	}

	public void setInvShpToPhn(String invShpToPhn) {
		this.invShpToPhn = invShpToPhn;
	}

	public String getInvSoNmbr() {
		return this.invSoNmbr;
	}

	public void setInvSoNmbr(String invSoNmbr) {
		this.invSoNmbr = invSoNmbr;
	}

	public Date getInvTrnsctnDt() {
		return this.invTrnsctnDt;
	}

	public void setInvTrnsctnDt(Date invTrnsctnDt) {
		this.invTrnsctnDt = invTrnsctnDt;
	}

	public byte getInvVd() {
		return this.invVd;
	}

	public void setInvVd(byte invVd) {
		this.invVd = invVd;
	}

}