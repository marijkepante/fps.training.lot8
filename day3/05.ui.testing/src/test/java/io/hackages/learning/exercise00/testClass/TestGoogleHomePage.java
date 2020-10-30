package io.hackages.learning.exercise00.testClass;

import io.hackages.learning.base.TestNgTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogleHomePage extends TestNgTestBase {

    @Test
    public void testGetTitle() {
        Assert.assertEquals(driver.getTitle(), "");
    }

    @Test
    public void testGetCurrentUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "");
    }

}
