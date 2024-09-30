package com.thinkconstructive.rest.emo.exception;

public class CloudVendorNotFountException  extends RuntimeException{ //can be recognize as ecxeption class

	// i have generate two constructors for demonstrate process
	public CloudVendorNotFountException(String message) {
		super(message);
	}

	public CloudVendorNotFountException(String message, Throwable cause) {
		super(message, cause);
	}
	

}
