package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFile {
	@Test
	 public void property() throws FileNotFoundException, IOException {
		 Properties p = new Properties();
		 p.load(new FileInputStream("./p.properties"));
		 String data = p.getProperty("city");
		 System.out.println(data);
		  String data1 = p.getProperty("admin");
		  System.out.println(data1);
	 }
}
