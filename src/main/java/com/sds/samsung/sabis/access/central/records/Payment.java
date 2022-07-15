package com.sds.samsung.sabis.access.central.records;

import java.math.BigDecimal;

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
@Table(name = "PAYMENT") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Payment {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "PAY_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "PAY_VALUE", nullable = false)
	private BigDecimal value;
	
	@ManyToOne 
	@JoinColumn(name = "PRF_ID")
	private Profile profile;
	
	@ManyToOne 
	@JoinColumn(name = "TRT_ID")
	private TerminalType terminalType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public TerminalType getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(TerminalType terminalType) {
		this.terminalType = terminalType;
	}
	
}
