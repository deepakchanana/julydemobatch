package org.testing.testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ReportWithScreenshot 
{
  ChromeDriver driver;
  ExtentReports extent;
  ExtentTest test;
  
  @BeforeMethod
  public void init()
  {

	 extent=new ExtentReports("report.html",false);
	
	
	
	 driver=new ChromeDriver();
  }
  
  @Test
  public void testCase() throws IOException
  {
	  test=extent.startTest("TestCase1 started");
	  driver.get("https://www.facebook.com");
	  test.log(LogStatus.INFO,"Navigated to the facebook app");
	  String title=driver.getTitle();
      if(title.equals("Deepak"))
      {
    	  test.log(LogStatus.PASS,"Title is matching"); 
    	  String screenshotPath=captureScreenshot(driver);
 		 test.addScreenCapture(screenshotPath);
 		 System.out.println("Screenshot added");
      }
      else
      {
	  test.log(LogStatus.FAIL,"Title not matching");
	  String screenshotPath=captureScreenshot(driver);
		 test.addScreenCapture(screenshotPath);
		 System.out.println("Screenshot added");
      }
	 
		
	  
  }
  
  @AfterMethod
  public void closure() throws IOException
  {
	 
	  driver.quit();
	  extent.endTest(test);
	  extent.flush();
  }
  
  public String captureScreenshot(ChromeDriver driver) throws IOException
  {
	 String destination="D:\\Backup\\DeepakDocuments\\screenshot.png" ;
	File f=driver.getScreenshotAs(OutputType.FILE);  
	FileUtils.copyFile(f,new File(destination));
	return destination;
  }
}
