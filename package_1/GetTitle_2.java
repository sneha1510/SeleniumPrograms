package package_1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_2 {
    public static void main(String[] args) 
    {
        // Step 1: Set the ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Jar files and driver\\chromedriver.exe");
        
        // Step 2: Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 3: Navigate to Google
            driver.get("https://www.google.com");
            
            // Step 4: Get the page title
            String Actualtitle = driver.getTitle();
            String expectedTitle="Google";
            
            // Step 5: Validate the title
            if (Actualtitle.equals(expectedTitle)) 
            {
            	System.out.println("Title of page: "+Actualtitle);
                System.out.println("Test case passed");
            } else {
                System.out.println("Test case failed");
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            // Step 6: Quit the browser
            driver.quit();
        }
    }
}
