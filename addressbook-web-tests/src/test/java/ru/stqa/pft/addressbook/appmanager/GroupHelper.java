package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by User on 08.03.2016.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.xpath("//div[@id='content']/form/input[5]"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void createGroup(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupPage();
    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));

    }

    public int getGroupCount() {
        return wd.findElements(By.name("selected[]")).size();
    }
}
//div/div[4]/form[2]/table/tbody/tr[2]/td[1]/input - выбрать контакт

//table[@id='maintable']/tbody/tr[2]/td[8]/a/img - нажать edit

//div[@id='content']/form[1]/input[22] -update изменений контакта

//div/div[4]/form[2]/div[2]/input - кнопка delete для контакта

//Для закрытия диалогового окна (alert), которое появляется при удалении контакта, нужно использовать такую команду драйвера:
//wd.switchTo().alert().accept();
