package com.thinkconstructive.rest.emo.service;

import java.util.List;

import com.thinkconstructive.rest.emo.model.CloudVendor;

public interface CloudVendorService {
	public String createCloudVendor(CloudVendor cloudvendor);
	public String updateCloudVendor(CloudVendor cloudvendor);
	public String deleteCloudVendor(String cloudVendorId);
	public CloudVendor getCloudVendor(String CloudVendorId);
	public  List<CloudVendor>getAllCloudvendors();
	

}
