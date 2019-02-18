package com.cdp.web;

import com.cdp.driver.DriverManager;
import com.cdp.driver.DriverManagerFactory;
import com.cdp.enums.Browser;
import com.cdp.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

/**
 * Created by romanna - 2019.
 */
public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;

    /*
    * If xml file contains parameter "browser" - use it
    * if no - NO_BROWSER_SELECTED - check if browser is passed from system properties
    * if no - throw exception
    * */

    @Parameters("browser")
    @BeforeClass
    public void start(@Optional("NO_BROWSER_SELECTED") Browser browser) {
        if (!browser.equals(Browser.NO_BROWSER_SELECTED)) {
            driver = DriverManagerFactory.getManager(browser).getDriver();
        } else {
            if (System.getProperty("browser") != null) {
                driver = DriverManagerFactory.getManager(Browser.valueOf(System.getProperty("browser"))).getDriver();
            } else {
                throw new RuntimeException("Browser is not specified");
            }
        }
    }

    @BeforeMethod
    public void openHomePage() {
        driver.get(HomePage.homePageURL);
        homePage = new HomePage(driver);
    }

    @AfterTest
    public void tearDown() {
        DriverManager.quitDriver();
    }

}
