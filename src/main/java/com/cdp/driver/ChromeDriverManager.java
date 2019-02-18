package com.cdp.driver;

import com.cdp.enums.Browser;
import com.cdp.util.OSUtil;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by romanna - 2019.
 */
public class ChromeDriverManager extends DriverManager {

    private final String driverName = OSUtil.getOS().getDriverName(Browser.CHROME);
    private final String driverLocation = OSUtil.getOS().getPath(Browser.CHROME);

    @Override
    public void createDriver() {
        System.setProperty(driverName, driverLocation);
        driver = new ChromeDriver();
    }
}

