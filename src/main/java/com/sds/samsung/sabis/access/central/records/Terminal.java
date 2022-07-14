package com.sds.samsung.sabis.access.central.records;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity 
@Table(name = "TERMINAL") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Terminal {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "TRM_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "TRM_SERIAL", nullable = false)
	private String serial;
	
	@Column(name = "TRM_NAME", nullable = false)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
