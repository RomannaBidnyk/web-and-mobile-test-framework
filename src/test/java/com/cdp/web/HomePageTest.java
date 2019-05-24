package com.cdp.web;

import com.cdp.util.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by romanna - 2019.
 */
@Listeners({TestListener.class})
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
