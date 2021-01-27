package xyz.WINGS7.Reflection.protocol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public interface GetProperties {

	public static String go(String property) {
		String data = "";
		try {
		       BufferedReader is = new BufferedReader(new FileReader("server.properties"));
		       Properties props = new Properties();
		       props.load(is);
		       is.close();
		       data = props.getProperty(property);
		     } catch (Exception e) {
		       //shhhh
		     }
		return data;
	}
}
