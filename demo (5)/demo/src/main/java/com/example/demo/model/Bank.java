package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;
@Entity
@Table(name="bank")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private BigDecimal seqNo;

	private BigDecimal circlecode;

	private BigDecimal sno;

	private String bankname;

	private BigDecimal pfy1;

	private BigDecimal pfy;

	private BigDecimal cfy;

	private Data dataAsondate;

	private Data createdDt;

	private String approvedBy;

	private Data approvedDt;

	private String status;

	public Bank(BigDecimal seqNo, BigDecimal circlecode, BigDecimal sno, String bankname, BigDecimal pfy1,
			BigDecimal pfy, BigDecimal cfy, Data dataAsondate, Data createdDt, String approvedBy, Data approvedDt,
			String status) {
		super();
		this.seqNo = seqNo;
		this.circlecode = circlecode;
		this.sno = sno;
		this.bankname = bankname;
		this.pfy1 = pfy1;
		this.pfy = pfy;
		this.cfy = cfy;
		this.dataAsondate = dataAsondate;
		this.createdDt = createdDt;
		this.approvedBy = approvedBy;
		this.approvedDt = approvedDt;
		this.status = status;
	}

	public Bank() {
		super();
	}

	public BigDecimal getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(BigDecimal seqNo) {
		this.seqNo = seqNo;
	}

	public BigDecimal getCirclecode() {
		return circlecode;
	}

	public void setCirclecode(BigDecimal circlecode) {
		this.circlecode = circlecode;
	}

	public BigDecimal getSno() {
		return sno;
	}

	public void setSno(BigDecimal sno) {
		this.sno = sno;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public BigDecimal getPfy1() {
		return pfy1;
	}

	public void setPfy1(BigDecimal pfy1) {
		this.pfy1 = pfy1;
	}

	public BigDecimal getPfy() {
		return pfy;
	}

	public void setPfy(BigDecimal pfy) {
		this.pfy = pfy;
	}

	public BigDecimal getCfy() {
		return cfy;
	}

	public void setCfy(BigDecimal cfy) {
		this.cfy = cfy;
	}

	public Data getDataAsondate() {
		return dataAsondate;
	}

	public void setDataAsondate(Data dataAsondate) {
		this.dataAsondate = dataAsondate;
	}

	public Data getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Data createdDt) {
		this.createdDt = createdDt;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Data getApprovedDt() {
		return approvedDt;
	}

	public void setApprovedDt(Data approvedDt) {
		this.approvedDt = approvedDt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bank [seqNo=" + seqNo + ", circlecode=" + circlecode + ", sno=" + sno + ", bankname=" + bankname
				+ ", pfy1=" + pfy1 + ", pfy=" + pfy + ", cfy=" + cfy + ", dataAsondate=" + dataAsondate + ", createdDt="
				+ createdDt + ", approvedBy=" + approvedBy + ", approvedDt=" + approvedDt + ", status=" + status + "]";
	}
	

}
