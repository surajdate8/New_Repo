package com.suraj.packtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModulerCode {
	
	
	public static String browser;
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setBrowser();
		setBrowserConfig();
		runTest();		
	}

	private static void runTest() {
		// TODO Auto-generated method stub
		driver.get("https://mvnrepository.com/");
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}

	private static void setBrowserConfig() {
		// TODO Auto-generated method stub
		if(browser.contains("Firefox"))
		{
			System.out.println("Testing started here : ");
			
			String ProjectPath=System.getProperty("user.dir");
			System.out.println("Testing Dir : - "+ProjectPath);
			String UserDriver1="/home/suraj/Downloads/geckodriver-v0.24.0-linux32/geckodriver";
			System.setProperty("webdriver.gecko.driver",UserDriver1);
			driver=new FirefoxDriver();
		}
		
	}

	private static void setBrowser() {
		// TODO Auto-generated method stub
		browser="Firefox";
	}

}
