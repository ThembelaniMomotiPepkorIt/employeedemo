package za.ac.pdgswd.employeedemo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorEmployee {
	private String errorMessage;
	private int errorCode;
	private String documentation;
	
	
	public ErrorEmployee(String errorMessage, int errorCode, String documentation) {
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.documentation = documentation;
	}
	
	public ErrorEmployee(){
		
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	
	
	
}
