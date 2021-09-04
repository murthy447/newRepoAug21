package stepDefinations;

import java.io.IOException;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepImplementation {
	static WebDriver driver;
	
	
@Given("^I load the \"(.+)\" sample$")
public void loadURL(String url){
	
	System.out.println("url  " +url );
	WebDriverManager.chromedriver().setup();
//	System.out.println(driver);
	
	if(driver==null){
	 driver = new ChromeDriver();
	 driver.get(url);
	}
//	System.out.println(driver);
}

@Then("^I enter (.+) into the username field$")
public void enterUsername(String username) {
	
	
	System.out.println("username " + username);
	
	driver.findElement(By.id("txtUsername")).sendKeys(username);
}

@Then("^I enter (.+) into the password field$")
public void enterPassword(String pswd) {
  driver.findElement(By.id("txtPassword")).sendKeys(pswd);
	System.out.println("pswd " +pswd);
}

@Then("^I click login button$")
public void clickButton() {
//	int i=1/0;
   driver.findElement(By.id("btnLogin")).submit();
	System.out.println("click");
	
}


@After
public void tearDown(Scenario s) throws IOException{
//	ScreenshotGenerator.generateScreenshot(driver, s);
	
	s.attach(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png", "image");
}

}
