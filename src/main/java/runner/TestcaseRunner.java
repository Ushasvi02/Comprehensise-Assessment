package runner;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.UrbanladderHomePage;
import reusablecomponents.base;
import reusablecomponents.reusablemethods;
import utility.ExcelReader;
import utility.PropertyFileReader;

public class TestcaseRunner extends base {
	
	@Test(priority=0)
	public void Case1() throws IOException, InterruptedException
	{
		driver=initializedriver();
		reusablemethods.Implicitwait(driver);
		logger.info("Intialized driver");
		OpenUrl();
		logger.info("Open Url");
		UrbanladderHomePage ulpage= new UrbanladderHomePage(driver);
		ulpage.ClosingPopup().click();
		Thread.sleep(5000);
		ulpage.clickingSearchBox().sendKeys("Chair");
		logger.info("Entered chair in searchbox");
		ulpage.clickingSearchButton().click();
		if(ulpage.CheckingChair1().isDisplayed()) {
		System.out.println("Chair results are listed"+ulpage.CheckingChair1());
		}
		else
		{
			System.out.println("Chair results are listed");
		}
		driver.close();
		
	}
	
	//Test2

	@Test(priority=1)
	public void Case2() throws IOException, InterruptedException
	{
		driver=initializedriver();
		reusablemethods.Implicitwait(driver);
		logger.info("Intialized driver");
		OpenUrl();
		logger.info("Open Url");
		UrbanladderHomePage ulpage= new UrbanladderHomePage(driver);
		ulpage.ClosingPopup().click();
		Thread.sleep(5000);
		ulpage.clickingrecliner().click();
		logger.info("clicked cupboard button successfully");
		System.out.println("cupboard name  :"+ulpage.clickingrecliner1().getAttribute("title"));
		System.out.println("cupboard Price  :"+ulpage.checkingrecliner1price().getText());
		driver.close();
		logger.info("close driver");
	}
	
	//Test3
	@Test(priority=3)
	public void Case3() throws IOException, InterruptedException
	{
		driver=initializedriver();
	    reusablemethods.Implicitwait(driver);
	    OpenUrl();
	    UrbanladderHomePage ulpage= new UrbanladderHomePage(driver);
	    ulpage.ClosingPopup().click();
		Thread.sleep(5000);
		ulpage.ClickingAboutUs().click();
		logger.info("Clicked on AboutUs successfully");
		String s=ulpage.AboutLadderpara().getText();
		System.out.println(s);
		
		driver.close();
		logger.info("close driver");
	}
	
	//Test4
	
	@Test(priority=5)
	public void Case4() throws IOException, InterruptedException
	{
		driver=initializedriver();
	    reusablemethods.Implicitwait(driver);
	    OpenUrl();
	    UrbanladderHomePage ulpage= new UrbanladderHomePage(driver);
	    ulpage.ClosingPopup().click();
		Thread.sleep(5000);
		ulpage.clickingbookshelf().click();
		logger.info("clicked on bookshelf icon");
		ulpage.clickingbookshelf1().click();
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle);
            logger.info("window handling had done");
            System.out.println(" "+driver.getTitle());
            ulpage.addcartbutton().click();
          
            }
        }

	}
	//Test5
	@Test(priority=2)
	public void Case5() throws IOException, InterruptedException
	{
		driver=initializedriver();
	    reusablemethods.Implicitwait(driver);
	    OpenUrl();
	    UrbanladderHomePage ulpage= new UrbanladderHomePage(driver);
	    ulpage.ClosingPopup().click();
		Thread.sleep(5000);
		ulpage.coffeetablesbut().click();
		logger.info("clicked on coffee tablestand");
		int n=driver.findElements(By.tagName("img")).size();
		System.out.println("number of images of coffeetables items are "+ n);
		
		driver.close();
	}
//Test6
	
	@Test(priority=4)
	public void Case6() throws IOException, InterruptedException
	{
		driver=initializedriver();
	    reusablemethods.Implicitwait(driver);
	    OpenUrl();
	    UrbanladderHomePage ulpage= new UrbanladderHomePage(driver);
	    ulpage.ClosingPopup().click();
		Thread.sleep(5000);
		ulpage.clickingPintrest().click();
		logger.info("clicked on pinterest");
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle);
            logger.info("navigated to pinterest website");
		System.out.println(ulpage.followerscount().getText());
            }
        }
		
	}
	
	//Test7
	
	@Test(priority=6)
	public void Case7() throws IOException, InterruptedException
	{
		driver=initializedriver();
	    reusablemethods.Implicitwait(driver);
	    OpenUrl();
	    UrbanladderHomePage ulpage= new UrbanladderHomePage(driver);
	    ulpage.ClosingPopup().click();
		Thread.sleep(5000);
		ulpage.GetStudyTable().click();
		logger.info("clicked on study table");
		System.out.println("All Stocks: "+ulpage.GetProductsCount().getText());
		ulpage.GetCheckBox().click();
		Thread.sleep(5000);
			System.out.println("All in-Stocks: "+ulpage.GetProductsCount().getText());
	}
	
	//Test8
	
	@Test(priority=8)
	public void Case8() throws IOException, InterruptedException
	{
	
		driver=initializedriver();
	    reusablemethods.Implicitwait(driver);
	    OpenUrl();
	    UrbanladderHomePage ulpage= new UrbanladderHomePage(driver);
	    ulpage.ClosingPopup().click();
		Thread.sleep(5000);
		ulpage.clickingSales().click();
		logger.info("clicked on stores icon");
		ulpage.hoveringtocity().click();
		logger.info("hovered to city");
		Thread.sleep(5000);
		ulpage.gettingaddress().click();
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle);
           System.out.println(ulpage.addressget1().getText());
           
	}
        }
        driver.close();
	}
	
	//Test9
	
	@Test(dataProvider="getData",priority=7)
	public void Case9(String ordi,String Phno) throws IOException, InterruptedException
	{
		driver=initializedriver();
	    reusablemethods.Implicitwait(driver);
	    OpenUrl();
	    UrbanladderHomePage ulpage= new UrbanladderHomePage(driver);
	    ulpage.ClosingPopup().click();
		Thread.sleep(5000);
		ulpage.TrackOrder().click();
		logger.info("clicked on trackorder");
		ulpage.Orderid().sendKeys(ordi);
		logger.info("entered order id");
		ulpage.PhoneNumber().sendKeys(Phno);
		logger.info("entered phone number");
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		prop=PropertyFileReader.LoadFile();
		String p=prop.getProperty("path");
		String file=prop.getProperty("fileName");
		String sheet=prop.getProperty("sheetName");
		Object[][] data=ExcelReader.readExcel(p,file,sheet);
		
		return data;
	}
	
	//Test10
	
	@Test(priority=9)
	public void Case10() throws IOException, InterruptedException
	{
		driver=initializedriver();
	    reusablemethods.Implicitwait(driver);
	    OpenUrl();
	    UrbanladderHomePage ulpage= new UrbanladderHomePage(driver);
	    ulpage.ClosingPopup().click();
		Thread.sleep(5000);
		ulpage.clickingSearchBox().sendKeys("sofa");
		ulpage.clickingSearchButton().click();
		
		Actions action = new Actions(driver);
		  
		  action.moveToElement(ulpage.sofaclick()).perform();
		  action.moveToElement(ulpage.sofachecked()).click().perform();
		  Thread.sleep(5000);
		  logger.info("CHECKING SOFA SPECIFICATION IS CHECKED OR NOT???");
		  if(ulpage.sofachecked().isSelected())
		  {
			  System.out.println("Checkbox Got selected");
			  
		  }
		  
	}
	
	@AfterMethod
	public void closeDriverM()
	{
		driver.quit();
	}
	
	
	
	

}
