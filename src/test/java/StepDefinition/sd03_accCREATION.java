package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;

import BaseClass.OpenBrowserNavToPWC;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class sd03_accCREATION {
	@Given("^Navigate to create an account screen$")
	public void navigate_to_create_an_account_screen() throws IOException {
		OpenBrowserNavToPWC.NavPWC("create_ACCURL");  
	    
	    
	}
	
	@Then("^Enter firstnam as \"(.*?)\"$")
	public void enter_firstnam_as(String arg1)  {
		OpenBrowserNavToPWC.driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(arg1);
	}

	@Then("^Enter Lastname as \"(.*?)\"$")
	public void enter_Lastname_as(String arg1)  {
		OpenBrowserNavToPWC.driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(arg1);
	    
	}


	


}
