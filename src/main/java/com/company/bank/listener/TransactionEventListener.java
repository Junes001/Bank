package com.company.bank.listener;

import com.company.bank.entity.Transaction;
import io.jmix.core.event.EntityChangedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class TransactionEventListener {

    @TransactionalEventListener
    public void onTransactionChangedAfterCommit(EntityChangedEvent<Transaction> event)
        if(transasction.value<transaction.buget){
            System.out.println("Value can't over more than budget");
    }
        else{
            transaction.budget=transaction.value+transaction.budget
    }
}