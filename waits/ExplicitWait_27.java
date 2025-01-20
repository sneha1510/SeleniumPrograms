package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_27 {
    //wrong code
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        WebElement btn1 = driver.findElement(By.xpath("//button[@id=\"btn1\"]"));
        btn1.click();
        WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(150));
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"btn1\"]")));
        driver.close();
	}

}
