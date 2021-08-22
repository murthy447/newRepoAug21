package amazonSearch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EpiSourceAmazon  {

	public static String value;
	public static String valueforXpath;
	public static String LastVal;
	public static WebDriver driver;
	public static String amount;
	public static String strHighest;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\PracticeWorkspace\\Episource\\Browser\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Set<Integer> tree=new TreeSet<Integer>();
		ExcelHandle.setExcelfile("Sheet1");
		
		System.out.println("lastrow  " +ExcelHandle.row) ;
		System.out.println("lastcol  " +ExcelHandle.col) ;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		for(int i=1; i<=ExcelHandle.row ;i++){
			
			for(int j=0; j<1 ; j++){
				
				value=ExcelHandle.readCellValue(i,j);
				
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(value);
				driver.findElement(By.xpath("//input[@value='Go']")).click();
				String[] ValSplitted= value.split(" ");
			
				if(ValSplitted[1].length()==2){
					
					valueforXpath=	ValSplitted[1].substring(0,1) +ValSplitted[1].substring(1).toUpperCase();
				}
				else{
					valueforXpath= ValSplitted[1].substring(0,1).toUpperCase()+ ValSplitted[1].substring(1).toLowerCase();
					System.out.println("valueforXpath length2 " +valueforXpath);
					}

				
				String finalxpath="(((//span[contains(text(),'" + valueforXpath + "')]/ancestor::div[contains(@class,'sg-col-inner')])/div[@class='sg-row'][2])/div[1])//span[contains(@class,'a-price-whole')]";
			
				System.out.println("finalxpath " +finalxpath);
				
				try{
				List<WebElement> result=driver.findElements(By.xpath(finalxpath));
				
				int size=result.size();
				for(int k=0; k<size; k++)
				{
				 amount= result.get(k).getText();
//				if(i==2){
//					
//					System.out.println("amount= "+amount);
//				}
				

				amount=amount.replace(",", "");
				int intAmount =Integer.valueOf(amount);
				tree.add(intAmount);
			
				}
				
				
				///script to write max amount in exccel
				
				  Object highest= Collections.max(tree);

				strHighest= highest.toString();
				System.out.println( value +" = " +strHighest);
				
				System.out.println("i value= " +i);
				ExcelHandle.writeCellvalue(i, j+1, strHighest );
				}
				catch(NoSuchElementException | java.util.NoSuchElementException e){
					e.printStackTrace();
					System.out.println(e.getMessage() + "for Index " +i);
				}
			//	
				
				driver.findElement(By.xpath("//a[contains(@id,'sprites')]")).click();
				
			}
			tree.clear();
			
			
		}		
		
		ExcelHandle.fileClose();
	}

}
