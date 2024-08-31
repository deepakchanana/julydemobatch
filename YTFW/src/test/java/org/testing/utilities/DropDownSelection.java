package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {
	
	public static void selectByIndex(int index,WebElement element)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public static void selectByVisibleText(String visibletext,WebElement element)
	{
		Select s=new Select(element);
		s.selectByVisibleText(visibletext);
	}
	public static void selectByValue(String value,WebElement element)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}

}
