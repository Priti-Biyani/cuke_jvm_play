package test.cuke;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: priti
 * Date: 07/01/13
 * Time: 6:28 PM
 * To change this template use File | Settings | File Templates.
 */


public class PlaceOrderStepDefn {

    private static PlaceOrderStepDefn ourInstance = new PlaceOrderStepDefn();
    private PlaceOrderImpl Impl;

    public static PlaceOrderStepDefn getInstance() {

        return ourInstance;
    }


    public PlaceOrderStepDefn() {

    }

    @Given("^I visit the merchant site$")
    public void I_visit_the_merchant_site() throws Throwable {
       Impl=new PlaceOrderImpl();
       Impl.goToURL();
    }

    @When("^I place the order$")
    public void place_the_order() throws Throwable {
        ProcessBuilder p=new ProcessBuilder();
       Impl.placeOrder();
    }

    @Then("^I should see successful update message$")
    public void I_should_see_successful_update_message() throws Throwable {
      Impl.verifyResult();
    }

}
