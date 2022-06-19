package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepImplementation {

	static WebDriver driver;
	
	
	@Given("^I load the \"(.+)\" sample$")
	public void loadURL(String url){
		
		System.out.println("url  " +url );
		WebDriverManager.chromedriver().setup();
		System.out.println(driver);
		if(driver==null){
		 driver = new ChromeDriver();
		 driver.get(url);
		}
		System.out.println(driver);
	}

	@Then("^I enter username and password into the respective field$")
	public void enterUsername(DataTable datatable) throws InterruptedException {
		
		List<List<String>> data = datatable.asLists();
		System.out.println(data.size());
		System.out.println(data.get(1).size());
		
		
		
		for(int i=1; i <data.size(); i++){
			for(int j=0 ; j<data.get(i).size(); j++){
				String value = data.get(i).get(j);
				
				System.out.println(value);
				if(j==0){
				WebElement usern=driver.findElement(By.id("txtUsername"));
				usern.clear();
				usern.sendKeys(value);
				Thread.sleep(1000);
				}
				
				
				
				if(j==1){
					WebElement pswd= driver.findElement(By.id("txtPassword"));
					pswd.clear();
					pswd.sendKeys(value);
				}
				
				Thread.sleep(3000);
			}
		}
		
	
		
	
	}


	@Then("^I click login button$")
	public void clickButton() {
	   driver.findElement(By.id("btnLogin")).submit();
		System.out.println("click");
		
	}

}
