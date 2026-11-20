package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mavenclass {
	WebDriver driver;
	@BeforeMethod
    public void setup() 
	{
        driver = new ChromeDriver();
        driver.get("https://keralaproperty.in");
        
    }
	@Test
	public void url()
	{
		String actual=driver.getTitle();
		String expected=("Kerala Real Estate Website | Kerala Property");
		//String expected=("hoii"); this will fail and the next test will not work
		
		
		Assert.assertEquals(actual, expected,"title verifies"); //if the title match the expected then test pass.if it fails the test faiils
		System.out.println("title"); //only prints if the test passes
		
}
}
