package com.company.bank.screen.staff;

import io.jmix.ui.screen.*;
import com.company.bank.entity.Staff;

@UiController("Staff.browse")
@UiDescriptor("staff-browse.xml")
@LookupComponent("staffsTable")
public class StaffBrowse extends StandardLookup<Staff> {
}