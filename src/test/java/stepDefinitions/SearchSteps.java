package stepDefinitions;

import commons.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Home;

public class SearchSteps extends TestBase{
	
	Home home;
	
	@Before
	public void setUp() {
		super.testSetUp();
		home = new Home(seleniumHelper);
		home.acceptCookie();
	}
	
	@Given("^I want food in \"([^\"]*)\"$")
	public void iWantFoodIn(String postalCode) {
		home.inputPostalCode(postalCode);
	  
	}

	@When("^I search for restaurants$")
	public void iSearchForRestaurants() {
		home.submitSearch();
	  
	}

	@Then("^I should see some restaurants in that area$")
	public void iShouldSeeSomeRestaurantsIn() {
	    home.verifySearchHasResults();
	}
	
	@After
	public void cleanUp() {
		 super.tearDown();
	}

}
