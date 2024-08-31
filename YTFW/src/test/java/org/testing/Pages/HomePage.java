package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	ChromeDriver driver;
	Properties pr;
	public HomePage(ChromeDriver driver,Properties pr) 
	{
	this.driver=driver;
	this.pr=pr;
	}
	
	public void historyClick()
	{
	WebElement history=	driver.findElement(By.xpath(pr.getProperty("Historybutton")));
	history.click();
	}
	public void TrendingClick()
	{
	WebElement trending=driver.findElement(By.xpath(pr.getProperty("trendingbutton")));
	trending.click();
	}

}
