package package_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getCurrentURL_4 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Jar files and driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String Expected="https://www.google.com/";
		String Actual=driver.getCurrentUrl();
		if(Actual.equals(Expected))
		{
			System.out.println("Actual URL: "+Actual);
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("test case failed");
		}
		driver.close();
		

	}

}
