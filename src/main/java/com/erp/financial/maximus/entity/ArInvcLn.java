package com.erp.financial.maximus.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ar_invc_ln database table.
 * 
 */
@Entity
@Table(name="ar_invc_ln")
@NamedQuery(name="ArInvcLn.findAll", query="SELECT a FROM ArInvcLn a")
public class ArInvcLn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IL_CODE", unique=true, nullable=false)
	private int ilCode;

	@Column(name="AR_INVOICE")
	private int arInvoice;

	@Column(name="AR_PDC")
	private int arPdc;

	@Column(name="AR_RECEIPT")
	private int arReceipt;

	@Column(name="AR_STANDARD_MEMO_LINE")
	private int arStandardMemoLine;

	@Column(name="IL_AD_CMPNY", nullable=false)
	private int ilAdCmpny;

	@Column(name="IL_AMNT")
	private double ilAmnt;

	@Column(name="IL_DESC", length=255)
	private String ilDesc;

	@Column(name="IL_QNTTY")
	private double ilQntty;

	@Column(name="IL_TX")
	private byte ilTx;

	@Column(name="IL_TX_AMNT")
	private double ilTxAmnt;

	@Column(name="IL_UNT_PRC")
	private double ilUntPrc;

	public ArInvcLn() {
	}

	public int getIlCode() {
		return this.ilCode;
	}

	public void setIlCode(int ilCode) {
		this.ilCode = ilCode;
	}

	public int getArInvoice() {
		return this.arInvoice;
	}

	public void setArInvoice(int arInvoice) {
		this.arInvoice = arInvoice;
	}

	public int getArPdc() {
		return this.arPdc;
	}

	public void setArPdc(int arPdc) {
		this.arPdc = arPdc;
	}

	public int getArReceipt() {
		return this.arReceipt;
	}

	public void setArReceipt(int arReceipt) {
		this.arReceipt = arReceipt;
	}

	public int getArStandardMemoLine() {
		return this.arStandardMemoLine;
	}

	public void setArStandardMemoLine(int arStandardMemoLine) {
		this.arStandardMemoLine = arStandardMemoLine;
	}

	public int getIlAdCmpny() {
		return this.ilAdCmpny;
	}

	public void setIlAdCmpny(int ilAdCmpny) {
		this.ilAdCmpny = ilAdCmpny;
	}

	public double getIlAmnt() {
		return this.ilAmnt;
	}

	public void setIlAmnt(double ilAmnt) {
		this.ilAmnt = ilAmnt;
	}

	public String getIlDesc() {
		return this.ilDesc;
	}

	public void setIlDesc(String ilDesc) {
		this.ilDesc = ilDesc;
	}

	public double getIlQntty() {
		return this.ilQntty;
	}

	public void setIlQntty(double ilQntty) {
		this.ilQntty = ilQntty;
	}

	public byte getIlTx() {
		return this.ilTx;
	}

	public void setIlTx(byte ilTx) {
		this.ilTx = ilTx;
	}

	public double getIlTxAmnt() {
		return this.ilTxAmnt;
	}

	public void setIlTxAmnt(double ilTxAmnt) {
		this.ilTxAmnt = ilTxAmnt;
	}

	public double getIlUntPrc() {
		return this.ilUntPrc;
	}

	public void setIlUntPrc(double ilUntPrc) {
		this.ilUntPrc = ilUntPrc;
	}

}