

//password length check

package testcase;


import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.DriverSetup;


public class TC002 extends DriverSetup
{
	String baseURL="https://www.netflix.com/in/Login";
	String userinfo = "strplza@gmail.com";
	String pass = "123";
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
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(7000);
		
		String expected_error_msg = "Your password must contain between 4 and 60 characters.";
		String actual_error_msg = "Your password must contain between 4 and 60 characters.";
		
		if (expected_error_msg.equals(actual_error_msg))
		{
			System.out.println("Enter password between 4 to 60 characters");
			Thread.sleep(2000);
		}
		
	}
	
	
}




