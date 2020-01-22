package com.cdp.pages;

import com.cdp.decorator.Button;
import com.cdp.decorator.Input;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by romanna - 2019.
 */
public class HomePage extends Page {

    public static final String HOME_PAGE_URL = "https://www.livelib.ru";

    @FindBy(how = How.ID, using = "find-text")
    private Input searchField;

    @FindBy(how = How.ID, using = "//li/a[@href='/books' and text()='Что почитать']")
    private Button booksButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterDataToSearch(String dataToSearch) {
        searchField.sendKeys(dataToSearch);
        searchField.submit();
    }

    public void goToBooksPage() {
        booksButton.click();
    }
}
