package com.cybertek.qa.tests;

import com.cybertek.qa.utilities.testUtilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.cybertek.qa.pages.HomePage;
import com.cybertek.qa.pages.LoginPage;
import com.cybertek.qa.pages.VehicleOdometerPage;
import com.cybertek.qa.pages.VehiclesPage;

public class HomePageTest {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    VehiclesPage vehiclePage=new VehiclesPage();
    VehicleOdometerPage vehicleOdometerPage=new VehicleOdometerPage();

    @Test
    public void homePageSubTitleTest(){
        loginPage.login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));
        String subTitle=homePage.verifySubtitle();
        Assert.assertEquals(subTitle, "Fleet", "Different title...");
    }
    @Test
    public void fleetTest(){
        loginPage.login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));
        boolean fleet=homePage.verifyFleet();
        Assert.assertTrue(fleet);
    }

    @Test
    public void customerTest(){
        loginPage.login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));
        boolean customer=homePage.verifyCustomer();
        Assert.assertTrue(customer);
    }

    @Test
    public void activitiesTest(){
        loginPage.login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));
        boolean activities=homePage.verifyActivities();
        Assert.assertTrue(activities);
    }

    @Test
    public void systemTest(){
        loginPage.login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));
        boolean system=homePage.verifySystem();
        Assert.assertTrue(system);
    }

    @Test
    public VehiclesPage clickOnVehicles() throws InterruptedException {
        loginPage.login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));
        return homePage.clickVehicles();
    }

    @Test
    public VehicleOdometerPage clickOnVehicleOdometer() throws InterruptedException {
        loginPage.login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));
        return homePage.clickVehicleOdometer();
    }
}
