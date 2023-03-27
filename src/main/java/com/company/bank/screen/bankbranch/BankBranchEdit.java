package com.company.bank.screen.bankbranch;

import io.jmix.ui.screen.*;
import com.company.bank.entity.BankBranch;

@UiController("BankBranch.edit")
@UiDescriptor("bank-branch-edit.xml")
@EditedEntityContainer("bankBranchDc")
public class BankBranchEdit extends StandardEditor<BankBranch> {
}