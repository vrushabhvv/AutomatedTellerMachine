package com.wipro.model;

 

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

 

@Entity
public class Customer {
    @Id
    private int cust_id;
    private String firstName;
    private String lastName;
    private String accountNumber;
    private double currentBalance;
    private String password;
    private String pin;
    private String bankName;
    private String bankBranch;
  
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	List< Transanction> transanction ;
    public Customer() {
        super();
    }
	public Customer(int cust_id, String firstName, String lastName, String accountNumber, double currentBalance,
			String password, String pin, String bankName, String bankBranch, List<Transanction> transanction) {
		super();
		this.cust_id = cust_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
		this.password = password;
		this.pin = pin;
		this.bankName = bankName;
		this.bankBranch = bankBranch;
		this.transanction = transanction;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public List<Transanction> getTransanction() {
		return transanction;
	}
	public void setTransanction(List<Transanction> transanction) {
		this.transanction = transanction;
	}
	
	
	
   


}