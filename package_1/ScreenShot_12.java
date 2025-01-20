package package_1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_12 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
        
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Selenium Programs\\Selenium_project\\Screenshot\\photo.jpeg");
        FileHandler.copy(source,destination);
        
        Thread.sleep(1000);
        driver.close();

	}

}
