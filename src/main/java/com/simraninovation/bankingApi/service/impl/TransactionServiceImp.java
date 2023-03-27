package com.simraninovation.bankingApi.service.impl;

import com.simraninovation.bankingApi.model.Transactions;
import com.simraninovation.bankingApi.repository.TransactionRepository;
import com.simraninovation.bankingApi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class TransactionServiceImp implements TransactionService {
    @Autowired
    private final TransactionRepository transactionRepository;

    public TransactionServiceImp(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Set<Transactions> findAll() {
        return null;
    }

    @Override
    public Transactions save(Transactions object) {
        return transactionRepository.save(object);
    }

    @Override
    public Transactions findById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Object> findByaccountId(String Id) {
        System.out.println(Id);
        List<Object> rawList = transactionRepository.accountId(Id);
        List<Object> resultList = new ArrayList(rawList.size());
        for (Object rw : rawList) {
            System.out.println(rw);
            resultList.add(rw);
            return resultList;

        }
        return resultList;
    }

    @Override
    public void delete() {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
