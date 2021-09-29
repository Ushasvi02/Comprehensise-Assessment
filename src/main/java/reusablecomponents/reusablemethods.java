package reusablecomponents;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
public class reusablemethods {	
	public static void Implicitwait (WebDriver driver) throws IOException
	{	
		int wait=Integer.parseInt(base.prop.getProperty("waits"));
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}	
}
