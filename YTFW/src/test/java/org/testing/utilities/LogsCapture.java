package org.testing.utilities;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {
	
	public static void takeLog(String className,String msg)
	{
		File f=new File("../YTFW/Application.log");	
		if(f.exists())
		{
			f.delete();
		}
		
		DOMConfigurator.configure("../YTFW/layout.xml");
		
		
		Logger Log=Logger.getLogger(className);
		Log.info(msg);
	}

}
