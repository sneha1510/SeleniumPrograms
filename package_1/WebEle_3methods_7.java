package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEle_3methods_7 
{
     /*this methods are used to check status of web elements*/
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Jar files and driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://megrecruitment.nic.in/rpa/register.htm");
        Thread.sleep(1000);
        WebElement emailId_textbox=driver.findElement(By.xpath("//input[@id=\"emailid\"]"));
        System.out.println("Is displayed: "+emailId_textbox.isDisplayed());
        System.out.println("Is enabled: "+emailId_textbox.isEnabled());
        System.out.println("Is selected: "+emailId_textbox.isSelected());
        System.out.println("--------------------");
        WebElement dob_textbox=driver.findElement(By.xpath("//input[@id=\"dob\"]"));
        System.out.println("Is displayed: "+dob_textbox.isDisplayed());
        System.out.println("Is enabled: "+dob_textbox.isEnabled());
        System.out.println("Is selected: "+dob_textbox.isSelected());
        System.out.println("---------------------");
        WebElement husbandsname_textbox=driver.findElement(By.xpath("//input[@id=\"husbandsname\"]"));
        System.out.println("Is displayed: "+husbandsname_textbox.isDisplayed());
        System.out.println("Is enabled: "+husbandsname_textbox.isEnabled());
        System.out.println("Is selected: "+husbandsname_textbox.isSelected());
        System.out.println("----------------------");
        WebElement lang_checkbox1 = driver.findElement(By.xpath("(//input[@name=\"languages\"])[1]"));
        System.out.println("Is displayed: "+lang_checkbox1.isDisplayed());
        System.out.println("Is enabled: "+lang_checkbox1.isEnabled());
        System.out.println("Is selected: "+lang_checkbox1.isSelected());
        lang_checkbox1.click(); // Select the checkbox
        System.out.println("Is selected after clicking: " + lang_checkbox1.isSelected());
        driver.close();
        
	}

}
