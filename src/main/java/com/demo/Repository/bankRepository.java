package com.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.Entity.bankEntity;


public interface bankRepository  extends JpaRepository<bankEntity,Integer> {

	
	@Query(value = "SELECT bank_name FROM bank_table  WHERE ifsccode = ? ;",nativeQuery = true)
	String get3(String ifsccode);

}
