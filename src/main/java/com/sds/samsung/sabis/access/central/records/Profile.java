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
@Table(name = "PROFILE") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Profile {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "PRF_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "PRF_NAME", nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "Rule", cascade = CascadeType.ALL, orphanRemoval = true) 
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	private List<Rule> rules;
	
	@Column(name = "PRF_APPROVER")
	private Boolean approver;
	
	@Column(name = "PRF_GPSRESTRICTED")
	private Boolean gpsRestricted;
	
	@Column(name = "PRF_NEEDCHECKIN")
	private Boolean needCheckin;

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

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
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

	public Boolean getNeedCheckin() {
		return needCheckin;
	}

	public void setNeedCheckin(Boolean needCheckin) {
		this.needCheckin = needCheckin;
	}
	
}
