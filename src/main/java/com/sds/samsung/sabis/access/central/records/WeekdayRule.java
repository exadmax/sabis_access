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

import com.sds.samsung.sabis.access.central.values.WeekDay;

@Entity 
@Table(name = "WEEKDAY_RULE") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class WeekdayRule {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "WDR_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "WDR_WEEKDAY", nullable = false)
	private WeekDay weekDay;
	
	@Column(name = "WDR_STARTTIME")
	private String startTime;
	
	@Column(name = "WDR_ENDTIME")
	private String endTime;
	
	@Column(name = "WDR_COUNTEXTRATIME")
	private Boolean countExtraTime;
	
	@ManyToOne 
	@JoinColumn(name = "RUL_ID")
	private Rule rule;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public WeekDay getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(WeekDay weekDay) {
		this.weekDay = weekDay;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Boolean getCountExtraTime() {
		return countExtraTime;
	}

	public void setCountExtraTime(Boolean countExtraTime) {
		this.countExtraTime = countExtraTime;
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}
	
}
