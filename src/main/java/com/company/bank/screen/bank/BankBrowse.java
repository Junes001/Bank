package com.company.bank.screen.bank;

import io.jmix.ui.screen.*;
import com.company.bank.entity.Bank;

@UiController("Bank.browse")
@UiDescriptor("bank-browse.xml")
@LookupComponent("banksTable")
public class BankBrowse extends StandardLookup<Bank> {
}