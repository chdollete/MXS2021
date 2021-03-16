package com.erp.financial.maximus.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ar_invc_btch database table.
 * 
 */
@Entity
@Table(name="ar_invc_btch")
@NamedQuery(name="ArInvcBtch.findAll", query="SELECT a FROM ArInvcBtch a")
public class ArInvcBtch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IB_CODE", unique=true, nullable=false)
	private int ibCode;

	@Column(name="IB_AD_BRNCH", nullable=false)
	private int ibAdBrnch;

	@Column(name="IB_AD_CMPNY", nullable=false)
	private int ibAdCmpny;

	@Column(name="IB_CRTD_BY", length=25)
	private String ibCrtdBy;

	@Column(name="IB_DESC", length=50)
	private String ibDesc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="IB_DT_CRTD")
	private Date ibDtCrtd;

	@Column(name="IB_NM", nullable=false, length=50)
	private String ibNm;

	@Column(name="IB_STATUS", length=10)
	private String ibStatus;

	@Column(name="IB_TYP", length=25)
	private String ibTyp;

	public ArInvcBtch() {
	}

	public int getIbCode() {
		return this.ibCode;
	}

	public void setIbCode(int ibCode) {
		this.ibCode = ibCode;
	}

	public int getIbAdBrnch() {
		return this.ibAdBrnch;
	}

	public void setIbAdBrnch(int ibAdBrnch) {
		this.ibAdBrnch = ibAdBrnch;
	}

	public int getIbAdCmpny() {
		return this.ibAdCmpny;
	}

	public void setIbAdCmpny(int ibAdCmpny) {
		this.ibAdCmpny = ibAdCmpny;
	}

	public String getIbCrtdBy() {
		return this.ibCrtdBy;
	}

	public void setIbCrtdBy(String ibCrtdBy) {
		this.ibCrtdBy = ibCrtdBy;
	}

	public String getIbDesc() {
		return this.ibDesc;
	}

	public void setIbDesc(String ibDesc) {
		this.ibDesc = ibDesc;
	}

	public Date getIbDtCrtd() {
		return this.ibDtCrtd;
	}

	public void setIbDtCrtd(Date ibDtCrtd) {
		this.ibDtCrtd = ibDtCrtd;
	}

	public String getIbNm() {
		return this.ibNm;
	}

	public void setIbNm(String ibNm) {
		this.ibNm = ibNm;
	}

	public String getIbStatus() {
		return this.ibStatus;
	}

	public void setIbStatus(String ibStatus) {
		this.ibStatus = ibStatus;
	}

	public String getIbTyp() {
		return this.ibTyp;
	}

	public void setIbTyp(String ibTyp) {
		this.ibTyp = ibTyp;
	}

}