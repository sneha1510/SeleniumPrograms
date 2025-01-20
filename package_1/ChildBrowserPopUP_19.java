package package_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUP_19 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://aspsnippets.com/demos/1102/");
        
        WebElement openPopUpBtn = driver.findElement(By.xpath("//input[@value=\"Open Popup\"]"));
        openPopUpBtn.click();
        
        //handle windows 
       
        // we have to store windows into set
        Set<String> windows = driver.getWindowHandles();
        System.out.println("total windows: "+windows.size());
        
        //cursor
        String[] win=new String[10];
        Iterator<String> itr = windows.iterator();
        //here we are printing window address
        for(int i=0;i<windows.size();i++)
        {
        	win[i]=itr.next();
        	System.out.println(win[i]);
        }
        
        //here will get title of main and child window
        driver.switchTo().window(win[0]);
        System.out.println("Title of window 0 "+driver.getTitle());
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(win[1]);
        System.out.println("Title of window 1 "+driver.getTitle());
        
        //getting text from child window
        WebElement firstNameTxtbox = driver.findElement(By.xpath("//td[contains(text(),\"Fir\")]"));
        WebElement LastNameTxtbox = driver.findElement(By.xpath("//td[contains(text(),\"Las\")]"));
        System.out.println(firstNameTxtbox.getText());
        System.out.println(LastNameTxtbox.getText());
        Thread.sleep(1000);
        driver.quit();
	

	}

}
