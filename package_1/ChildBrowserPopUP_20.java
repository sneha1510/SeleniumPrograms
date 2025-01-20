package package_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUP_20 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://demoqa.com/browser-windows");
         WebElement newWBtn = driver.findElement(By.xpath("//button[@id=\"windowButton\"]"));
         newWBtn.click();
         
         Set<String> windows = driver.getWindowHandles();
         System.out.println("Total windows: "+windows.size());
         //cursor
         String[] win=new String[10];
         Iterator<String> itr = windows.iterator();
         for(int i=0;i<windows.size();i++)
         {
        	 win[i]=itr.next();
        	 System.out.println(win[i]);
         }
         
         driver.switchTo().window(win[0]);
         System.out.println("Title of window 0 "+driver.getTitle());
         Thread.sleep(1000);
         driver.close();
         
         driver.switchTo().window(win[1]);
         System.out.println("Title of window 1 "+driver.getTitle());
         
         WebElement heading = driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
         System.out.println("Text from child window: "+heading.getText());
         Thread.sleep(1000);
         driver.close();
         
	}

}
