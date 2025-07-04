package com.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.Dao.bankDao;
import com.demo.Entity.bankEntity;
@Service
public class bankService {
@Autowired
bankDao bd;
	public String get1(@RequestBody List<bankEntity> e) {
		
		return bd.get1(e);
	}
	public List<bankEntity> get2() {

		return bd.get2();
	}
	public String get3(String ifsccode) {
	
		return bd.get3(ifsccode);
	}

}
