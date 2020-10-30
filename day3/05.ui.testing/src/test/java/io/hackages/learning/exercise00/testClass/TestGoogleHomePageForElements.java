package io.hackages.learning.exercise00.testClass;

import io.hackages.learning.base.TestNgTestBase;
import io.hackages.learning.exercise00.pages.GoogleHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGoogleHomePageForElements extends TestNgTestBase {

    private GoogleHomePage pageToTest;

    @BeforeMethod
    public void initPageObjects() {
        pageToTest = PageFactory.initElements(driver, GoogleHomePage.class);
    }

    @Test
    public void test_lucky_search_from_home_page() throws InterruptedException {

        String txtSearch = "is the sky blue";
        pageToTest.setTxtSearch(txtSearch);
        Thread.sleep(15000);

        Assert.assertEquals(pageToTest.getLuckySearchText(), txtSearch);
    }

    @Test
    public void test_search_from_home_page() throws InterruptedException {

        String txtSearch = "good music";
        pageToTest.setTxtSearch(txtSearch);
        Thread.sleep(15000);

        Assert.assertEquals(pageToTest.getSearchText(), txtSearch);
    }

}
