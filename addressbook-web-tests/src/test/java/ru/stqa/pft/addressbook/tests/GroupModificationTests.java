package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.GroupHelper;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by User on 10.03.2016.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test4", "test5", "test6"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }

}