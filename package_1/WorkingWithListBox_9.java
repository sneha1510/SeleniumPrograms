package package_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithListBox_9 
{
   //single selectable
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	      driver.manage().window().maximize();
	     
	      WebElement select_month = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Month')]"));
          Select s=new Select(select_month);
          List<WebElement> options = s.getOptions();
          //check all options
          System.out.println("Options of month");
          for(int i=0;i<options.size();i++)
          {
        	  System.out.println(options.get(i).getText());
          }
         
          System.out.println("Options of day");
          WebElement select_day=driver.findElement(By.xpath("//select[contains(@name,\"DOB_Day\")]"));
          Select s1=new Select(select_day);
          List<WebElement> options_day=s1.getOptions();
          for(int i=0;i<options_day.size();i++)
          {
        	  System.out.println(options_day.get(i).getText());
          }
          
          
          System.out.println("Year Options");
          WebElement Year_options=driver.findElement(By.xpath("//select[contains(@name,\"DOB_Year\")]"));
          Select s2=new Select(Year_options);
          List<WebElement> s2_options=s2.getOptions();
          for(int i=0;i<s2_options.size();i++)
          {
        	  System.out.println(s2_options.get(i).getText());
          }
          
          //check which are listboxes are multiselectable
          System.out.println("Multiselectable listbox");
          System.out.println("Day listbox: "+s.isMultiple());
          System.out.println("Month listbox: "+s1.isMultiple());
          System.out.println("Year listbox: "+s2.isMultiple());
          
          
          
          
          
          
          
          
          
          
          
          Thread.sleep(5000);
	      driver.close();
	}

}
