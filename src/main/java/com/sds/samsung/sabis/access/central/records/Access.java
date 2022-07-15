package com.sds.samsung.sabis.access.central.records;

import java.util.Date;

import com.sds.samsung.sabis.access.central.values.RecognitionType;

public class Access {
	
	private Long id;
	private RecognitionType recognitionType;
	private String qrCode;
	private User userRecognized;
	private Date timeRecognized;
	private TransPhoto photoRecognized;
	private String nfcData;
	private String chipCardData;
	private Date regTime;
}
