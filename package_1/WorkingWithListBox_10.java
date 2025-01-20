package package_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithListBox_10 {
	//multi selectable
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
	      driver.switchTo().frame("iframeResult");
	      WebElement cars=driver.findElement(By.xpath("//select[@name=\"cars\"]"));
	      Select s=new Select(cars);
	      List<WebElement> car_options = s.getOptions();
	      //print using for loop
	      for(int i=0;i<car_options.size();i++)
	      {
	    	  System.out.println(car_options.get(i).getText());
	      }
	      //print using foreach loop
	      for(WebElement car_op:car_options)
	      {
	    	 System.out.println(car_op.getText());  
	      }
	      //isMultiple()
	      System.out.println("Is multiselectable: "+s.isMultiple());
	      //selectByVisibleText() :here volvo will get selected
	      s.selectByVisibleText("Volvo");
	      s.selectByValue("saab");
	      s.selectByIndex(2);
	      Thread.sleep(1000);
	      driver.close();

	}

}
