package Generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Generics_Popups {
	
	public static  Alert alert_popup(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		return a;
	}
   
	 public static Robot download_popup(WebDriver driver) throws AWTException {
		 Robot r=new Robot();
		 return r;
	 }
	 
}
