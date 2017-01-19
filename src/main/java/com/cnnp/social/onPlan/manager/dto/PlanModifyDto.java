package com.cnnp.social.onPlan.manager.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class PlanModifyDto {
	
	private String id;
	private String planid;
	private String operatorid;
	private String operatorname;
	@Temporal(TemporalType.DATE)
	private Date operatordate;
	private String description;
	private String operatortype;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPlanid() {
		return planid;
	}
	public void setPlanid(String planid) {
		this.planid = planid;
	}
	public String getOperatorid() {
		return operatorid;
	}
	public void setOperatorid(String operatorid) {
		this.operatorid = operatorid;
	}
	public String getOperatorname() {
		return operatorname;
	}
	public void setOperatorname(String operatorname) {
		this.operatorname = operatorname;
	}
	public Date getOperatordate() {
		return operatordate;
	}
	public void setOperatordate(Date operatordate) {
		this.operatordate = operatordate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatortype() {
		return operatortype;
	}
	public void setOperatortype(String operatortype) {
		this.operatortype = operatortype;
	}
	
	
}
