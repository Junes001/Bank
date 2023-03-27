package com.company.bank.screen.customer;

import io.jmix.ui.screen.*;
import com.company.bank.entity.Customer;

@UiController("Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
public class CustomerEdit extends StandardEditor<Customer> {
}