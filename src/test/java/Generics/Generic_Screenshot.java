package Generics;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_Screenshot {

	public static String take_screenshot(WebDriver driver) throws IOException {
		String photo="./screenshots/";
		Date d= new Date();
		String d1 = d.toString();
		String date = d1.replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst= new File(photo+date+".jpeg");
		String path = dst.getAbsolutePath();//path of the screenshot in hard disk
		FileUtils.copyFile(src,dst);
         return path;
	}

}
