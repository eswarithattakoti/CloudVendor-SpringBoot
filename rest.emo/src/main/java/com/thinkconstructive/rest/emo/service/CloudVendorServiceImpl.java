package com.thinkconstructive.rest.emo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thinkconstructive.rest.emo.exception.CloudVendorNotFountException;
import com.thinkconstructive.rest.emo.model.CloudVendor;
import com.thinkconstructive.rest.emo.repository.CloudVendorRepository;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {

	CloudVendorRepository cloudvendorRepository;
	public CloudVendorServiceImpl(CloudVendorRepository cloudvendorRepository) {
		this.cloudvendorRepository=cloudvendorRepository;
	}
	
	@Override
	public String createCloudVendor(CloudVendor cloudvendor) {
		
		 cloudvendorRepository.save(cloudvendor);
		 
//		int length=cloudvendor.getVendorphonenumber();
//		 if(length==10) {
//			
//			
//		 }
//		 else {
//			 System.out.println("please put take 10 digits");
//				 }
			 return	"success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudvendor) {
		cloudvendorRepository.save(cloudvendor);
		return "success";
	}
	
	

	@Override
	public String deleteCloudVendor(String cloudVendorId) {	
		cloudvendorRepository.deleteById(cloudVendorId);
	
		return  "succes";
		
	}

	@Override
	public List<CloudVendor> getAllCloudvendors() {
		
		return cloudvendorRepository.findAll();
	}

	
	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		if(cloudvendorRepository.findById(cloudVendorId).isEmpty())
	throw new CloudVendorNotFountException("Request cloud vendor doesnot exist");
		return cloudvendorRepository.findById(cloudVendorId).get();
	}

}
