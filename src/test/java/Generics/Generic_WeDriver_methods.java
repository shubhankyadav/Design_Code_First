package Generics;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Generic_WeDriver_methods {
	
	public String get_the_title(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}
	
	public String get_current_url(WebDriver driver) {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public String get_window_handle(WebDriver driver) {
		String handle = driver.getWindowHandle();
		return handle;
	}
	public Set<String> get_window_handles(WebDriver driver) {
		Set<String> handles = driver.getWindowHandles();
		return handles;
	}
	
}