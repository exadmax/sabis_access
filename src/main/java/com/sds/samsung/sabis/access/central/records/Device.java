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
	
	@Column(name = "DVC_ISTERMINAL")
	private Boolean isTerminal;
	
	@Column(name = "DVC_TERMINAL")
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

	public Boolean getIsTerminal() {
		return isTerminal;
	}

	public void setIsTerminal(Boolean isTerminal) {
		this.isTerminal = isTerminal;
	}

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	
}
