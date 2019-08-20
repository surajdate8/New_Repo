package htmlunitdriver;

import java.lang.reflect.Field;

import org.openqa.selenium.htmlunit.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

public class HtmlDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebClient webclient1 = null;
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.CHROME);
		
		driver.get("https://mvnrepository.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		try {
			 webclient1= (WebClient) get (driver,"WebClient");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("client verison: "+ webclient1.getBrowserVersion());

		System.out.println("isFirefox verison: "+ webclient1.getBrowserVersion().isChrome());
		System.out.println("isFirefox verison: "+ webclient1.getBrowserVersion().isFirefox());
		
		driver.quit();

	}

	private static Object get(Object obj, String fld)throws Exception
	{
		Field f= obj.getClass().getDeclaredField(fld);
		f.setAccessible(true);
		return f.get(obj);
		
	}
	
}
