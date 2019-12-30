package com.cybertek.qa.pages;

import com.cybertek.qa.utilities.testUtilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage {

    public VehiclesPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//h1[@class=\"oro-subtitle\"]")
    WebElement cars;

    public boolean verifyCarsTitle(){
        return cars.isDisplayed();
    }
}
