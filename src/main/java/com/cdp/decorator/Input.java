package com.cdp.decorator;

import org.openqa.selenium.WebElement;

public class Input extends Element {

    public Input(WebElement webElement) {
        super(webElement);
    }

    public void sendKeys(String email) {
        webElement.sendKeys(email);
    }

    public void submit() {
        webElement.submit();
    }
}
