package com.simraninovation.bankingApi.service;

import com.simraninovation.bankingApi.model.PayeeDetails;

public interface PayeeService extends CrudService<PayeeDetails, Long> {


    PayeeDetails findById(Long id);

    PayeeDetails findByAccountId(Long id);
}
