package com.wipro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.model.Cheque;
@Repository
public interface ChequeRepository extends JpaRepository<Cheque,String> {

}
