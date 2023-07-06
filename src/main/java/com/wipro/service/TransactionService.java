package com.wipro.service;

import com.wipro.model.Transanction;
import java.util.*;

public interface TransactionService {
	public Transanction saveTransanction(Transanction transanction);
	public List<Transanction> getAllTransanction(int cid);
}
