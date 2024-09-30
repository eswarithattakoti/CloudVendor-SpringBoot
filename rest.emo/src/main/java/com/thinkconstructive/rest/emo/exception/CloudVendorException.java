package com.thinkconstructive.rest.emo.exception;

import org.springframework.http.HttpStatus;

public class CloudVendorException {
	
	private final String message; //what msg we have pass the client
	private final Throwable throwable;
	private final HttpStatus httpstatus;
	
	public String getMessage() { //here is constructor for this
		return message;
	}
	public Throwable getThrowable() {
		return throwable;
	}
	public HttpStatus getHttpstatus() {
		return httpstatus;
	}
	
	public CloudVendorException(String message, Throwable throwable, HttpStatus httpstatus) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.httpstatus = httpstatus;
	}
	
	
	
	
	
	
	

}
