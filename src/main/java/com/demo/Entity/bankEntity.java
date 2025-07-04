package com.demo.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bank_table")
public class bankEntity {
	
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;


private String bankName;
private String ifsccode;
private String branchName;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getIFSCCode() {
	return ifsccode;
}
public void setIFSCCode(String ifsccode) {
	this.ifsccode = ifsccode;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}


}
