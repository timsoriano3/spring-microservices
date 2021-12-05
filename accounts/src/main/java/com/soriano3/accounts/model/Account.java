package com.soriano3.accounts.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter @Setter @ToString
public class Account {
    @Column(name = "customer_id")
    private int customerId;
    @Id
    @Column(name = "account_number")
    private long accountNumber;
    @Column(name="account_type")
    private String accountType;
    @Column(name = "branch_address")
    private String branchAddress;
    @Column(name = "creation_date")
    private LocalDate creationDate;
}
