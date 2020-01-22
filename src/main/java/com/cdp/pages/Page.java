package com.cdp.pages;

import com.cdp.decorator.CustomFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {

    public Page(WebDriver driver) {
        PageFactory.initElements(new CustomFieldDecorator(driver), this);
    }
}