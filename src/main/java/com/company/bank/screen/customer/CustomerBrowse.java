package com.company.bank.screen.customer;

import io.jmix.ui.screen.*;
import com.company.bank.entity.Customer;

@UiController("Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
public class CustomerBrowse extends StandardLookup<Customer> {
}