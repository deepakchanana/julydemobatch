package org.testing.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.utilities.DropDownSelection;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC1 extends Base
{
@Test
public void testCase1() throws IOException
{
  try
  {
	  driver.findElement(By.id("loginbutton")).click();
	  LogsCapture.takeLog("TestCase1","TestCase1 pass successfully");
  }
  catch (Exception e) {
	  LogsCapture.takeLog("TestCase1","Reason for failure is :");
	  LogsCapture.takeLog("TestCase1",e.getMessage());
  }
}
}
