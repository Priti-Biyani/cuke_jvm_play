package test.cuke;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: priti
 * Date: 11/01/13
 * Time: 2:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class VerifyOrderStatus_step {
    private VerifyOrderStatusImpl Verify;

    @Given("^I visit order status page$")
    public void I_visit_order_status_page() throws Throwable {
        Verify=new VerifyOrderStatusImpl();
        Verify.goToMerchantSite();
    }

    @Then("^I should see order delivered status$")
    public void I_should_see_order_delivered_status() throws Throwable {
        Verify.verifyStatus();
    }
}
