package com.thinkconstructive.rest.emo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.rest.emo.model.CloudVendor;
import com.thinkconstructive.rest.emo.service.CloudVendorService;


@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	
	//from here we will sending request to service layer 
	CloudVendorService coludvendorservice;

		public CloudVendorController(CloudVendorService coludvendorservice) {
		super();
		this.coludvendorservice = coludvendorservice;
	}
    //read specific cloud vendor in db
	@GetMapping("{vendorId}")// it should be getting cv based on specific clouvendorid
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {//this id inorder to get{
		return coludvendorservice.getCloudVendor(vendorId);
	}
	
	//read all cloud vendor in db
	
	@GetMapping()//whenever the get request come with no argus it will retutn all the cloudvendors 
	public List<CloudVendor> getAllCloudVendorDetails() {
		   List<CloudVendor> vendors=coludvendorservice.getAllCloudvendors();
		  
		   
		   
		   return vendors;
	     }
		  
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
	//whatever is in requestbody we use to actuully get the things	
	/*
	 * String phonenumlength=cloudVendor.getVendorphonenumber();
	 * if(phonenumlength.length()==10) {
	 * coludvendorservice.createCloudVendor(cloudVendor); } else { return "failure";
	 * }
	 */
		//with this servi layes will call repo lay and will create valu in the db
		return "cloud vendor save successfully";
		}
	//updating cloud vendor details
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloundvendor) {//update for with the request body
		//whatever i getting here from the request body 
		coludvendorservice.updateCloudVendor(cloundvendor);
		return "cloud vendor update successfully";
	}
	
	//detele for parical id 
	 @DeleteMapping("{vendorId}")
	 public String deleteClouVendorDetails(@PathVariable("vendorId") String vendorId) {
		 coludvendorservice.deleteCloudVendor(vendorId);
		 return "cloud vendor delete successfully";
	 
	 }
	 
	 
	   
}


