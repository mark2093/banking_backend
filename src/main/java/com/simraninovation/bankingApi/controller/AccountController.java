package com.simraninovation.bankingApi.controller;

import com.simraninovation.bankingApi.model.Account;
import com.simraninovation.bankingApi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class AccountController {
    @Autowired
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/account/new")
    public String saveDetails(@RequestBody Account account) {
        System.out.println(account);
        Account save = accountService.save(account);
        return "Successfully Added " ;
    }
    @GetMapping("/account/{id}")
    @ResponseBody
    public Account getAccounteId(@PathVariable("id") String acct_id) {
        return accountService.findByaccountNumber(acct_id);

    }

    @GetMapping("/accounts")
    public @ResponseBody
    Set<Account> getAccounts()  {
        return accountService.findAll();


    }


}
