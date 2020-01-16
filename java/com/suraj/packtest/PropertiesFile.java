package com.suraj.packtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	
	static Properties prop=new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}

	public static void readPropertiesFile()
	{
		try {

			InputStream input= new FileInputStream("/home/suraj/eclipse-workspace/TestingOfSelenium/src/main/java/Config/Config.properties");
			prop.load(input);
			System.out.println("In Properties file"+(prop.getProperty("browser"))) ;
			ModulerCode.browser=prop.getProperty("browser");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writePropertiesFile()
	{
		try {
			OutputStream output=new FileOutputStream("/home/suraj/eclipse-workspace/TestingOfSelenium/src/main/java/Config/Config.properties");
			prop.setProperty("browser","chrome");
			prop.store(output, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
