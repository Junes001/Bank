package com.company.bank.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum TransactionType implements EnumClass<String> {

    WITHDRAW("-10"),
    DEPOSIT("10");

    private String id;

    TransactionType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TransactionType fromId(String id) {
        for (TransactionType at : TransactionType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}