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
@Table(name = "DEVICE") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Device {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "DVC_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "DVC_NAME", nullable = false)
	private String serial;
	
	@ManyToOne 
	@JoinColumn(name = "DVG_ID")
	private DeviceGroup deviceGroup;
	private Boolean isTerminal;
	private Terminal terminal;
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

	public DeviceGroup getDeviceGroup() {
		return deviceGroup;
	}

	public void setDeviceGroup(DeviceGroup deviceGroup) {
		this.deviceGroup = deviceGroup;
	}
	
}
