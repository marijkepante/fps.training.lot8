package io.hackages.learning.exercise00.testClass;

import io.hackages.learning.base.TestNgTestBase;
import io.hackages.learning.exercise00.pages.GoogleHomePage;
import io.hackages.learning.exercise00.pages.RandomElementsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestElementsDropdown extends TestNgTestBase {

    private RandomElementsPage pageToTest;

    @BeforeMethod
    public void initPageObjects() {
        pageToTest = PageFactory.initElements(driver, RandomElementsPage.class);
    }

    @Test
    public void test_dropdown() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/dropdown");

        pageToTest.clickDropdown();
        Thread.sleep(1000);
        pageToTest.clickOption2();
        Thread.sleep(1000);

        Assert.assertEquals(pageToTest.getAttributeSelected(), "true");
    }



}
