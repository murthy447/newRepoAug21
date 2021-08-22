package amazonSearch;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		TreeSet tree=new TreeSet();
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\PracticeWorkspace\\Episource\\Browser\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung M51");
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		List<WebElement> result= driver.findElements(By.xpath("(((//span[contains(text(),'M01')]/ancestor::div[contains(@class,'sg-col-inner')])/div[@class='sg-row'][2])/div[1])//span[contains(@class,'a-price-whole')]"));
		int size=result.size();
		for(int i=0; i<size; i++){
		String amount= result.get(i).getText();
		tree.add(amount);
		
		
		}
		
		String highest= (String) tree.last();
		System.out.println("high= " +highest);
		
	}
	

}
