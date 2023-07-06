package com.wipro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Cheque {
	@Id
	private String checkNumber;
	private String fname;
	private String lname;
	private String accNumber;
	private String amountWord;
	private String amountNumber;
	private String bankBranch;
	private String bankName;
	public Cheque() {
		super();
	}
	public String getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getAmountWord() {
		return amountWord;
	}
	public void setAmountWord(String amountWord) {
		this.amountWord = amountWord;
	}
	public String getAmountNumber() {
		return amountNumber;
	}
	public void setAmountNumber(String amountNumber) {
		this.amountNumber = amountNumber;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public Cheque(String checkNumber, String fname, String lname, String accNumber, String amountWord,
			String amountNumber, String bankBranch, String bankName) {
		super();
		this.checkNumber = checkNumber;
		this.fname = fname;
		this.lname = lname;
		this.accNumber = accNumber;
		this.amountWord = amountWord;
		this.amountNumber = amountNumber;
		this.bankBranch = bankBranch;
		this.bankName = bankName;

	}
	@Override
	public String toString() {
		return "Cheque [checkNumber=" + checkNumber + ", fname=" + fname + ", lname=" + lname + ", accNumber="
				+ accNumber + ", amountWord=" + amountWord + ", amountNumber=" + amountNumber + ", bankBranch="
				+ bankBranch + ", bankName=" + bankName + "]";
	}
	

}
