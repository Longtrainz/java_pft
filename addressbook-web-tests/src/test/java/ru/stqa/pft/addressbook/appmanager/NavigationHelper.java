package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by User on 08.03.2016.
 */
public class NavigationHelper extends HelperBase {

    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        click(By.name("searchform"));
        click(By.linkText("groups"));
    }

    public void gotoAddNewPage() {
        click(By.name("searchform"));
        click(By.linkText("add new"));
    }

}
