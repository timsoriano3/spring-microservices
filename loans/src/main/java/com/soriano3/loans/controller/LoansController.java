package com.soriano3.loans.controller;

import com.soriano3.loans.model.Customer;
import com.soriano3.loans.model.Loan;
import com.soriano3.loans.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoansController {
    @Autowired
    private LoansRepository loansRepository;

    @PostMapping("/myLoans")
    public List<Loan> getLoanDetails(@RequestBody Customer customer) {
        List<Loan> loans = loansRepository.findByCustomerIdOrderByStartDateDesc(customer.getCustomerId());
        if (loans.size() == 0 || loans == null) {
            return null;
        }
        return loans;
    }
}
