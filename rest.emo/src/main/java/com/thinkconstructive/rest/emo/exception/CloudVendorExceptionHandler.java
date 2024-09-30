package com.thinkconstructive.rest.emo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {
//we will add handler method in this cloudvendorexceptionhandler which will be handling cloudvendornotfoundexception
	@ExceptionHandler(value= {CloudVendorNotFountException.class})
public ResponseEntity<Object> handleCloudVendornotFounrException(CloudVendorNotFountException cloudVendornotfountexception){
	
	 CloudVendorException cloudvendorException= new CloudVendorException(cloudVendornotfountexception.getMessage(),cloudVendornotfountexception.getCause(),HttpStatus.NOT_FOUND);
	return  new ResponseEntity<>(cloudvendorException, HttpStatus.NOT_FOUND);
	}
	//we will be creating the payload which will be return back interms of this responseentity 
	//and that error msg,exception msg will be given back to client.

}
