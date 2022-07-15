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
@Table(name = "TERMINAL_TYPE") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TerminalType {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "TRT_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "TRT_NAME", nullable = false)
	private String name;
	
	@ManyToOne 
	@JoinColumn(name = "LCT_ID")
	private Location location;

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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
}
