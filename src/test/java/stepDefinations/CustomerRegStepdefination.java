package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CustomerRegPageObject;

public class CustomerRegStepdefination {
	 WebDriver driver;
@Given("I load the Url {string}")
public void i_load_the_url(String url) {
    // Write code here that turns the phrase above into concrete actions
  
	WebDriverManager.chromedriver().setup();
if(driver==null){	
 driver=	new ChromeDriver();

}

CustomerRegPageObject pageobj= new CustomerRegPageObject(driver);

driver.get(url);
}


@Then("^I enter name (.*)$")
public void name(String name) {
    // Write code here that turns the phrase above into concrete actions
	CustomerRegPageObject.enterName(name);
	System.out.println("I entered name");
}
@Then("^I enter age (.*)$")
public void age(String age) {
    // Write code here that turns the phrase above into concrete actions
	CustomerRegPageObject.enterAge(age);
}
@Then("^I enter address (.*)$")
public void address(String addr) {
	CustomerRegPageObject.enterAddress(addr);
  
}
@Then("^I enter number (.*)$")
public void number(String number) {
    // Write code here that turns the phrase above into concrete actions
	CustomerRegPageObject.enterNumber(number);
}


@Then("^I enter email (.*)$")
public void email(String email) {
    // Write code here that turns the phrase above into concrete actions
	CustomerRegPageObject.enterMail(email);
}
@Then("I click submit button")
public void i_click_submit_button() {
    // Write code here that turns the phrase above into concrete actions
	CustomerRegPageObject.submit();
}

	
}
