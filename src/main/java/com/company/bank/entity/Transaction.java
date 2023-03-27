package com.company.bank.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "TRANSACTION_", indexes = {
        @Index(name = "IDX_TRANSACTION__CUSTOMER", columnList = "CUSTOMER_ID"),
        @Index(name = "IDX_TRANSACTION__STAFF", columnList = "STAFF_ID")
})
@Entity(name = "Transaction_")
public class Transaction {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "BANK_NAME", nullable = false)
    @NotNull
    private String bankName;

    @Column(name = "TRANSACTION_TYPE", nullable = false)
    @NotNull
    private String transactionType;

    @Column(name = "VALUE_", nullable = false)
    @NotNull
    private Integer value;

    @Column(name = "BUDGET")
    private Integer budget;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Customer customer;

    @JoinColumn(name = "STAFF_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Staff staff;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public TransactionType getTransactionType() {
        return transactionType == null ? null : TransactionType.fromId(transactionType);
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType == null ? null : transactionType.getId();
    }

    public BankName getBankName() {
        return bankName == null ? null : BankName.fromId(bankName);
    }

    public void setBankName(BankName bankName) {
        this.bankName = bankName == null ? null : bankName.getId();
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}