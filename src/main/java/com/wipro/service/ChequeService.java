package com.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.dao.ChequeRepository;
import com.wipro.model.Cheque;
public interface ChequeService {
	public Cheque getByChequeId(String chequeNumber);
}
