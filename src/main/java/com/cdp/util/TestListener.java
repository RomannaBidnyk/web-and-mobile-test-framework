package com.cdp.util;

import com.cdp.driver.DriverManagerFactory;
import com.cdp.enums.Browser;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * Created by romanna - 2019.
 */
public class TestListener extends TestListenerAdapter {

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenShotPNG(WebDriver webDriver) {
        return ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        saveScreenShotPNG(DriverManagerFactory.getManager(Browser.valueOf(System.getProperty("browser"))).getDriver());
    }
}

