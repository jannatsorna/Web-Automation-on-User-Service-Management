

//forget pass (with invalid email)

package testcase;


import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.DriverSetup;


public class TC004 extends DriverSetup
{
	String baseURL="https://tsuruhashi.toggle-pf.com/login";
	@Test
	public void sorna() throws InterruptedException
	{
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		String email = "sorna@gmail.com";
		
		driver.findElement(By.linkText("パスワードを忘れた方はこちら")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("input-email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		String expected_error_msg = "このメールでユーザーを見つけることができません";
		String actual_error_msg = "このメールでユーザーを見つけることができません";
		//String actualtitle = driver.getTitle(); to get the page title
		
		if (expected_error_msg.equals(actual_error_msg))
		{
			System.out.println("Invalid Email");
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Reset link send to this mail");
		}

	}
	
	
}




