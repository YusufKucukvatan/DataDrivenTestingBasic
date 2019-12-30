package com.cybertek.qa.utilities.listeners;

import com.cybertek.qa.tests.TestBase;
import com.cybertek.qa.utilities.testUtilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.io.IOException;

public class WebEventListener extends TestBase implements WebDriverEventListener {
    @Override
    public void beforeAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("Navigating to: "+url);
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println("Navigated to: "+url);

    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("Navigating to previous page");
    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
        System.out.println("Navigated to previous page");

    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {

    }

    @Override
    public void afterNavigateForward(WebDriver driver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver driver) {
        System.out.println("Trying to find "+webElement+" using "+by);
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver driver) {
        System.out.println("found "+webElement+" using "+by);

    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver driver) {
        System.out.println("Trying to click on +"+webElement.toString());
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver driver) {
        System.out.println("Clicked on +"+webElement.toString());

    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver driver, CharSequence[] charSequences) {

    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    @Override
    public void beforeScript(String s, WebDriver driver) {

    }

    @Override
    public void afterScript(String s, WebDriver driver) {

    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver driver) {

    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver driver) {

    }

    @Override
    public void onException(Throwable error, WebDriver driver) {
        System.out.println("Execption occured "+error);
        try{

            BrowserUtils.getScreenshot( " ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver driver) {

    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver driver, String s) {

    }
}
