package com.company.bank.screen.transaction;

import io.jmix.ui.screen.*;
import com.company.bank.entity.Transaction;

@UiController("Transaction_.edit")
@UiDescriptor("transaction-edit.xml")
@EditedEntityContainer("transactionDc")
public class TransactionEdit extends StandardEditor<Transaction> {
}