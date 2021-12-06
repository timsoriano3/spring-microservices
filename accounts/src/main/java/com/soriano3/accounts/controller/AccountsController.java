package com.soriano3.accounts.controller;

import com.soriano3.accounts.model.Account;
import com.soriano3.accounts.model.Customer;
import com.soriano3.accounts.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    @Autowired
    private AccountsRepository accountsRepository;

    @PostMapping("/myAccount")
    public Account getAccountDetails(@RequestBody Customer customer) {
        Account account = accountsRepository.findByCustomerId(customer.getCustomerId());
        if (account == null)
            return null;
        return account;
    }
}
