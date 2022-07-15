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
@Table(name = "TRANS_PHOTO") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TransPhoto {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "TRP_ID", updatable = false, nullable = false)
	private Long id;
	
	@ManyToOne 
	@JoinColumn(name = "ACC_ID")
	private Access access;
	
	@Column(name = "TRP_FILE", nullable = false)
	private byte[] file;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Access getAccess() {
		return access;
	}

	public void setAccess(Access access) {
		this.access = access;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}
	
}
