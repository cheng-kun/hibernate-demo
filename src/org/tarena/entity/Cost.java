package org.tarena.entity;

import java.sql.Date;

public class Cost {

	private Integer id;
	
	private String name;
	
	private Integer baseDuration;
	
	private Float baseCost;
	
	private Float unitCost;
	
	private String status;
	
	private String descr;
	
	private Date startTime;
	
	private String costType;

	public String getCostType() {
		return costType;
	}

	public void setCostType(String costType) {
		this.costType = costType;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public void setBaseCost(Float baseCost) {
		this.baseCost = baseCost;
	}

	public void setUnitCost(Float unitCost) {
		this.unitCost = unitCost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(float baseCost) {
		this.baseCost = baseCost;
	}

	public float getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(float unitCost) {
		this.unitCost = unitCost;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBaseDuration() {
		return baseDuration;
	}

	public void setBaseDuration(Integer baseDuration) {
		this.baseDuration = baseDuration;
	}
}
