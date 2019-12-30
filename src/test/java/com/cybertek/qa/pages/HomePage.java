package com.cybertek.qa.pages;

import com.cybertek.qa.utilities.testUtilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//h1[@class=\"logo logo-text\"]")
    WebElement subTitle;

    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[1]")
    WebElement fleet;

    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[1]")
    WebElement customer;

    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[1]")
    WebElement activities;

    @FindBy(xpath = "//div[@id=\"main-menu\"]/ul/li[1]")
    WebElement system;

    @FindBy(xpath = "//a[@href=\"entity/Extend_Entity_Carreservation\"]")
    WebElement vehicles;

    @FindBy(xpath = "//span[@class=\"title title-level-2\"][contains(text(),'Vehicle Odometer')]")
    WebElement vehicleOdometer;

    Actions action=new Actions(Driver.get());

    public String verifySubtitle(){
        return subTitle.getText();
    }
    public boolean verifyFleet(){
        return fleet.isDisplayed();
    }

    public boolean verifyCustomer(){
        return customer.isDisplayed();
    }

    public boolean verifyActivities(){
        return activities.isDisplayed();
    }

    public boolean verifySystem(){
        return system.isDisplayed();
    }
    public VehiclesPage clickVehicles() throws InterruptedException {
        action.moveToElement(fleet).perform();
        Thread.sleep(1000);
        vehicles.click();
        return new VehiclesPage();
    }

    public VehicleOdometerPage clickVehicleOdometer() throws InterruptedException {
        action.moveToElement(fleet).perform();
        Thread.sleep(1000);
        vehicleOdometer.click();
        return new VehicleOdometerPage();
    }
}
