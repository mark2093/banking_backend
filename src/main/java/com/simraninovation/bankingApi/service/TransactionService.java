package com.simraninovation.bankingApi.service;

import com.simraninovation.bankingApi.model.Transactions;

import java.util.List;

public interface TransactionService extends CrudService<Transactions, Long>{

        Transactions findById(Long id);

        List<Object>  findByaccountId(String Id);

}
