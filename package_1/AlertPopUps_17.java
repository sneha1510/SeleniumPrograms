package package_1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class AlertPopUps_17 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Programs\\Selenium_project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//click on sign button
		WebElement signIn_btn = driver.findElement(By.xpath("//input[@name=\"proceed\"]"));
		signIn_btn.click();
		Thread.sleep(2000);
		
		//switch focus to alert
		Alert alt = driver.switchTo().alert();
		String altTxt = alt.getText();
		System.out.println(altTxt);
		alt.accept();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
