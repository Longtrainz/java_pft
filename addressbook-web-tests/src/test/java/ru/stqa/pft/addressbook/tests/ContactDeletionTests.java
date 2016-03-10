package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by User on 10.03.2016.
 */
public class ContactDeletionTests  extends TestBase {

    @Test
    public void testContactDeletion(){
        app.getGroupHelper().selectContact();
        app.getGroupHelper().deleteSelectedContacts();
        app.getGroupHelper().submitContactDeletion();
        app.getContactHelper().returnToHomePage();
    }
}
