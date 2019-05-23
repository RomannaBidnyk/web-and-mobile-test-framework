package com.cdp.web;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by romanna - 2019.
 */
public class HomePageTest extends BaseTest {

    //pass
    @Test
    public void testSearch() {
        homePage.enterDataToSearch("fgfb");
    }

//    //fail
//    @Test
//    public void testGoToBooks() {
//        homePage.goToBooksPage();
//    }

//    @Test
//    public void test1() {
//        TestPage testPage = homePage.goToTestPage();
//        Assert.assertTrue(testPage.isSomethingDisplayed());
//    }
}
