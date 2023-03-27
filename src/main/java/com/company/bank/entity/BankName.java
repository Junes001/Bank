package com.company.bank.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum BankName implements EnumClass<String> {

    VIETCOMBANK("VCB"),
    SACOMBANK("SCB");

    private String id;

    BankName(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static BankName fromId(String id) {
        for (BankName at : BankName.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}