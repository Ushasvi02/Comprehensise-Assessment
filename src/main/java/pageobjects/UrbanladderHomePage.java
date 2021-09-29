package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import uistore.HomePageUi;
public class UrbanladderHomePage {

	WebDriver driver;
	HomePageUi pageui=new HomePageUi();
	public UrbanladderHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement clickingIcon()
	{
		return driver.findElement(pageui.signicon);
	}
	public WebElement clickingSignup()
	{
		return driver.findElement(pageui.signupopt);
	}
	public WebElement Signupmail()
	{
		return driver.findElement(pageui.signmail);
	}
	public WebElement Signuppass()
	{
		return driver.findElement(pageui.signpass);
	}
	public WebElement Signupsubmit()
	{
		return driver.findElement(pageui.signsubmit);
	}
	public WebElement Signuperror()
	{
		return driver.findElement(pageui.signerror);
	}
	
	public WebElement clickingLogin()
	{
		return driver.findElement(pageui.loginopt);
	}
	public WebElement clickingSearchBox()
	{
		return driver.findElement(pageui.clicksearchBox);
	}
	
	public WebElement clickingSearchButton()
	{
		return driver.findElement(pageui.clicksearchButton);
	}
	
	public WebElement CheckingChair1()
	{
		return driver.findElement(pageui.chairCheck1);
	}
	
	public WebElement ClosingPopup()
	{
		return driver.findElement(pageui.closingpopup);
	}
	public WebElement ClickingAboutUs()
	{
		return driver.findElement(pageui.aboutus);
	}
	public WebElement AboutLadderpara()
	{
		return driver.findElement(pageui.aboutladder);
	}
	
	public WebElement clickingrecliner()
	{
		return driver.findElement(pageui.recliner);
	}
	public WebElement clickingrecliner1()
	{
		return driver.findElement(pageui.recliner1);
	}
	public WebElement checkingrecliner1price()
	{
		return driver.findElement(pageui.recliner1price);
	}
	public WebElement clickingbookshelf()
	{
		return driver.findElement(pageui.bookshelf);
	}
	public WebElement clickingbookshelf1()
	{
		return driver.findElement(pageui.bookshelf1);
	}
	
	public WebElement addcartbutton()
	{
		return driver.findElement(pageui.addtocart);
	}
	public WebElement coffeetablesbut()
	{
		return driver.findElement(pageui.cofeetable);
	}
	public WebElement clickingPintrest()
	{
		return driver.findElement(pageui.pinterest);
	}
	
	public WebElement followerscount()
	{
		return driver.findElement(pageui.followers);
	}
	
	public WebElement GetStudyTable()
	{
		return driver.findElement(pageui.StudyTable);
	}
	public WebElement GetProductsCount()
	{
		return driver.findElement(pageui.productCount);
	}
	public WebElement GetCheckBox()
	{
		return driver.findElement(pageui.Checkbox);
	}
	public WebElement clickingSales()
	{
		return driver.findElement(pageui.sales);
	}
	public WebElement hoveringtocity()
	{
		return driver.findElement(pageui.hydsale);
	}
	public WebElement gettingaddress()
	{
		return driver.findElement(pageui.address);
	}
	public WebElement addressget1()
	{
		return driver.findElement(pageui.addressget);
	}
	public WebElement Emailenter1()
	{
		return driver.findElement(pageui.email1);
	}
	public WebElement Passwordenter2()
	{
		return driver.findElement(pageui.pass1);
	}
	public WebElement Orderid()
	{
		return driver.findElement(pageui.orderid);
	}
	public WebElement PhoneNumber()
	{
		return driver.findElement(pageui.phno);
	}
	public WebElement TrackOrder()
	{
		return driver.findElement(pageui.track);
	}
	
	public WebElement sofaclick()
	{
		return driver.findElement(pageui.sofafinish);
	}
	
	public WebElement sofachecked()
	{
		return driver.findElement(pageui.checked);
	}
	
}
