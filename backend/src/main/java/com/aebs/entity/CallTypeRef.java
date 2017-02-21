package com.aebs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calltyperef")
public class CallTypeRef {
	
	@Id
	@GeneratedValue //(strategy = GenerationType.IDENTITY)
	@Column(name="call_type")
	private Long callType;
	
	@Column(name="description")
	private String description;
	
	@Column(name="display_text")
	private String displayText;

	public Long getCallType() {
		return callType;
	}

	public void setCallType(Long callType) {
		this.callType = callType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	@Override
	public String toString() {
		return "CallTypeRef [callType=" + callType + ", description=" + description + ", displayText=" + displayText
				+ "]";
	}
	
	

}
