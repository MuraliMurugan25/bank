package com.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.Entity.bankEntity;
import com.demo.Repository.bankRepository;
@Repository
public class bankDao {
@Autowired
bankRepository br;
	public String get1(@RequestBody List<bankEntity> e) {
		br.saveAll(e);
		return "save SucessFully";
	}
	public List<bankEntity> get2() {
		return br.findAll();
	}
	public String get3(String ifsccode) {
		
		return br.get3(ifsccode);
	}

}
