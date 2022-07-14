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
@Table(name = "USER") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "USR_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "USR_FIRSTNAME", nullable = false)
	private String firstName;
	
	@Column(name = "USR_LASTNAME")
	private String lastName;
	
	@Column(name = "USR_REGISTRATION", nullable = false, unique = true)
	private String registration;
	
	@Column(name = "USR_EMAIL")
	private String email;
	
	@Column(name = "USR_APPROVER")
	private Boolean approver;
	
	@ManyToOne 
	@JoinColumn(name = "PRF_ID")
	private Profile profile;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getApprover() {
		return approver;
	}

	public void setApprover(Boolean approver) {
		this.approver = approver;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}
