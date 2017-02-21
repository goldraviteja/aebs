package com.aebs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="charge")
public class Charge {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;

	@Column(name="billing_cycle")
	private String billingCycle;
	
	 @Column(name="atn")
	 private String atn;
	 
	 @Column(name="occ")
	 private String occ;
	 
	 @Column(name="usoc")
	 private String usoc;
	 
	 @Column(name="pon")
	 private String pon;
	 
	 @Column(name="action_code_ind")
	 private String actionCodeInd;
	 
	 @Column(name="qty")
	 private int qty;
	 
	 @Column(name="full_amt")
	 private int fullAmt;
	 
	 @Column(name="business_ind")
	 private String businessInd;
	 
	 @Column(name="cls_of_serv")
	 private String clsOfServ;
	 
	 
	 @Column(name="recurring_ind")
	 private String recurringInd;
	 
	 @Column(name="from_date")
	 private Date fromDate;
	 
	 @Column(name="through_date")
	 private Date throughDate;
	 
	 @Column(name="num_effective_days")
	 private int numEffectiveDays;
	 
	 @Column(name="wtn")
	 private String wtn;
	 
	 @Column(name="phrase")
	 private String phrase;
	 
	 @Column(name="state")
	 private int state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBillingCycle() {
		return billingCycle;
	}

	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
	}

	public String getAtn() {
		return atn;
	}

	public void setAtn(String atn) {
		this.atn = atn;
	}

	public String getOcc() {
		return occ;
	}

	public void setOcc(String occ) {
		this.occ = occ;
	}

	public String getUsoc() {
		return usoc;
	}

	public void setUsoc(String usoc) {
		this.usoc = usoc;
	}

	public String getPon() {
		return pon;
	}

	public void setPon(String pon) {
		this.pon = pon;
	}

	public String getActionCodeInd() {
		return actionCodeInd;
	}

	public void setActionCodeInd(String actionCodeInd) {
		this.actionCodeInd = actionCodeInd;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getFullAmt() {
		return fullAmt;
	}

	public void setFullAmt(int fullAmt) {
		this.fullAmt = fullAmt;
	}

	public String getBusinessInd() {
		return businessInd;
	}

	public void setBusinessInd(String businessInd) {
		this.businessInd = businessInd;
	}

	public String getClsOfServ() {
		return clsOfServ;
	}

	public void setClsOfServ(String clsOfServ) {
		this.clsOfServ = clsOfServ;
	}

	public String getRecurringInd() {
		return recurringInd;
	}

	public void setRecurringInd(String recurringInd) {
		this.recurringInd = recurringInd;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getThroughDate() {
		return throughDate;
	}

	public void setThroughDate(Date throughDate) {
		this.throughDate = throughDate;
	}

	public int getNumEffectiveDays() {
		return numEffectiveDays;
	}

	public void setNumEffectiveDays(int numEffectiveDays) {
		this.numEffectiveDays = numEffectiveDays;
	}

	public String getWtn() {
		return wtn;
	}

	public void setWtn(String wtn) {
		this.wtn = wtn;
	}

	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Charge [id=" + id + ", billingCycle=" + billingCycle + ", atn=" + atn + ", occ=" + occ + ", usoc="
				+ usoc + ", pon=" + pon + ", actionCodeInd=" + actionCodeInd + ", qty=" + qty + ", fullAmt=" + fullAmt
				+ ", businessInd=" + businessInd + ", clsOfServ=" + clsOfServ + ", recurringInd=" + recurringInd
				+ ", fromDate=" + fromDate + ", throughDate=" + throughDate + ", numEffectiveDays=" + numEffectiveDays
				+ ", wtn=" + wtn + ", phrase=" + phrase + ", state=" + state + "]";
	}

	
	
}
