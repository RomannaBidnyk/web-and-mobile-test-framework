package com.cdp.decorator;

import org.openqa.selenium.WebElement;

public class Text extends Element {

    public Text(WebElement webElement) {
        super(webElement);
    }

    public String getText() {
        return webElement.getText();
    }
}
