package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.bankEntity;
import com.demo.Service.bankService;

@RestController
@RequestMapping(value = "/Bank")
public class bankController {
@Autowired
bankService bs;
@PostMapping(value = "/bank1")
public String get1( @RequestBody List<bankEntity> e) {
	return bs.get1(e);
}
@GetMapping(value = "/bank2")
public List<bankEntity> get2() {
	return bs.get2();
}
@GetMapping(value = "bank3/{ifsccode}")
public String get3(@PathVariable String ifsccode) {
	return bs.get3(ifsccode);
}

}

