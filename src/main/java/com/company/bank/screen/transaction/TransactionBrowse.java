package com.company.bank.screen.transaction;

import io.jmix.ui.screen.*;
import com.company.bank.entity.Transaction;

@UiController("Transaction_.browse")
@UiDescriptor("transaction-browse.xml")
@LookupComponent("transactionsTable")
public class TransactionBrowse extends StandardLookup<Transaction> {
}