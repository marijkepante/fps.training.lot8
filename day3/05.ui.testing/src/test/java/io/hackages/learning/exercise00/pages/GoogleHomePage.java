package io.hackages.learning.exercise00.pages;

import io.hackages.learning.base.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends Page {

    @FindBy(name="q")
    @CacheLookup
    public WebElement txtSearch;

    @FindBy(name="btnK")
    @CacheLookup
    public WebElement btnSearch;

    @FindBy(name="btnI")
    @CacheLookup
    public WebElement btnLuckySearch;

    public GoogleHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void setTxtSearch(String txtSearch) {
        this.txtSearch.sendKeys(txtSearch);
    }

    public String getSearchText(){
        return btnSearch.getText();
    }
    public String getLuckySearchText(){
        return btnLuckySearch.getText();
    }

}
