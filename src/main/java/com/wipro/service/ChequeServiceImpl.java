package com.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.dao.ChequeRepository;
import com.wipro.model.Cheque;
@Service
public class ChequeServiceImpl implements ChequeService {
	@Autowired
	private ChequeRepository chequeRepository;

	@Override
	public Cheque getByChequeId(String chequeNumber) {
		return this.chequeRepository.getById(chequeNumber);
	}
	

}
