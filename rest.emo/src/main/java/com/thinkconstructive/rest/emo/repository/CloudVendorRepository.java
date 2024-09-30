package com.thinkconstructive.rest.emo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.thinkconstructive.rest.emo.model.CloudVendor;



@Repository
public interface CloudVendorRepository extends JpaRepositoryImplementation<CloudVendor, String> {

}
