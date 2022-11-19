package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		lp.enterUname("admin@yourstore.com");
		Thread.sleep(2000);
		
		lp.enterPassword("admin");
		lp.clickLogin();
		
		String header = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
		Assert.assertEquals("Dashboard", header);
	}

}
