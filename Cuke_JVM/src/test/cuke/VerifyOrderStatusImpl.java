package test.cuke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.lang.String;


/**
 * Created with IntelliJ IDEA.
 * User: priti
 * Date: 11/01/13
 * Time: 2:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class VerifyOrderStatusImpl {
    private WebDriver driver;

    public void goToMerchantSite()
    {
        String order_id=System.getProperty("order_id");
        this.driver=new FirefoxDriver();
        System.out.println("*********************ORDER ID :"+order_id);
        driver.get("http://localhost:3000/order/display/"+order_id);
    }

    public void verifyStatus()
    {
        boolean r;
        String source=driver.getPageSource();
        r=source.contains("Delivered");
        System.out.println(source);
        driver.quit();
        System.out.print("<TaaS Response Start>{\"Return Status\":"+r+"}<TaaS Response Complete>");
    }


}
