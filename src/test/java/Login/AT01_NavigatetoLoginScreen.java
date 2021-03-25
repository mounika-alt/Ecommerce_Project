package Login;

import org.junit.Test;
import org.openqa.selenium.By;


import BaseClass.OpenBrowserNavToPWC;

public class AT01_NavigatetoLoginScreen {
	@Test
	public void Account() {
		//navigate to login
		OpenBrowserNavToPWC.driver.findElement(By.xpath("//*[@id='header']/div[1]/div/ul/li[6]/a")).click();
		
	}	

}
