package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by User on 10.03.2016.
 */
public class ContactDeletionTests  extends TestBase {

    @Test
    public void testContactDeletion(){
        if(! app.getContactHelper().isThereAContact()) {
                app.getContactHelper().createContact(new ContactData("Vladyslav", "Bukach", "777-777", "vladyslav.bukach@gmail.com", "test1"));
        }
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().submitContactDeletion();
        app.getNavigationHelper().goToHomePage();
    }
}
