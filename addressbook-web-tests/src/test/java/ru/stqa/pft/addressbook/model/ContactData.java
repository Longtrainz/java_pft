package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String home_phone;
    private final String email;
    private String group;

    public ContactData(String firstname, String lastname, String home_phone, String email, String group) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.home_phone = home_phone;
        this.email = email;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getHome_phone() {
        return home_phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }
}
