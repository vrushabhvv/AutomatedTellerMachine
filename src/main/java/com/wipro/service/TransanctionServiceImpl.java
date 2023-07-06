package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.wipro.dao.TransanctionRepository;
import com.wipro.model.Transanction;
@Service
public class TransanctionServiceImpl implements TransactionService {
	@Autowired
	TransanctionRepository transanctionRepository;
	@Override
	public Transanction saveTransanction(Transanction transanction) {
		return this.transanctionRepository.save(transanction);
	}
	@Override
	public List<Transanction> getAllTransanction(int cid) {
		return transanctionRepository.findTransactionsByCustomerId(cid);
	}
}
