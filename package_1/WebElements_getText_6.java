package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_getText_6 
{
	public static void main(String[] args) throws InterruptedException 
	{
          System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
          Thread.sleep(1000);
          WebElement createaccText = driver.findElement(By.xpath("//td[@class=\"f22\"]"));
          String actualtext=createaccText.getText();
          System.out.println(actualtext);
          driver.close();
	}
}
