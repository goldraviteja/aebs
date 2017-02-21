package com.aebs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="callingplan")
public class CallingPlan {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="billing_cycle")
	private String billingCycle;
	
	 @Column(name="atn")
	 private String atn;
	 
	 @Column(name="full_amt")
	 private String fullAmt;
	 
	 @Column(name="billed_amt")
	 private int billedAmt;
	 
	 @Column(name="planCode")
	 private String plan;
	 
	 @Column(name="state")
	 private String state;

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

	public String getFullAmt() {
		return fullAmt;
	}

	public void setFullAmt(String fullAmt) {
		this.fullAmt = fullAmt;
	}

	public int getBilledAmt() {
		return billedAmt;
	}

	public void setBilledAmt(int billedAmt) {
		this.billedAmt = billedAmt;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "CallingPlan [id=" + id + ", billingCycle=" + billingCycle + ", atn=" + atn + ", fullAmt=" + fullAmt
				+ ", billedAmt=" + billedAmt + ", plan=" + plan + ", state=" + state + "]";
	}
    
	
	 
	 
}
