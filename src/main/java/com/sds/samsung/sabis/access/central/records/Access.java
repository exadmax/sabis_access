package com.sds.samsung.sabis.access.central.records;
import java.util.Date;
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

import com.sds.samsung.sabis.access.central.values.RecognitionType;

@Entity 
@Table(name = "ACCESS") 
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Access {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ACC_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "ACC_RECOGNITIONTYPE")
	private RecognitionType recognitionType;
	
	@Column(name = "ACC_QRCODE")
	private String qrCode;
	
	@ManyToOne 
	@JoinColumn(name = "USR_ID")
	private User userRecognized;
	
	@Column(name = "ACC_TIMERECOGNIZED")
	private Date timeRecognized;
	
	@ManyToOne 
	@JoinColumn(name = "TRP_ID")
	private TransPhoto photoRecognized;
	
	@Column(name = "ACC_NFCDATA")
	private String nfcData;
	
	@Column(name = "ACC_CHIPCARDDATA")
	private String chipCardData;
	
	@Column(name = "ACC_REGTIME")
	private Date regTime;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public RecognitionType getRecognitionType() {
		return recognitionType;
	}

	public void setRecognitionType(RecognitionType recognitionType) {
		this.recognitionType = recognitionType;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public User getUserRecognized() {
		return userRecognized;
	}

	public void setUserRecognized(User userRecognized) {
		this.userRecognized = userRecognized;
	}

	public Date getTimeRecognized() {
		return timeRecognized;
	}

	public void setTimeRecognized(Date timeRecognized) {
		this.timeRecognized = timeRecognized;
	}

	public TransPhoto getPhotoRecognized() {
		return photoRecognized;
	}

	public void setPhotoRecognized(TransPhoto photoRecognized) {
		this.photoRecognized = photoRecognized;
	}

	public String getNfcData() {
		return nfcData;
	}

	public void setNfcData(String nfcData) {
		this.nfcData = nfcData;
	}

	public String getChipCardData() {
		return chipCardData;
	}

	public void setChipCardData(String chipCardData) {
		this.chipCardData = chipCardData;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	
}
