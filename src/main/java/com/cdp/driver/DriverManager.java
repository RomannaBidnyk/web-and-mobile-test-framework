package com.cdp.driver;

import org.openqa.selenium.WebDriver;

/**
 * Created by romanna - 2019.
 */
public abstract class DriverManager {

    protected static WebDriver driver;

    protected abstract void createDriver();

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }
}
