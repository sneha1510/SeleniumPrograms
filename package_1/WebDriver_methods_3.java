package package_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_methods_3 {

	public static void main(String[] args) throws InterruptedException 
	{
           System.setProperty("webdriver.chrome.driver", "C:\\Jar files and driver\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           
           driver.manage().window().maximize();
           Thread.sleep(1000);
           
           driver.get("https://www.google.com");
           Thread.sleep(1000);
           
           driver.navigate().to("https://www.facebook.com/");
           Thread.sleep(1000);
           
           driver.navigate().to("https://www.instagram.com/");
           Thread.sleep(1000);
           
           driver.navigate().back();
           Thread.sleep(1000);
           
           driver.navigate().forward();
           Thread.sleep(1000);
           
           driver.navigate().refresh();
           Thread.sleep(1000);
           
           driver.quit();
            
           
           
           
	}

}
