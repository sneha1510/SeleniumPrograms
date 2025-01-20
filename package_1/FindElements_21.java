package package_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_21 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.com");
         List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));
         System.out.println("Total Links: "+totalLinks.size());
         //get text of all links
         for(int i=0;i<totalLinks.size();i++)
         {
        	 System.out.println(totalLinks.get(i).getText());
         }
         //just simple test case
         for(int i=0;i<totalLinks.size();i++)
         {
        	 String expected="Images";
        	 String actual=totalLinks.get(i).getText();
        	 if(expected.equals(actual))
        	 {
        		 totalLinks.get(i).click();
        		 System.out.println("Test case passed");
        		 break;
        	 }
         }
         System.out.println("Title of page is : "+driver.getTitle());
         Thread.sleep(1000);
         driver.quit();
	}

}
