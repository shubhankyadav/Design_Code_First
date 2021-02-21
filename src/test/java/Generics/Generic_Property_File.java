package Generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Generic_Property_File {

	public static String property_data(String path,String key) throws FileNotFoundException, IOException {
	Properties p=new Properties();
	p.load(new FileInputStream(path));
	String data = p.getProperty(key);
	return data;
	
	
	
	}
	 


}
