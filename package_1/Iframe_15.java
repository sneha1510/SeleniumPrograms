package package_1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Iframe_15 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Programs\\Selenium_project\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//working with frames
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@name=\"iframeResult\"]"));
		driver.switchTo().frame(iframe1);
		WebElement clickmeButton = driver.findElement(By.xpath("//button[contains(text(),\"Click me to display Date and Time.\")]"));
		clickmeButton.click();
		/*
		WebElement HomeLink = driver.findElement(By.xpath("//a[@id=\"tryhome\"]"));
		this will not work...becoz selenium cannot go back to main page by itself
		*/
		driver.switchTo().parentFrame();//this method will focus to main page
		WebElement HomeLink = driver.findElement(By.xpath("//a[@id=\"tryhome\"]"));
		HomeLink.click();
		Thread.sleep(1000);
		//driver.close(); it will only close the current tab 
		driver.quit();

	}

}
