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
@Table(name = "LOCATION") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Location {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "LCT_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "LCT_NAME", nullable = false)
	private String name;
	
	@Column(name = "LCT_LATITUDE")
	private String latitude;
	
	@Column(name = "LCT_LONGITUDE")
	private String longitude;
	
	@Column(name = "LCT_ZOOM")
	private Integer zoom;

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

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Integer getZoom() {
		return zoom;
	}

	public void setZoom(Integer zoom) {
		this.zoom = zoom;
	}
	
}
