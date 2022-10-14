package commons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	protected WebDriver driver;
	protected SeleniumHelper seleniumHelper;
	
    public SeleniumHelper testSetUp(){
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		seleniumHelper = new SeleniumHelper(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.just-eat.co.uk");
		
		return seleniumHelper;
    }
    
    public void tearDown() {
    	driver.quit();
    }
    
    

}
