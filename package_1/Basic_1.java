package package_1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_1 {

	public static void main(String[] args) throws InterruptedException 
	{
          System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("https://www.google.com");
          Thread.sleep(1000);
          driver.close();
	}

}
