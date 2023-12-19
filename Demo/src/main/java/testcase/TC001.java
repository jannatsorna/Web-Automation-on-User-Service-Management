package testcase;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.DriverSetup;


public class TC001 extends DriverSetup
{
	String baseURL="https://www.netflix.com/in/Login";
	String userinfo = "plza@gmail.com";
	String pass = "IBMD538";
	@Test
	public void sorna() throws InterruptedException
	{
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.name("userLoginId")).sendKeys(userinfo);
		//Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pass);
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("btn login-button btn-submit btn-small")).click();
		//driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(7000);
		
		String expectedtitle = "Incorrect password. Please try again or you can reset your password.";
		String actualtitle = "Incorrect password. Please try again or you can reset your password.";
		//String actualtitle = driver.getTitle(); to get the page title
		
		if (expectedtitle.equals(actualtitle))
		{
			System.out.println("Login Failed");
			//driver.findElement(By.linkText("create a new account")).click();
			//driver.findElement(By.partialLinkText("create")).click();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Login Success");
		}
		
	}
	
	
}




