package io.hackages.learning.exercise00.pages;

import io.hackages.learning.base.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class RandomElementsPage extends Page {

    @FindBy(id="dropdown")
    @CacheLookup
    public WebElement dropdown;
    @FindBy(xpath = "//*[@id=\"dropdown\"]/option[3]" )
    @CacheLookup
    public WebElement option2;

    public RandomElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickDropdown(){
        dropdown.click();
    }
    public void clickOption2(){
        option2.click();
    }
    public String getAttributeSelected(){
        return option2.getAttribute("selected");
    }



}
