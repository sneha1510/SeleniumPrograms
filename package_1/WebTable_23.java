package package_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_23 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://money.rediff.com/index.html");
        List<WebElement> rows = driver.findElements(By.xpath("(//div[@class=\"hmbseindicestable show\"])[2]//ul"));
       // List<WebElement> rowValues = driver.findElements(By.xpath("(//div[@class=\"hmbseindicestable show\"])[2]//ul//li"));
        for(int i=0;i<rows.size();i++)
        {
        	System.out.println(rows.get(i).getText());
        }
        Thread.sleep(2000);
        driver.quit();
	}

}
