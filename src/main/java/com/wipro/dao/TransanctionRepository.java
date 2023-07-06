package com.wipro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.model.Transanction;

import jakarta.transaction.Transaction;

@Repository
public interface TransanctionRepository extends JpaRepository<Transanction,Long> {
    @Query(value = "SELECT * FROM transanction WHERE customer_id = :customerId", nativeQuery = true)
    List<Transanction> findTransactionsByCustomerId(@Param("customerId") int customerId);
}
