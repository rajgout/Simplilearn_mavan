package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import page.LoginPage;

public class TestCase1 
{
	WebDriver driver;
	SoftAssert assertobj =new SoftAssert();
	

	@BeforeMethod
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
			
	}
	
	@Test
	public void LoginTest() throws IOException {
		LoginPage obj=  new LoginPage(driver);
		
		obj.Login("abc@xyz.com", "123abc");
	}
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
	

}
