package com.cdp.driver;

import com.cdp.enums.Browser;
import com.cdp.util.AutomationException;

/**
 * Created by romanna - 2019.
 */

public class DriverManagerFactory {

    public static DriverManager getManager(Browser type) {

        DriverManager driverManager;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
//            case FIREFOX:
//                driverManager = new FirefoxDriverManager();
//                break;
            default:
                throw new AutomationException("There is no properties defined for - " + type.name());

        }
        return driverManager;
    }
}
