package com.wipro.model;



import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transanction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long tid;
	private String tdesc;
	private LocalDate date;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId")
	private Customer customer;
	public Transanction() {
		super();
	}
	public Transanction(long tid, String tdesc, Customer customer,LocalDate date) {
		super();
		this.tid = tid;
		this.tdesc = tdesc;
		this.customer = customer;
		this.date=date;
	}
	public long getTid() {
		return tid;
	}
	public void setTid(long tid) {
		this.tid = tid;
	}
	public String getTdesc() {
		return tdesc;
	}
	public void setTdesc(String tdesc) {
		this.tdesc = tdesc;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Transanction [tid=" + tid + ", tdesc=" + tdesc + ", date=" + date + ", customer=" + customer + "]";
	}
	
	
	
}
