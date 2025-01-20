package parametrization;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.*;

public class Parametrization_code_14 
{
	//integrete UI with excel
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Jar files and driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	    
	    WebElement fullName_txtbox = driver.findElement(By.tagName("input"));
	    WebElement day = driver.findElement(By.xpath("//select[contains(@name,\"DOB_Day\")]"));  
	    Select s_day=new Select(day);
	    WebElement female_radioButton = driver.findElement(By.xpath("//input[@value=\"f\"]"));
	    WebElement country_listBox= driver.findElement(By.xpath("//select[@id=\"country\"]"));
	    Select s_country=new Select(country_listBox);
	    WebElement rediffId_textbox = driver.findElement(By.xpath("//input[@name=\"login2c713590\"]"));
	    
	    
	    
	    FileInputStream file=new FileInputStream("C:\\Selenium Programs\\Selenium_project\\TestData\\Excel_data1.xlsx");
	    Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
	    
	    fullName_txtbox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
	    //s_day.selectByVisibleText("11");
	    s_day.selectByVisibleText(excel.getRow(1).getCell(0).getStringCellValue());
	    female_radioButton.click();
	    s_country.selectByVisibleText(excel.getRow(2).getCell(0).getStringCellValue());
	    /* Trying to print selected option
	     * WebElement first_selected_Country = s_country.getFirstSelectedOption();
	    System.out.println(first_selected_Country.getText());*/
	    rediffId_textbox.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
	    
	    
	    Thread.sleep(2000);
	    driver.close();
	}

}
