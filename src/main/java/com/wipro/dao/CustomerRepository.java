package com.wipro.dao;

 


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {
    public Customer findByAccountNumberAndPassword(String acc_number,String password);
    public Customer findByAccountNumber(String acc_number);
}