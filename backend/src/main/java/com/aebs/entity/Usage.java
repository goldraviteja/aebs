package com.aebs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuage")
public class Usage {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="billing_cycle")
	private String billing_cycle;
	
	 @Column(name="atn")
	 private String atn;
	 
	 @Column(name="cgr")
	 private int cgr;
	 
	 @Column(name="call_type")
	 private String call_type;
	 
	 @Column(name="total_amt")
	 private int total_amt;
	 
	 @Column(name="units_used")
	 private int units_used;
	 
	 @Column(name="duration")
	 private int duration;
	 
	 @Column(name="customer_type")
	 private String customer_type;
	 
	 @Column(name="lt")
	 private String lt;
	 
	 @Column(name="datatype")
	 private String datatype;
	 
	 @Column(name="state")
	 private int State;

	public String getBilling_cycle() {
		return billing_cycle;
	}

	public void setBilling_cycle(String billing_cycle) {
		this.billing_cycle = billing_cycle;
	}

	public String getAtn() {
		return atn;
	}

	public void setAtn(String atn) {
		this.atn = atn;
	}

	public int getCgr() {
		return cgr;
	}

	public void setCgr(int cgr) {
		this.cgr = cgr;
	}

	public String getCall_type() {
		return call_type;
	}

	public void setCall_type(String call_type) {
		this.call_type = call_type;
	}

	public int getTotal_amt() {
		return total_amt;
	}

	public void setTotal_amt(int total_amt) {
		this.total_amt = total_amt;
	}

	public int getUnits_used() {
		return units_used;
	}

	public void setUnits_used(int units_used) {
		this.units_used = units_used;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCustomer_type() {
		return customer_type;
	}

	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}

	public String getLt() {
		return lt;
	}

	public void setLt(String lt) {
		this.lt = lt;
	}

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public int getState() {
		return State;
	}

	public void setState(int state) {
		State = state;
	}

	@Override
	public String toString() {
		return "usage [billing_cycle=" + billing_cycle + ", atn=" + atn + ", cgr=" + cgr + ", call_type=" + call_type
				+ ", total_amt=" + total_amt + ", units_used=" + units_used + ", duration=" + duration
				+ ", customer_type=" + customer_type + ", lt=" + lt + ", datatype=" + datatype + ", State=" + State
				+ "]";
	}
	  
	 
}
