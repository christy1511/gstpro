package com.training.gst.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.training.gst.entity.Gsta;
import com.training.gst.repository.GstaRepository;

 @Repository
public class GstaDao {
	 @Autowired
	 GstaRepository gstaRepo;
	 public String addGsta(Gsta gsta) {
		gstaRepo.save(gsta);
		return "saved";
	 }
 
	 public int getByPercentage(int hsn) {
		 return gstaRepo.getPerByHsn(hsn);
	 }

 }



