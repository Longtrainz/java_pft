package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().createContact(new ContactData("Vladyslav", "Bukach", "777-777", "vladyslav.bukach@gmail.com", "test1"));
        
    }

}
