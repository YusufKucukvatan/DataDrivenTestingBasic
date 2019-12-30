package com.cybertek.qa.pages;

import com.cybertek.qa.utilities.testUtilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id="prependedInput")
    public WebElement username;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(id="_submit")
    public WebElement submit;

    public HomePage login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submit.click();
        return new HomePage();
    }

}
