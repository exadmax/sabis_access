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
@Table(name = "WORKFLOW") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Workflow {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "WKF_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "WKF_NAME", nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "Workflow", cascade = CascadeType.ALL, orphanRemoval = true) 
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	private List<CheckPoint> checkPoints;

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

	public List<CheckPoint> getCheckPoints() {
		return checkPoints;
	}

	public void setCheckPoints(List<CheckPoint> checkPoints) {
		this.checkPoints = checkPoints;
	}
	
}
