package package_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps_18 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Programs\\Selenium_project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//alert button with ok
	    /*WebElement altBtnLink = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		altBtnLink.click();
	     Alert alt1 = driver.switchTo().alert();
		String alt1_text = alt1.getText();
		System.out.println(alt1_text);
		alt1.accept();*/
		
		//alert button with ok and cancel
		/*WebElement okCancelLink = driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]"));
		okCancelLink.click();
		WebElement confirmBoxBtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
		confirmBoxBtn.click();
	    Alert alt2 = driver.switchTo().alert();   
	     String alt2_text = alt2.getText();
		System.out.println(alt2_text);
		//alt2.accept();
		alt2.dismiss();
		Thread.sleep(2000);*/
		
		//alert button with textbox
		WebElement textboxLink = driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]"));
        textboxLink.click();
        WebElement altTextBtn = driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")); 
		altTextBtn.click();
	    Alert alt3 = driver.switchTo().alert();
	    String alt3_text = alt3.getText();
	    System.out.println(alt3_text);
	    //we cannot send text to alert with textbox
	    //and here we want to send your name 
	    //we should sendkeys() to alt3
	    alt3.sendKeys("sneha ghone");
	    alt3.accept();
	    
	    WebElement result = driver.findElement(By.xpath("//p[@id=\"demo1\"]"));
	    String resultTxt = result.getText();
	    System.out.println(resultTxt);
	    Thread.sleep(5000);
	    
        driver.close();
	}

}
