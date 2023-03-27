package com.simraninovation.bankingApi.repository;

import com.simraninovation.bankingApi.model.Transactions;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepository extends CrudRepository<Transactions, Long> {

    @Query(value = "select t.created_date,t.message,t.amount from transactions t where t.account_id = ?1 ", nativeQuery = true)
    List<Object> accountId(String id);
}
