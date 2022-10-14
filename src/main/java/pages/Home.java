package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;

import commons.SeleniumHelper;

public class Home {
	protected SeleniumHelper seleniumHelper;
	
	public Home(SeleniumHelper seleniumHelper){
        this.seleniumHelper = seleniumHelper;
    }
	
	private final String searchTextbox = "//*[@data-test-id='address-box-input']";
	private final String searchButton = "//*[@data-test-id='find-restaurants-button']";
	private final String searchResult = "//*[@data-test-id='restaurant']";
	private final String acceptAllCookiesButton = "//*[@data-test-id='accept-all-cookies-button']";
	
	public void acceptCookie() {
		seleniumHelper.clickElement(acceptAllCookiesButton);
	}
	
	public void inputPostalCode(String postalCode) {
		seleniumHelper.sendKeysToElement(searchTextbox, postalCode);
	}
	
	public void submitSearch() {
		seleniumHelper.sendKeysToElement(searchTextbox, Keys.ENTER);
	}
	
	public void verifySearchHasResults() {
		assertTrue(seleniumHelper.findElements(searchResult).size() > 0); 
	}
}
