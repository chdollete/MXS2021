package com.erp.financial.maximus.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ar_tx_cd database table.
 * 
 */
@Entity
@Table(name = "ar_tx_cd")
@NamedQuery(name = "ArTxCd.findAll", query = "SELECT a FROM ArTxCd a")
public class ArTxCd implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String TC_CODE = "tcCode";
	public static final String TC_NAME = "tcNm";
	public static final String TC_DESC = "tcDesc";
	public static final String TC_RATE = "tcRt";
	public static final String TC_TYPE = "tcTyp";
	public static final String TC_ENABLE = "tcEnbl";
	public static final String TC_CMP_CODE = "tcAdCmpny";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TC_CODE", unique = true, nullable = false)
	private int tcCode;

	@Column(name = "GL_CHART_OF_ACCOUNT")
	private int glChartOfAccount;

	@Column(name = "TC_AD_CMPNY", nullable = false)
	private int tcAdCmpny;

	@Column(name = "TC_DESC", length = 50)
	private String tcDesc;

	@Column(name = "TC_ENBL")
	private byte tcEnbl;

	@Column(name = "TC_INTRM_ACCNT")
	private int tcIntrmAccnt;

	@Column(name = "TC_NM", nullable = false, length = 25)
	private String tcNm;

	@Column(name = "TC_RT")
	private double tcRt;

	@Column(name = "TC_TYP", length = 20)
	private String tcTyp;

	public ArTxCd() {
	}

	public int getTcCode() {
		return this.tcCode;
	}

	public void setTcCode(int tcCode) {
		this.tcCode = tcCode;
	}

	public int getGlChartOfAccount() {
		return this.glChartOfAccount;
	}

	public void setGlChartOfAccount(int glChartOfAccount) {
		this.glChartOfAccount = glChartOfAccount;
	}

	public int getTcAdCmpny() {
		return this.tcAdCmpny;
	}

	public void setTcAdCmpny(int tcAdCmpny) {
		this.tcAdCmpny = tcAdCmpny;
	}

	public String getTcDesc() {
		return this.tcDesc;
	}

	public void setTcDesc(String tcDesc) {
		this.tcDesc = tcDesc;
	}

	public byte getTcEnbl() {
		return this.tcEnbl;
	}

	public void setTcEnbl(byte tcEnbl) {
		this.tcEnbl = tcEnbl;
	}

	public int getTcIntrmAccnt() {
		return this.tcIntrmAccnt;
	}

	public void setTcIntrmAccnt(int tcIntrmAccnt) {
		this.tcIntrmAccnt = tcIntrmAccnt;
	}

	public String getTcNm() {
		return this.tcNm;
	}

	public void setTcNm(String tcNm) {
		this.tcNm = tcNm;
	}

	public double getTcRt() {
		return this.tcRt;
	}

	public void setTcRt(double tcRt) {
		this.tcRt = tcRt;
	}

	public String getTcTyp() {
		return this.tcTyp;
	}

	public void setTcTyp(String tcTyp) {
		this.tcTyp = tcTyp;
	}

}