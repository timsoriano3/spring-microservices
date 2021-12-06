package com.soriano3.loans.repository;

import com.soriano3.loans.model.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends CrudRepository<Loan, Long> {
    List<Loan> findByCustomerIdOrderByStartDateDesc(int customerId);
}
