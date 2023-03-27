package com.company.bank.screen.bank;

import io.jmix.ui.screen.*;
import com.company.bank.entity.Bank;

@UiController("Bank.edit")
@UiDescriptor("bank-edit.xml")
@EditedEntityContainer("bankDc")
public class BankEdit extends StandardEditor<Bank> {
}