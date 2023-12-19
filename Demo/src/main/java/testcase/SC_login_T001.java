package testcase;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.DriverSetup;


public class SC_login_T001 extends DriverSetup
{
	String baseURL="https://chatgptgw-admin.web.app/admin/login";
//	String tenant_id="f71915eb";
	String userinfo = "cutie876@domaain24.online";
	String pass = "Password1";
	@Test
	public void sorna() throws InterruptedException
	{
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(tenant_id);
		Thread.sleep(2000);
		driver.findElement(By.id(":r1:")).sendKeys(userinfo);
		Thread.sleep(2000);
		driver.findElement(By.id("auth-login-v2-password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/div/div/div/div[2]/div/div[2]/a/div/div/div[2]/h6")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div[3]/div[2]/div/div/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/div/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div[4]/div[1]/div/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div/div[3]/div/ul/li[3]/a/div[2]/p")).click();
		Thread.sleep(5000);
		
		
		
		/*String expectedtitle = "Incorrect password. Please try again or you can reset your password.";
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
		*/
	}
	
	
}



