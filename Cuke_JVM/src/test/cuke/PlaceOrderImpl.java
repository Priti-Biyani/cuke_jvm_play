package test.cuke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.lang.String;


import java.security.PrivateKey;

/**
 * Created with IntelliJ IDEA.
 * User: priti
 * Date: 07/01/13
 * Time: 6:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlaceOrderImpl {
    private WebDriver driver;

    PlaceOrderImpl()
    {
    }

    public void goToURL()
    {
       this.driver=new FirefoxDriver();
       System.out.println("OPENING  BROWSER");
       driver.get("http://localhost:3000");
    }

    public void placeOrder()
    {


       String cust_name=System.getProperty("name");
       String cust_addr=System.getProperty("address");
       String quantity =System.getProperty("quantity");

       this.searchElement("customer_name").sendKeys(cust_name);
       this.searchElement("address").sendKeys(quantity);
       this.searchElement("quantity").sendKeys(cust_addr);

       driver.findElement(By.name("commit")).click();
    }
    private WebElement searchElement(String name)
    {
        return driver.findElement(By.id(name));
    }

    public void verifyResult()
    {
        String current_URL=driver.getCurrentUrl();
        int order_id;
        if(current_URL.contains("http://localhost:3000/order/display/"))
        {
          String parts[]=current_URL.split("/display/");
          order_id=Integer.parseInt(parts[1]);
          System.out.print("<TaaS Response Start>{\"order_id\":"+order_id+"}<TaaS Response Complete>");

          driver.close();
        }
    }


}
