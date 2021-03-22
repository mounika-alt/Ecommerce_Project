package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.OpenBrowserNavToPWC;
import PropertiesFIle.ReadPropertiesFile;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SD02_AddtoCart {

	@Given("^that we are on the home page of HN website$")
	public void that_we_are_on_the_home_page_of_HN_website() throws IOException  {
		OpenBrowserNavToPWC.driver.get(ReadPropertiesFile.PropFile("url"));
	    
	}

	@When("^I get product name and add the product to cart$")
	public String i_get_product_name_and_add_the_product_to_cart()  {
		
		 WebElement x=	OpenBrowserNavToPWC.driver.findElement(By.xpath("//div[contains(@class,'info')]/a[contains(text(),' Gold (2020')]"));
		 String item=x.getText();
		 System.out.println();
		OpenBrowserNavToPWC.driver.findElement(By.xpath("//a[contains(@title,'256GB SSD - Gold (2020) to cart')]/span")).click();
	   return item;
	   
	    
	}

	@Then("^Item added to cart popup window is presented$")
	public void item_added_to_cart_popup_window_is_presented()  {
		
		
	    
	WebElement title=	OpenBrowserNavToPWC.driver.findElement(By.xpath("//div[contains(@class,'title uppercase')]"));
	Assert.assertEquals(true,title.isDisplayed());
	}

	@Then("^I select view cart option$")
	public void i_select_view_cart_option()  {
		OpenBrowserNavToPWC.driver.findElement(By.xpath("//a[@title='Proceed to Cart']")).click();
	    
	}

	@Then("^I am presented with shopping cart page$")
	public void i_am_presented_with_shopping_cart_page()  {
		WebElement cart=	OpenBrowserNavToPWC.driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart')]"));
		Assert.assertEquals(true,cart.isDisplayed());
	    
	}

	@Then("^I check if selected product is added to cart$")
	public void i_check_if_selected_product_is_added_to_cart(String item)  {
		WebElement y=	OpenBrowserNavToPWC.driver.findElement(By.xpath("//div[contains(@class,'col-xs-7 col-sm-4')]/a[contains(text(),' Gold (2020')]"));
		Assert.assertEquals(true,y.isDisplayed());
		String product=y.getText();
		System.out.println(product);
		Assert.assertEquals(item,product);
	    
	    
	}
}
