package com.simraninovation.bankingApi.repository;

import com.simraninovation.bankingApi.model.PayeeDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayeeRepository extends CrudRepository<PayeeDetails, Long> {

    PayeeDetails findByaccountId(Long id);
}
