package Generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Generic_JavaScript_Executor {
  public static JavascriptExecutor javascript_method(WebDriver driver) {
	  
  
	JavascriptExecutor js = (JavascriptExecutor) driver;
	return js;
	
}}
