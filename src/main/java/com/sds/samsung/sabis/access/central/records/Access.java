package com.sds.samsung.sabis.access.central.records;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity 
@Table(name = "ACCESS") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Access {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ACC_ID", updatable = false, nullable = false)
	private Long id;
	private RecognitionType recognitionType;
	private String qrCode;
	private User userRecognized;
	private Date timeRecognized;
	private TransPhoto photoRecognized;
	private String nfcData;
	private String chipCardData;
	private Date regTime;
public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
