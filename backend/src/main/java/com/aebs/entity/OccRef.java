package com.aebs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OccRef")
public class OccRef {

	@Id
	 @GeneratedValue //(strategy = GenerationType.AUTO)
	@Column(name="occ")
	private Long occ;
	
	@Column(name="description")
	private String description;
	
	@Column(name="multiplier")
	private int multiplier;
	
	@Column(name="display_text")
	private String display_text;

	public Long getOcc() {
		return occ;
	}

	public void setOcc(Long occ) {
		this.occ = occ;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}

	public String getDisplay_text() {
		return display_text;
	}

	public void setDisplay_text(String display_text) {
		this.display_text = display_text;
	}

	@Override
	public String toString() {
		return "OccRef [occ=" + occ + ", description=" + description + ", multiplier=" + multiplier + ", display_text="
				+ display_text + "]";
	}
	
	
	
}
