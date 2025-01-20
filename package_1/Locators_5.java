package package_1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Locators_5 
{
	
	 
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	      //locator= tagName
	      driver.findElement(By.tagName("input")).sendKeys("Sneha");
	      Thread.sleep(2000);
	      //locator = Name
	      //driver.findElement(By.name("altemail46af5b15")).sendKeys("snehaghone@gmail.com");
	      //Thread.sleep(2000);
	      //locator= ID
	      driver.findElement(By.id("newpasswd1")).sendKeys("snehaghone");
	      Thread.sleep(2000);
	      //locator = className
	      //driver.findElement(By.className(null))
	      
	      //locator =LinkText
	      driver.findElement(By.linkText("terms and conditions")).click();
	      Thread.sleep(2000);
	      //locator= partialLinkText
	      driver.findElement(By.partialLinkText("privacy")).click();
	      Thread.sleep(2000);
	      driver.close();
	      
	      

	}

}
