package com.cdp.util;

import com.cdp.enums.OSDriverInfo;
import org.openqa.selenium.Platform;

/**
 * Created by romanna - 2019.
 */
public class OSUtil {

    private OSUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static OSDriverInfo getOS() {
        String osArch = System.getProperty("os.arch");
        Platform currentPlatform = Platform.getCurrent();
        if (currentPlatform.family() == Platform.WINDOWS) {
            if (osArch.contains("86")) {
                return OSDriverInfo.WINDOWS_86;
            } else {
                return OSDriverInfo.WINDOWS_64;
            }
        } else if (currentPlatform.family() == Platform.LINUX || currentPlatform.family() == Platform.UNIX) {
            if (osArch.contains("86")) {
                return OSDriverInfo.LINUX_86;
            } else {
                return OSDriverInfo.LINUX_64;
            }
        } else if (currentPlatform == Platform.MAC) {
            return OSDriverInfo.MACOS;
        } else {
            throw new AutomationException("Unable to define operating system");
        }
    }
}