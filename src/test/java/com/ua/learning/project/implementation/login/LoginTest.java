package com.ua.learning.project.implementation.login;

import com.ua.learning.project.implementation.BaseTest;
import com.ua.learning.project.model.pages.ui.implementation.login.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginSystem() {
        LoginPage loginPage = new LoginPage("http://www.google.com.ua");
        loginPage.openWindow();
    }

}
