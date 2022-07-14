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
@Table(name = "DEVICE_RULE") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DeviceRule {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "DVR_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "DVR_NAME", nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "Profile", cascade = CascadeType.ALL, orphanRemoval = true) 
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	private List<Profile> groupProfile;

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

	public List<Profile> getGroupProfile() {
		return groupProfile;
	}

	public void setGroupProfile(List<Profile> groupProfile) {
		this.groupProfile = groupProfile;
	}
	
}
