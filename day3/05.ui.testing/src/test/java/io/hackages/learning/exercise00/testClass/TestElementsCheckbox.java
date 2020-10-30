package io.hackages.learning.exercise00.testClass;

import io.hackages.learning.base.TestNgTestBase;
import io.hackages.learning.exercise00.pages.RandomElementsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestElementsCheckbox extends TestNgTestBase {

    private RandomElementsPage pageToTest;

    @BeforeMethod
    public void initPageObjects() {
        pageToTest = PageFactory.initElements(driver, RandomElementsPage.class);
    }

    @Test
    public void test_checkbox() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(10000);
        pageToTest.clickCheckbox2();
        Thread.sleep(10000);


        Assert.assertEquals(pageToTest.getCheckSelected(), "checked");
        System.out.println("pageToTest.getCheckSelected() = " + pageToTest.getCheckSelected());
    }



}
