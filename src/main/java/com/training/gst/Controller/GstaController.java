package com.training.gst.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.training.gst.entity.Gsta;
import com.training.gst.service.GstaService;


@RestController
public class GstaController {
	@Autowired
	GstaService gstaSer;

	@PostMapping(value = "/addGsta")
	public String addGsta(@RequestBody Gsta gsta) {
		return gstaSer.addGsta(gsta);

	}
	
	
	@GetMapping(value="/getHsn/{hsn}")
	public int getByPercentage(@PathVariable int hsn) {
		return gstaSer.getByPercentage(hsn);
	}



}
