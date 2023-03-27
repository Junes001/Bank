package com.company.bank.screen.bankbranch;

import io.jmix.ui.screen.*;
import com.company.bank.entity.BankBranch;

@UiController("BankBranch.browse")
@UiDescriptor("bank-branch-browse.xml")
@LookupComponent("bankBranchesTable")
public class BankBranchBrowse extends StandardLookup<BankBranch> {
}