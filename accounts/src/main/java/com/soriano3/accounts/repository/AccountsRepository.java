package com.soriano3.accounts.repository;

import com.soriano3.accounts.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Account, Long> {
    Account findByCustomerId(int customerId);
}
