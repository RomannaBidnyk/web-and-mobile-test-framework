package com.cdp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by romanna - 2019.
 */
public class HomePage{

    public static final String homePageURL = "https://www.livelib.ru";

    @FindBy(how = How.ID, using = "find-text")
    private WebElement searchField;

    @FindBy(how = How.ID, using = "//li/a[@href='/books' and text()='Что почитать']")
    private WebElement booksButton;

    @FindBy(xpath = "")
    private WebElement testButton;

    public HomePage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public void enterDataToSearch(String dataToSearch) {
        searchField.sendKeys(dataToSearch);
        searchField.submit();
    }

    public void goToBooksPage() {
        booksButton.click();
    }
}
