package com.simraninovation.bankingApi.repository;

import com.simraninovation.bankingApi.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {

    Account findByaccountNumber(String id);
}
