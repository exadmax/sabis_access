package com.sds.samsung.sabis.access.to.request;

public class RecognitionQRRequest extends RecognitionRequest{
	private String qrCode;

	/**
	 * @return the qrCode
	 */
	public String getQrCode() {
		return qrCode;
	}

	/**
	 * @param qrCode the qrCode to set
	 */
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
}
