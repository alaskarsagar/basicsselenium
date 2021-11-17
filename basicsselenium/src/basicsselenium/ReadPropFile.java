package basicsselenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		
		
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\SAGAR ALASKAR\\eclipse-workspace\\basicsselenium\\config.properties");

		prop.load(fis);
		
		String url=prop.getProperty("URL");
		System.out.println(url);
		
		
		System.out.println(prop.contains(url));
	}

}
