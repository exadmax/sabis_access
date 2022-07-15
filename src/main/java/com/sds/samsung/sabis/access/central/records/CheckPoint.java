package com.sds.samsung.sabis.access.central.records;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity 
@Table(name = "CHECKPOINT") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CheckPoint {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "CKP_ID", updatable = false, nullable = false)
	private Long id;
	
	@ManyToOne 
	@JoinColumn(name = "WKF_ID")
	private Workflow workflow;
	
	@Column(name = "CKP_NAME", nullable = false)
	private String name;

	@Column(name = "CKP_SEQUENCE")
	private Integer sequence;
	
	@Column(name = "CKP_AUTOMATE")
	private Boolean automated;
	
	@Column(name = "CKP_STARTTIME")
	private String startTime;
	
	@Column(name = "CKP_HASLIMITTIME")
	private Boolean hasLimitTime;
	
	@Column(name = "CKP_LIMITTIME")
	private String limitTime;
	
	@Column(name = "CKP_DYNAMICGPS")
	private Boolean dynamicGPS;
	
	@Column(name = "CKP_TERMINALCHECKIN")
	private Boolean terminalCheckin;
	
	@Column(name = "CKP_CANJUMPTHISPOINT")
	private Boolean canJumpThisPoint;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Workflow getWorkflow() {
		return workflow;
	}

	public void setWorkflow(Workflow workflow) {
		this.workflow = workflow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public Boolean getAutomated() {
		return automated;
	}

	public void setAutomated(Boolean automated) {
		this.automated = automated;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Boolean getHasLimitTime() {
		return hasLimitTime;
	}

	public void setHasLimitTime(Boolean hasLimitTime) {
		this.hasLimitTime = hasLimitTime;
	}

	public String getLimitTime() {
		return limitTime;
	}

	public void setLimitTime(String limitTime) {
		this.limitTime = limitTime;
	}

	public Boolean getDynamicGPS() {
		return dynamicGPS;
	}

	public void setDynamicGPS(Boolean dynamicGPS) {
		this.dynamicGPS = dynamicGPS;
	}

	public Boolean getTerminalCheckin() {
		return terminalCheckin;
	}

	public void setTerminalCheckin(Boolean terminalCheckin) {
		this.terminalCheckin = terminalCheckin;
	}

	public Boolean getCanJumpThisPoint() {
		return canJumpThisPoint;
	}

	public void setCanJumpThisPoint(Boolean canJumpThisPoint) {
		this.canJumpThisPoint = canJumpThisPoint;
	}

}
