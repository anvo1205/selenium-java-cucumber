package commons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {
	public WebDriver driver;
	private WebDriverWait explicitWait;
	
	   public SeleniumHelper(WebDriver driver){
	        this.driver = driver;
	        explicitWait = new WebDriverWait(driver, 15);
	    }
	   
	   /**
	     * Find web element using xpath
	     * @param xpath of expected element
	     * @return WebElement of xpath
	     **/
	    public WebElement findElement(String xpath){
	            return driver.findElement(By.xpath(xpath));
	    }
	    
		   /**
	     * Find multiple web elements having similar xpath
	     * @param xpath of expected element
	     * @return List of WebElements
	     **/
	    public List<WebElement> findElements(String xpath){
	            return driver.findElements(By.xpath(xpath));
	    }
	    
	    /**
	     * Wait until element visible before performing next action on the located element
	     * @param xpath of expected element
	     **/
	    public void waitForElementVisible(String xpath){
	            explicitWait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))));
	    }
	    
	    /**
	     * click an element after waiting for its visibility
	     * @param xpath of expected element
	     **/
	    public void clickElement(String xpath){
	        waitForElementVisible(xpath);
	        findElement(xpath).click();
	    }
	    
	    /**
	     * send keys to a textbox
	     * @param xpath of expected element
	     * @parem value to send
	     **/
	    public void sendKeysToElement(String xpath, String value){
	        waitForElementVisible(xpath);
	        findElement(xpath).sendKeys(value);;
	    }
	    
	    /**
	     * send keys to a textbox using keyboard
	     * @param xpath of expected element
	     * @parem keys to send
	     **/
	    public void sendKeysToElement(String xpath, Keys keys){
	        waitForElementVisible(xpath);
	        findElement(xpath).sendKeys(keys);;
	    }
}
