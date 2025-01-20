package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait_26 {

	public static void main(String[] args) 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Selenium Programs\\Selenium_project\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.google.co.in/");
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
       WebElement searchBar = driver.findElement(By.xpath("//extarea[@name=\"q\"]"));
       searchBar.sendKeys("selenium");
       driver.close();
	}

}
