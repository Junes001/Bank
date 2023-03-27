package com.company.bank.screen.staff;

import io.jmix.ui.screen.*;
import com.company.bank.entity.Staff;

@UiController("Staff.edit")
@UiDescriptor("staff-edit.xml")
@EditedEntityContainer("staffDc")
public class StaffEdit extends StandardEditor<Staff> {
}