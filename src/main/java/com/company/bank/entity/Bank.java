package com.company.bank.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "BANK")
@Entity
public class Bank {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "BANK_NAME", nullable = false)
    @NotNull
    private String bankName;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public BankName getBankName() {
        return bankName == null ? null : BankName.fromId(bankName);
    }

    public void setBankName(BankName bankName) {
        this.bankName = bankName == null ? null : bankName.getId();
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