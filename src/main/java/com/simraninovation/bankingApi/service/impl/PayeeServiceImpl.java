package com.simraninovation.bankingApi.service.impl;

import com.simraninovation.bankingApi.model.PayeeDetails;
import com.simraninovation.bankingApi.repository.PayeeRepository;
import com.simraninovation.bankingApi.service.PayeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PayeeServiceImpl implements PayeeService {
    @Autowired
    private PayeeRepository payeeRepository;

    public PayeeServiceImpl(PayeeRepository payeeRepository) {
        this.payeeRepository = payeeRepository;
    }

    @Override
    public Set<PayeeDetails> findAll() {
        return null;
    }

    @Override
    public PayeeDetails save(PayeeDetails object) {
        return payeeRepository.save(object);
    }

    @Override
    public void delete() {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public PayeeDetails findById(Long id) {
        return null;
    }

    @Override
    public PayeeDetails findByAccountId(Long id) {
        return payeeRepository.findByaccountId(id);
    }
}
