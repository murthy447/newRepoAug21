package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTest {
	
	@Given("^Open browser$")
	public void open_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   System.err.println("dfdfdf edited this line");
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Murthy\\Downloads\\SELENIUM WORKSPACE\\WebDriver\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	   driver.quit();
	}

	@Then ("^Enter URL$")
	public void enterUrl(){
		System.err.println("enterUrl completed");
	}
	@And ("^Enter UserName$")
	public void enterUserName(){
		System.out.println("UserName completed");
	}
	@And ("^Enter MobNumber$")
	public void mobNumber(){
		System.out.println("mobNumber completed");
	}
	@Then ("^Enter PickupAddress$")
	public void pickupAddress(){
		System.out.println("pickupAddress completed");
	}
	@And ("^Enter DropAddress$")
	public void dropAddress(){
		System.out.println("dropAddress completed");
	}
	
	@When ("^Select VehicleType$")
	public void vehicleType(){
	
		System.out.println("vehicleType completed");
	}
	
	@But ("^Dont Click Book Button$")
	public void bookButton(){
		System.out.println("bookButton completed");
	}

}
