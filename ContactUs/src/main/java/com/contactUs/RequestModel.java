package com.contactUs;

public class RequestModel 
{

	private String fullname;
	private String email;
	private String Message;
	private String status;
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "RequestModel [fullname=" + fullname + ", email=" + email + ", Message=" + Message + ", status=" + status
				+ "]";
	}
	
}
