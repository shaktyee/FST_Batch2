package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import utility.ConfigProp;

public class BaseTest {
	
	public WebDriver driver;
	ConfigProp cp;
	public LoginPage lp;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		cp = new ConfigProp();
		
		driver.get(cp.getNOPCommerceUrl());
		driver.manage().window().maximize();
		
		lp = new LoginPage(driver);
		
	}

	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}
}
