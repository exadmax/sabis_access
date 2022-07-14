package com.sds.samsung.sabis.access.to.response;

import java.util.Date;

import com.sds.samsung.sabis.access.to.UserData;

public class RecognitionResponse {
	private Integer status;
	private Boolean approval;
	private UserData userData;
	private Date timeResponse;
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the approval
	 */
	public Boolean getApproval() {
		return approval;
	}
	/**
	 * @param approval the approval to set
	 */
	public void setApproval(Boolean approval) {
		this.approval = approval;
	}
	/**
	 * @return the userData
	 */
	public UserData getUserData() {
		return userData;
	}
	/**
	 * @param userData the userData to set
	 */
	public void setUserData(UserData userData) {
		this.userData = userData;
	}
	/**
	 * @return the timeResponse
	 */
	public Date getTimeResponse() {
		return timeResponse;
	}
	/**
	 * @param timeResponse the timeResponse to set
	 */
	public void setTimeResponse(Date timeResponse) {
		this.timeResponse = timeResponse;
	}
	
	
}
