package StepDefinition;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.OpenBrowserNavToPWC;
import Login.AT01_NavigatetoLoginScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class SD01_Test {
	
	@Given("^that we are on the home page$")
	public void that_we_are_on_the_home_page() throws IOException  {
		OpenBrowserNavToPWC.NavPWC("URL");  
	}

	@Then("^click on account link$")
	public void click_on_account_link()  {
		AT01_NavigatetoLoginScreen obj=new AT01_NavigatetoLoginScreen();
		obj.Account();
	   
	}

	@Then("^System should navigate to login to my account screen$")
	public void system_should_navigate_to_login_to_my_account_screen()  {
		OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement text= OpenBrowserNavToPWC.driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
		System.out.println(text.getText());
		Assert.assertEquals(true,text.isDisplayed());   
	}



}
