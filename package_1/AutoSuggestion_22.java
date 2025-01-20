package package_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_22 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://in.search.yahoo.com/?fr2=inr");
        WebElement searchBar = driver.findElement(By.xpath("//input[@id=\"yschsp\"]"));        
        searchBar.sendKeys("h");
        searchBar.click();
       
        List<WebElement> autoSuggestedValues = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
//        for(int i=0;i<autoSuggestedValues.size();i++)
//        {
//        	System.out.println(autoSuggestedValues.get(i).getText());
//        }
        for(WebElement i:autoSuggestedValues)
        {
        	System.out.println(i.getText());
        }
        for(int i=0;i<autoSuggestedValues.size();i++)
        {
        	String exp="hotstar";
        	String actual=autoSuggestedValues.get(i).getText();
        	if(exp.contains(actual))
        	{
        		autoSuggestedValues.get(i).click();
        		System.out.println("Test case passed");
        		break;
        	}
        }
       
        Thread.sleep(1000);
        driver.quit();

	}

}
