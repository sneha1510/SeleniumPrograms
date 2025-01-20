package package_1;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
public class WorkingWithListBox_11 
{
     //get first selected option and get all selected options
	//from listbox
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar files and driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement cars = driver.findElement(By.xpath("//select[@name=\"cars\"]"));
		Select s=new Select(cars);
		s.selectByVisibleText("Saab");
		s.selectByVisibleText("Opel");
		
	    //getAllSelectedOptions
		System.out.println("All selected options: ");
		List<WebElement> allselected_options = s.getAllSelectedOptions();
		for(int i=0;i<allselected_options.size();i++)
		{
			System.out.println(allselected_options.get(i).getText());
		}
		
		//getFirstSelectedOption
		System.out.println("Get first selected option: ");
		WebElement firstSelected_option = s.getFirstSelectedOption();
		System.out.println(firstSelected_option.getText());
		
		//getOptions
		System.out.println("All options: ");
		List<WebElement> all_options = s.getOptions();
		for(WebElement all:all_options)
		{
		   System.out.println(all.getText());	
		}
		
		Thread.sleep(1000);
		driver.close();
		
		

	}

}
