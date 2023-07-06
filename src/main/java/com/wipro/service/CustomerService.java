package com.wipro.service;

 

import com.wipro.model.Cheque;
import com.wipro.model.Customer;
import java.util.List;

 

interface CustomerService {

    public Customer getCustomerByAccountAndPassword(String email,String password);
    public Customer updateAfterWithdrawl(Customer customer);
    public List<Customer> getAllCustomer();
    public Customer updatePin(Customer customer);
	public Customer updatePassword(Customer customer);
	Customer getCustomerByAccount(String user);

}
