package runner;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.UrbanladderHomePage;
import reusablecomponents.base;
import reusablecomponents.reusablemethods;

public class TC001_Signup extends base{

	
	@Test
	public void Open1() throws IOException, InterruptedException
	{
		driver=initializedriver();
	    reusablemethods.Implicitwait(driver);
	    OpenUrl();
	    UrbanladderHomePage ulpage= new UrbanladderHomePage(driver);
		ulpage.ClosingPopup().click();
		Thread.sleep(5000);
		ulpage.clickingIcon().click();
		ulpage.clickingSignup().click();;
		logger.info("Clicked on signup option");
		Thread.sleep(5000);
		ulpage.Signupmail().sendKeys("xyz@gmail.com");
		ulpage.Signuppass().sendKeys("abc1234#");
		ulpage.Signupsubmit().click();
		if(ulpage.Signuperror().isDisplayed()) {
		System.out.println("Sign up Failed, try another mail"+ulpage.Signuperror());
		}
		else
		{
			System.out.println("Sign up Successful");
		}
		driver.close();
		logger.info("entered bed in searchbox");
		
	}
}