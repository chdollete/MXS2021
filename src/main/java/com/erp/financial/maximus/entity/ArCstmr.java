package com.erp.financial.maximus.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ar_cstmr database table.
 * 
 */
@Entity
@Table(name="ar_cstmr")
@NamedQuery(name="ArCstmr.findAll", query="SELECT a FROM ArCstmr a")
public class ArCstmr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CST_CODE", unique=true, nullable=false)
	private int cstCode;

	@Column(name="AD_BANK_ACCOUNT")
	private int adBankAccount;

	@Column(name="AD_PAYMENT_TERM")
	private int adPaymentTerm;

	@Column(name="AR_CUSTOMER_CLASS")
	private int arCustomerClass;

	@Column(name="AR_CUSTOMER_TYPE")
	private int arCustomerType;

	@Column(name="AR_SALESPERSON")
	private int arSalesperson;

	@Column(name="AR_SALESPERSON2")
	private int arSalesperson2;

	@Column(name="CST_AD_CMPNY", nullable=false)
	private int cstAdCmpny;

	@Column(name="CST_AD_LV_RGN", length=50)
	private String cstAdLvRgn;

	@Column(name="CST_ADDRSS", length=255)
	private String cstAddrss;

	@Column(name="CST_ALTRNT_CNTCT", length=50)
	private String cstAltrntCntct;

	@Column(name="CST_ALTRNT_MBL_PHN", length=15)
	private String cstAltrntMblPhn;

	@Column(name="CST_ALTRNT_PHN", length=15)
	private String cstAltrntPhn;

	@Column(name="CST_AREA", length=25)
	private String cstArea;

	@Column(name="CST_BLL_TO_ADDRSS", length=255)
	private String cstBllToAddrss;

	@Column(name="CST_BLL_TO_ALT_CNTCT", length=50)
	private String cstBllToAltCntct;

	@Column(name="CST_BLL_TO_CNTCT", length=50)
	private String cstBllToCntct;

	@Column(name="CST_BLL_TO_PHN", length=15)
	private String cstBllToPhn;

	@Column(name="CST_BLLNG_FTR", length=255)
	private String cstBllngFtr;

	@Column(name="CST_BLLNG_FTR2", length=255)
	private String cstBllngFtr2;

	@Column(name="CST_BLLNG_FTR3", length=255)
	private String cstBllngFtr3;

	@Column(name="CST_BLLNG_HDR", length=255)
	private String cstBllngHdr;

	@Column(name="CST_BLLNG_HDR2", length=255)
	private String cstBllngHdr2;

	@Column(name="CST_BLLNG_HDR3", length=255)
	private String cstBllngHdr3;

	@Column(name="CST_BLLNG_SGNTRY", length=50)
	private String cstBllngSgntry;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CST_BRTHDY")
	private Date cstBrthdy;

	@Column(name="CST_CNTCT", length=100)
	private String cstCntct;

	@Column(name="CST_CNTRY", length=50)
	private String cstCntry;

	@Column(name="CST_CRDT_LMT")
	private double cstCrdtLmt;

	@Column(name="CST_CSTMR_CODE", nullable=false, length=25)
	private String cstCstmrCode;

	@Column(name="CST_CTY", length=50)
	private String cstCty;

	@Column(name="CST_DESC", length=50)
	private String cstDesc;

	@Column(name="CST_DL_PRC", length=50)
	private String cstDlPrc;

	@Column(name="CST_EFFCTVTY_DYS")
	private short cstEffctvtyDys;

	@Column(name="CST_EML", length=50)
	private String cstEml;

	@Column(name="CST_ENBL")
	private byte cstEnbl;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CST_ENTRY_DT")
	private Date cstEntryDt;

	@Column(name="CST_FX", length=15)
	private String cstFx;

	@Column(name="CST_GL_COA_RCVBL_ACCNT")
	private int cstGlCoaRcvblAccnt;

	@Column(name="CST_GL_COA_RVNUE_ACCNT")
	private int cstGlCoaRvnueAccnt;

	@Column(name="CST_MBL_PHN", length=15)
	private String cstMblPhn;

	@Column(name="CST_MMO", length=255)
	private String cstMmo;

	@Column(name="CST_NM", length=100)
	private String cstNm;

	@Column(name="CST_PHN", length=15)
	private String cstPhn;

	@Column(name="CST_PSTL_CD", length=10)
	private String cstPstlCd;

	@Column(name="CST_PYMNT_MTHD", length=50)
	private String cstPymntMthd;

	@Column(name="CST_SGNTRY_TTL", length=50)
	private String cstSgntryTtl;

	@Column(name="CST_SHP_TO_ADDRSS", length=255)
	private String cstShpToAddrss;

	@Column(name="CST_SHP_TO_ALT_CNTCT", length=50)
	private String cstShpToAltCntct;

	@Column(name="CST_SHP_TO_CNTCT", length=50)
	private String cstShpToCntct;

	@Column(name="CST_SHP_TO_PHN", length=15)
	private String cstShpToPhn;

	@Column(name="CST_STT_PRVNC", length=50)
	private String cstSttPrvnc;

	@Column(name="CST_TIN", length=50)
	private String cstTin;

	@Column(name="INV_LINE_ITEM_TEMPLATE")
	private int invLineItemTemplate;

	public ArCstmr() {
	}

	public int getCstCode() {
		return this.cstCode;
	}

	public void setCstCode(int cstCode) {
		this.cstCode = cstCode;
	}

	public int getAdBankAccount() {
		return this.adBankAccount;
	}

	public void setAdBankAccount(int adBankAccount) {
		this.adBankAccount = adBankAccount;
	}

	public int getAdPaymentTerm() {
		return this.adPaymentTerm;
	}

	public void setAdPaymentTerm(int adPaymentTerm) {
		this.adPaymentTerm = adPaymentTerm;
	}

	public int getArCustomerClass() {
		return this.arCustomerClass;
	}

	public void setArCustomerClass(int arCustomerClass) {
		this.arCustomerClass = arCustomerClass;
	}

	public int getArCustomerType() {
		return this.arCustomerType;
	}

	public void setArCustomerType(int arCustomerType) {
		this.arCustomerType = arCustomerType;
	}

	public int getArSalesperson() {
		return this.arSalesperson;
	}

	public void setArSalesperson(int arSalesperson) {
		this.arSalesperson = arSalesperson;
	}

	public int getArSalesperson2() {
		return this.arSalesperson2;
	}

	public void setArSalesperson2(int arSalesperson2) {
		this.arSalesperson2 = arSalesperson2;
	}

	public int getCstAdCmpny() {
		return this.cstAdCmpny;
	}

	public void setCstAdCmpny(int cstAdCmpny) {
		this.cstAdCmpny = cstAdCmpny;
	}

	public String getCstAdLvRgn() {
		return this.cstAdLvRgn;
	}

	public void setCstAdLvRgn(String cstAdLvRgn) {
		this.cstAdLvRgn = cstAdLvRgn;
	}

	public String getCstAddrss() {
		return this.cstAddrss;
	}

	public void setCstAddrss(String cstAddrss) {
		this.cstAddrss = cstAddrss;
	}

	public String getCstAltrntCntct() {
		return this.cstAltrntCntct;
	}

	public void setCstAltrntCntct(String cstAltrntCntct) {
		this.cstAltrntCntct = cstAltrntCntct;
	}

	public String getCstAltrntMblPhn() {
		return this.cstAltrntMblPhn;
	}

	public void setCstAltrntMblPhn(String cstAltrntMblPhn) {
		this.cstAltrntMblPhn = cstAltrntMblPhn;
	}

	public String getCstAltrntPhn() {
		return this.cstAltrntPhn;
	}

	public void setCstAltrntPhn(String cstAltrntPhn) {
		this.cstAltrntPhn = cstAltrntPhn;
	}

	public String getCstArea() {
		return this.cstArea;
	}

	public void setCstArea(String cstArea) {
		this.cstArea = cstArea;
	}

	public String getCstBllToAddrss() {
		return this.cstBllToAddrss;
	}

	public void setCstBllToAddrss(String cstBllToAddrss) {
		this.cstBllToAddrss = cstBllToAddrss;
	}

	public String getCstBllToAltCntct() {
		return this.cstBllToAltCntct;
	}

	public void setCstBllToAltCntct(String cstBllToAltCntct) {
		this.cstBllToAltCntct = cstBllToAltCntct;
	}

	public String getCstBllToCntct() {
		return this.cstBllToCntct;
	}

	public void setCstBllToCntct(String cstBllToCntct) {
		this.cstBllToCntct = cstBllToCntct;
	}

	public String getCstBllToPhn() {
		return this.cstBllToPhn;
	}

	public void setCstBllToPhn(String cstBllToPhn) {
		this.cstBllToPhn = cstBllToPhn;
	}

	public String getCstBllngFtr() {
		return this.cstBllngFtr;
	}

	public void setCstBllngFtr(String cstBllngFtr) {
		this.cstBllngFtr = cstBllngFtr;
	}

	public String getCstBllngFtr2() {
		return this.cstBllngFtr2;
	}

	public void setCstBllngFtr2(String cstBllngFtr2) {
		this.cstBllngFtr2 = cstBllngFtr2;
	}

	public String getCstBllngFtr3() {
		return this.cstBllngFtr3;
	}

	public void setCstBllngFtr3(String cstBllngFtr3) {
		this.cstBllngFtr3 = cstBllngFtr3;
	}

	public String getCstBllngHdr() {
		return this.cstBllngHdr;
	}

	public void setCstBllngHdr(String cstBllngHdr) {
		this.cstBllngHdr = cstBllngHdr;
	}

	public String getCstBllngHdr2() {
		return this.cstBllngHdr2;
	}

	public void setCstBllngHdr2(String cstBllngHdr2) {
		this.cstBllngHdr2 = cstBllngHdr2;
	}

	public String getCstBllngHdr3() {
		return this.cstBllngHdr3;
	}

	public void setCstBllngHdr3(String cstBllngHdr3) {
		this.cstBllngHdr3 = cstBllngHdr3;
	}

	public String getCstBllngSgntry() {
		return this.cstBllngSgntry;
	}

	public void setCstBllngSgntry(String cstBllngSgntry) {
		this.cstBllngSgntry = cstBllngSgntry;
	}

	public Date getCstBrthdy() {
		return this.cstBrthdy;
	}

	public void setCstBrthdy(Date cstBrthdy) {
		this.cstBrthdy = cstBrthdy;
	}

	public String getCstCntct() {
		return this.cstCntct;
	}

	public void setCstCntct(String cstCntct) {
		this.cstCntct = cstCntct;
	}

	public String getCstCntry() {
		return this.cstCntry;
	}

	public void setCstCntry(String cstCntry) {
		this.cstCntry = cstCntry;
	}

	public double getCstCrdtLmt() {
		return this.cstCrdtLmt;
	}

	public void setCstCrdtLmt(double cstCrdtLmt) {
		this.cstCrdtLmt = cstCrdtLmt;
	}

	public String getCstCstmrCode() {
		return this.cstCstmrCode;
	}

	public void setCstCstmrCode(String cstCstmrCode) {
		this.cstCstmrCode = cstCstmrCode;
	}

	public String getCstCty() {
		return this.cstCty;
	}

	public void setCstCty(String cstCty) {
		this.cstCty = cstCty;
	}

	public String getCstDesc() {
		return this.cstDesc;
	}

	public void setCstDesc(String cstDesc) {
		this.cstDesc = cstDesc;
	}

	public String getCstDlPrc() {
		return this.cstDlPrc;
	}

	public void setCstDlPrc(String cstDlPrc) {
		this.cstDlPrc = cstDlPrc;
	}

	public short getCstEffctvtyDys() {
		return this.cstEffctvtyDys;
	}

	public void setCstEffctvtyDys(short cstEffctvtyDys) {
		this.cstEffctvtyDys = cstEffctvtyDys;
	}

	public String getCstEml() {
		return this.cstEml;
	}

	public void setCstEml(String cstEml) {
		this.cstEml = cstEml;
	}

	public byte getCstEnbl() {
		return this.cstEnbl;
	}

	public void setCstEnbl(byte cstEnbl) {
		this.cstEnbl = cstEnbl;
	}

	public Date getCstEntryDt() {
		return this.cstEntryDt;
	}

	public void setCstEntryDt(Date cstEntryDt) {
		this.cstEntryDt = cstEntryDt;
	}

	public String getCstFx() {
		return this.cstFx;
	}

	public void setCstFx(String cstFx) {
		this.cstFx = cstFx;
	}

	public int getCstGlCoaRcvblAccnt() {
		return this.cstGlCoaRcvblAccnt;
	}

	public void setCstGlCoaRcvblAccnt(int cstGlCoaRcvblAccnt) {
		this.cstGlCoaRcvblAccnt = cstGlCoaRcvblAccnt;
	}

	public int getCstGlCoaRvnueAccnt() {
		return this.cstGlCoaRvnueAccnt;
	}

	public void setCstGlCoaRvnueAccnt(int cstGlCoaRvnueAccnt) {
		this.cstGlCoaRvnueAccnt = cstGlCoaRvnueAccnt;
	}

	public String getCstMblPhn() {
		return this.cstMblPhn;
	}

	public void setCstMblPhn(String cstMblPhn) {
		this.cstMblPhn = cstMblPhn;
	}

	public String getCstMmo() {
		return this.cstMmo;
	}

	public void setCstMmo(String cstMmo) {
		this.cstMmo = cstMmo;
	}

	public String getCstNm() {
		return this.cstNm;
	}

	public void setCstNm(String cstNm) {
		this.cstNm = cstNm;
	}

	public String getCstPhn() {
		return this.cstPhn;
	}

	public void setCstPhn(String cstPhn) {
		this.cstPhn = cstPhn;
	}

	public String getCstPstlCd() {
		return this.cstPstlCd;
	}

	public void setCstPstlCd(String cstPstlCd) {
		this.cstPstlCd = cstPstlCd;
	}

	public String getCstPymntMthd() {
		return this.cstPymntMthd;
	}

	public void setCstPymntMthd(String cstPymntMthd) {
		this.cstPymntMthd = cstPymntMthd;
	}

	public String getCstSgntryTtl() {
		return this.cstSgntryTtl;
	}

	public void setCstSgntryTtl(String cstSgntryTtl) {
		this.cstSgntryTtl = cstSgntryTtl;
	}

	public String getCstShpToAddrss() {
		return this.cstShpToAddrss;
	}

	public void setCstShpToAddrss(String cstShpToAddrss) {
		this.cstShpToAddrss = cstShpToAddrss;
	}

	public String getCstShpToAltCntct() {
		return this.cstShpToAltCntct;
	}

	public void setCstShpToAltCntct(String cstShpToAltCntct) {
		this.cstShpToAltCntct = cstShpToAltCntct;
	}

	public String getCstShpToCntct() {
		return this.cstShpToCntct;
	}

	public void setCstShpToCntct(String cstShpToCntct) {
		this.cstShpToCntct = cstShpToCntct;
	}

	public String getCstShpToPhn() {
		return this.cstShpToPhn;
	}

	public void setCstShpToPhn(String cstShpToPhn) {
		this.cstShpToPhn = cstShpToPhn;
	}

	public String getCstSttPrvnc() {
		return this.cstSttPrvnc;
	}

	public void setCstSttPrvnc(String cstSttPrvnc) {
		this.cstSttPrvnc = cstSttPrvnc;
	}

	public String getCstTin() {
		return this.cstTin;
	}

	public void setCstTin(String cstTin) {
		this.cstTin = cstTin;
	}

	public int getInvLineItemTemplate() {
		return this.invLineItemTemplate;
	}

	public void setInvLineItemTemplate(int invLineItemTemplate) {
		this.invLineItemTemplate = invLineItemTemplate;
	}

}