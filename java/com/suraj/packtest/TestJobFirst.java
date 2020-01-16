package com.suraj.packtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

public class TestJobFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing started here : ");
		
		String ProjectPath=System.getProperty("user.dir");
		System.out.println("Testing Dir : - "+ProjectPath);
		String UserDriver1="/home/suraj/Downloads/geckodriver-v0.24.0-linux32/geckodriver";
		
		System.setProperty("webdriver.gecko.driver",UserDriver1);
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mvnrepository.com/");
		
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		System.out.println("Testing completed");
	}

}
