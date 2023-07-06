package com.wipro.service;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.wipro.dao.CustomerRepository;
import com.wipro.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public Customer getCustomerByAccountAndPassword(String acc_number,String password) {
        Customer ac = this.customerRepository.findByAccountNumberAndPassword(acc_number, password);
        System.out.println(ac);
        return this.customerRepository.findByAccountNumberAndPassword(acc_number, password);
    }
	@Override
	public Customer updateAfterWithdrawl(Customer customer) {
		return this.customerRepository.save(customer);
	}
	@Override
	public List<Customer> getAllCustomer() {
		return this.customerRepository.findAll();
	}
	@Override
	public Customer updatePin(Customer customer) {
		return this.customerRepository.save(customer);
	}
	@Override
	public Customer updatePassword(Customer customer) {
		return this.customerRepository.save(customer);
	}
	@Override
	public Customer getCustomerByAccount(String user) {
		return this.customerRepository.findByAccountNumber(user);
	}
}