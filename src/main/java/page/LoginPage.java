package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage
{
	WebDriver driver;
	
	// =================================Web Elements ===================
	@FindBy(linkText="Log in")
	WebElement lnkLogin;
	
	  @FindBy(name="user_login")
	    WebElement editUserName;
	    
	    @FindBy(name="user_pwd")
	    WebElement editPwd;
	    
	    @FindBy(className="rememberMe")
	    WebElement chkBox;
	    
	    @FindBy(name="btn_login")
	    WebElement btnPwd;
	
	
	public LoginPage(WebDriver testdriver)
	{
		this.driver=testdriver;
		PageFactory.initElements(driver, this);
	}
	
	//=============================== Methods ====================
	public void Login(String uname, String password)throws IOException
	{
		
	
	//WebElement inkLogin =driver.findElement(By.linkText("Log in"));
    
	lnkLogin.click();
	
	//WebElement editUsername = driver.findElement(By.name("user_login"));
	
	editUserName.sendKeys(uname);
	
	
	//WebElement editPwd = driver.findElement(By.name("user_pwd"));
	
	editPwd.sendKeys(password);
	
	//WebElement chkBox = driver.findElement(By.className("rememberMe"));
	
	chkBox.click();
	
	//WebElement btnPwd= driver.findElement(By.name("btn_login"));
	
	btnPwd.click();
	
	}

}
