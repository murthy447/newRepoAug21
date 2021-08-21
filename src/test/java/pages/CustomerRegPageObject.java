package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerRegPageObject {
	
static	WebDriver driver;
	public CustomerRegPageObject(WebDriver drive) {
		// TODO Auto-generated constructor stub
		driver=drive;
		
	}
	public static void enterName(String name){
		driver.findElement(By.name("cname")).sendKeys(name);
	} 
	
	
	public static void enterAge(String age){
		driver.findElement(By.name("age")).sendKeys(age);
	} 
	
	
	public static void enterAddress(String address){
		driver.findElement(By.name("address")).sendKeys(address);
	} 
	
	
	public static void enterNumber(String phonenumber){
		driver.findElement(By.name("phonenumber")).sendKeys(phonenumber);
	} 
	
	
	public static void enterMail(String email){
		driver.findElement(By.name("email")).sendKeys(email);
	} 
	
	
	public static void submit(){
		driver.findElement(By.id("submit")).submit();
	}
	
}
