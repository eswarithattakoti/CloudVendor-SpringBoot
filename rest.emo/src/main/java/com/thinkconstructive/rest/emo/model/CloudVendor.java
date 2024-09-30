package com.thinkconstructive.rest.emo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloudvendor")
public class CloudVendor {
	@Id
	private String vendorId;
	private String vendorname;
	private String vendoraddress;
	private String vendorphonenumber;

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

	public String getVendoraddress() {
		return vendoraddress;
	}

	public void setVendoraddress(String vendoraddress) {
		this.vendoraddress = vendoraddress;
	}

	public String getVendorphonenumber() {
		return vendorphonenumber;
	}

	public void setVendorphonenumber(String vendorphonenumber) {
		this.vendorphonenumber = vendorphonenumber;
	}

	public CloudVendor(String vendorId, String vendorname, String vendoraddress, String vendorphonenumber) {
		super();
		this.vendorId = vendorId;
		this.vendorname = vendorname;
		this.vendoraddress = vendoraddress;
		this.vendorphonenumber = vendorphonenumber;
	}

	@Override
	public String toString() {
		return "CloudVendor [vendorId=" + vendorId + ", vendorname=" + vendorname + ", vendoraddress=" + vendoraddress
				+ ", vendorphonenumber=" + vendorphonenumber + "]";
	}
	
	
	
	
}