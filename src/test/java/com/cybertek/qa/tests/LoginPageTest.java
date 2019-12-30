package com.cybertek.qa.tests;

import com.cybertek.qa.utilities.testUtilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.cybertek.qa.pages.HomePage;
import com.cybertek.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
    LoginPage loginPage = new LoginPage();
    HomePage homePage=new HomePage();

    @Test
    public void login(){

        String username=ConfigurationReader.get("sales_manager_username");
        String password=ConfigurationReader.get("sales_manager_password");
        loginPage.login(username,password);
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/");

    }
}
