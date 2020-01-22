package com.cdp.decorator;

import org.openqa.selenium.WebElement;

public class Element implements IElement {
    //aggregation
    protected WebElement webElement;

    public Element(WebElement webElement) {
        this.webElement = webElement;
    }
}
