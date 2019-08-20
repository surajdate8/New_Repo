package PhantomJS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import io.github.bonigarcia.wdm.PhantomJsDriverManager;

public class PhantomJsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("phantomjs.binary.path","/home/suraj/Downloads/phantomjs-2.1.1-linux-i686/bin/phantomjs");
		PhantomJSDriver driver=new PhantomJSDriver();
		
		driver.get("https://mvnrepository.com/");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Title : "+driver.getTitle());
		driver.quit();

	}

}
