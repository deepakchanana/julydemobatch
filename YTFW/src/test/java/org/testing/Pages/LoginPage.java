package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	ChromeDriver driver;
	Properties pr;
	public LoginPage(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void signin(String user,String password)
	{
	WebElement signinbutton=driver.findElement(By.xpath(pr.getProperty("loginbutton")));
	signinbutton.click();
	WebElement username=driver.findElement(By.id(pr.getProperty("user")));
	username.sendKeys(user);
	}

}
