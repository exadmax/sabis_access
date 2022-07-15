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

import com.sds.samsung.sabis.access.central.values.DeviceType;

@Entity 
@Table(name = "DEVICE_GROUP") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DeviceGroup {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "DVG_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "DVG_NAME", nullable = false)
	private String name;
	
	@Column(name = "DVG_DEVICETYPE", nullable = false)
	private DeviceType deviceType;
	
	@Column(name = "DVG_GPSFIXED")
	private Boolean gpsFixed;
	
	@Column(name = "DVG_USEDEFAULTLOCATION")
	private Boolean useDefaultLocation;
	
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

	public DeviceType getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	public Boolean getGpsFixed() {
		return gpsFixed;
	}

	public void setGpsFixed(Boolean gpsFixed) {
		this.gpsFixed = gpsFixed;
	}

	public Boolean getUseDefaultLocation() {
		return useDefaultLocation;
	}

	public void setUseDefaultLocation(Boolean useDefaultLocation) {
		this.useDefaultLocation = useDefaultLocation;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
}
