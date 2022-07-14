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
@Table(name = "QR_USER") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class QRUser {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "QRU_ID", updatable = false, nullable = false)
	private Long id;
	
	@ManyToOne 
	@JoinColumn(name = "USR_ID")
	private User user;
	
	@Column(name = "QRU_QRCODE", nullable = false)
	private String qrCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	
}
