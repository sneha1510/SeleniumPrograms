package package_1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Iframe_assignment16 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Programs\\Selenium_project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		
		WebElement searchBar_main = driver.findElement(By.xpath("//input[@id=\"s\"]"));
		searchBar_main.sendKeys("harry");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("globalSqa");
		WebElement searchBar_iframe = driver.findElement(By.xpath("//input[@id=\"s\"]"));
		searchBar_iframe.sendKeys("Tom");
		
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
