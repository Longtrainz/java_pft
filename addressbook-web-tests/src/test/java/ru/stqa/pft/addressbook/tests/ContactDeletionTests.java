package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by User on 10.03.2016.
 */
public class ContactDeletionTests  extends TestBase {

    @Test
    public void testContactDeletion(){
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().submitContactDeletion();
        app.getNavigationHelper().goToHomePage();
    }
}
