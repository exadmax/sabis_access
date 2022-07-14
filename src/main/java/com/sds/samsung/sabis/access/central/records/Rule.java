package com.sds.samsung.sabis.access.central.records;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity 
@Table(name = "RULE") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Rule {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "RUL_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "RUL_NAME")
	private String name;
	
	@OneToMany(mappedBy = "WeekdayRule", cascade = CascadeType.ALL, orphanRemoval = true) 
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	private List<WeekdayRule> weekDays;
	
	@Column(name = "RUL_APPROVER")
	private Boolean approver;
	
	@Column(name = "RUL_RESTRICTED")
	private Boolean gpsRestricted;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<WeekdayRule> getWeekDays() {
		return weekDays;
	}

	public void setWeekDays(List<WeekdayRule> weekDays) {
		this.weekDays = weekDays;
	}

	public Boolean getApprover() {
		return approver;
	}

	public void setApprover(Boolean approver) {
		this.approver = approver;
	}

	public Boolean getGpsRestricted() {
		return gpsRestricted;
	}

	public void setGpsRestricted(Boolean gpsRestricted) {
		this.gpsRestricted = gpsRestricted;
	}
	
}
