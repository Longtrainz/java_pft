package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by User on 10.03.2016.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        app.getGroupHelper().selectContact();
        app.getGroupHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Vlady", "Bukach", "999-999", "vladyslav.bukach@mail.com"));
        app.getGroupHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }

}
