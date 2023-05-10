package com.training.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.training.gst.entity.Gsta;

 public interface GstaRepository extends JpaRepository <Gsta,Integer> {
	@Query(value = "select percentage from gsta where hsn=? ", nativeQuery = true)
	 public Integer getPerByHsn(int hsn);
	

}
