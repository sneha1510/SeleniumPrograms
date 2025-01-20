package package_1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class FileUpload_24 {

	public static void main(String[] args) throws InterruptedException
	{
		
      System.setProperty("webdriver.chrome.driver", "C:\\Selenium Programs\\Selenium_project\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
      
      WebElement chooseFileBtn = driver.findElement(By.xpath("//input[@type=\"file\"]"));
      chooseFileBtn.sendKeys("C:\\Users\\DELL\\Downloads\\HPC_1.cpp");
      
      WebElement uploadBtn = driver.findElement(By.xpath("//input[@value=\"Send File\"]"));
      uploadBtn.click();
      
      Thread.sleep(3000);
      driver.close();
	}

}
