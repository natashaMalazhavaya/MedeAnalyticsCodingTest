package com.ua.learning.project.implementation.menu;

import com.ua.learning.project.implementation.BaseTest;
import com.ua.learning.project.model.pages.ui.Page;
import com.ua.learning.project.model.pages.ui.implementation.menu.AbcMenu;
import com.ua.learning.project.model.pages.ui.implementation.menu.CDIMenu;
import com.ua.learning.project.model.pages.ui.implementation.menu.MainMenu;
import org.testng.annotations.Test;

public class MenuTest extends BaseTest {

    @Test
    public void selectAllMenu() {
        Page abcPage = new AbcMenu();
        Page cdiPage = new CDIMenu();
        Page mainPage = new MainMenu();
        abcPage.selectMenu();
        cdiPage.selectMenu();
        mainPage.selectMenu();
    }

    @Test
    public void selectABCMenu() {
        Page abcPage = new AbcMenu();
        abcPage.selectMenu();
    }

}
