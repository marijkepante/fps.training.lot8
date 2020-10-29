package com.gildedrose.steps;

import com.gildedrose.GildedRose;
import com.gildedrose.Inventory;
import com.gildedrose.Item;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class FirstFeatureSteps {

    public GildedRose gildedRose;
    public Item itemToAdd;

    @Before
    public void beforeAll() {
        //  Initialisation of the system
        gildedRose = new GildedRose(Inventory.getItems());
        itemToAdd = new Item();
    }

    @Given("^an item \"([^\"]*)\"$")
    public void an_item(String arg1) throws Throwable {
        itemToAdd.setName(arg1);
    }

    @Given("^the quality is (\\d+)$")
    public void the_quality_is(int arg1) throws Throwable {
        itemToAdd.setQuality(arg1);
    }

    @Given("^the sell in is (\\d+)$")
    public void the_sell_in_is(int arg1) throws Throwable {
        itemToAdd.setSellIn(arg1);
    }

    @When("^I update quality$")
    public void i_update_quality() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        gildedRose.updateQuality();
    }

    @Then("^the item's name is \"([^\"]*)\"$")
    public void the_item_s_name_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // assertEquals(gildedRose.get(0).getName() , items[0].name);
    }

    @Then("^the quality is updated to (\\d+)$")
    public void the_quality_is_updated_to(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // assertEquals(gildedRose.get(0).getQuality() , items[0].quality - 1);
    }

    @Then("^the sell in is updated to (\\d+)$")
    public void the_sell_in_is_updated_to(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // assertEquals(gildedRose.get(0).getSell() , items[0].sellIn - 1);
    }
}
