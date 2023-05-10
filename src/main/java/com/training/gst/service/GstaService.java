package com.training.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.training.gst.Dao.GstaDao;
import com.training.gst.entity.Gsta;


@Service
public class GstaService {
	@Autowired
	GstaDao gstaDao;

	public String addGsta(Gsta gsta) {
		return gstaDao.addGsta(gsta);
	}
	 public int getByPercentage(int hsn) {
		 return gstaDao.getByPercentage(hsn);

	 
	 }
	
}
