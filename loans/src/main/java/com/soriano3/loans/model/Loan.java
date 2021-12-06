package com.soriano3.loans.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Getter @Setter @ToString
public class Loan {
    @Id
    @GeneratedValue
    @Column(name = "loan_number")
    private int loanNumber;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "loan_duration")
    private int loanDuration;

    @Column(name = "loan_type")
    private String loanType;

    @Column(name = "total_loan")
    private int totalLoan;

    @Column(name = "amount_paid")
    private int amountPaid;

    @Column(name = "amount_outstanding")
    private int amountOutstanding;

    @Column(name = "creation_date")
    private Date creationDate;
}
