package com.simraninovation.bankingApi.service;

import com.simraninovation.bankingApi.model.Account;

import java.util.Set;

public interface AccountService extends CrudService<Account,Long> {

    Account findById(Long l);

    Account findByaccountNumber (String acct_id);

    void deleteById(Long idToDelete);
}

