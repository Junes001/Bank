package com.company.bank.screen.user;

import com.company.bank.entity.User;
import io.jmix.ui.UiComponents;
import io.jmix.ui.component.Component;
import io.jmix.ui.component.FileStorageResource;
import io.jmix.ui.component.Image;
import io.jmix.ui.navigation.Route;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("User.browse")
@UiDescriptor("user-browse.xml")
@LookupComponent("usersTable")
@Route("users")
public class UserBrowse extends StandardLookup<User> {
    @Autowired
    private UiComponents uiComponents;
    @Install(to = "usersTable.avata", subject = "columnGenerator")

    private Component usersTableAvataColumnGenerator(User user) {
        if (user.getAvata() != null) {
            Image image = uiComponents.create(Image.class);
            image.setScaleMode(Image.ScaleMode.CONTAIN);
            image.setSource(FileStorageResource.class)
                    .setFileReference(user.getAvata());
            image.setWidth("30px");
            image.setHeight("30px");
            return image;
        } else {
        return null;
    }
}}