package package_1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Sanity_8 {

	//find all elements and check total cnt of all elements shown on webpage
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement homeLink=driver.findElement(By.partialLinkText("Home"));
		int cnt=0;
		if(homeLink.isDisplayed()==true)
		{
		   System.out.println("Home Link is displayed ");
		   cnt++;
		}
		WebElement LogoImg = driver.findElement(By.xpath("//img[@title=\"Rediff.com\"]"));
		if(LogoImg.isDisplayed())//by default true
		{
			System.out.println("Logo img is displayed");
			cnt++;
		}
		System.out.println("Total element count "+cnt);
		driver.close();

	}

}
