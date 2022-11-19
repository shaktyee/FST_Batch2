package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;

	}
	
	By email = By.id("Email");
	By pass = By.id("Password");
	By lgnBtn = By.tagName("button");
	
	public void enterUname(String uname) {
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(pass).clear();
		driver.findElement(pass).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(lgnBtn).click();
	}

}
