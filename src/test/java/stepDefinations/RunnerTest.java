package stepDefinations;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
features="src\\test\\resources\\features"
,glue="stepDefinations"
,monochrome= true
,publish = true
,plugin ={"pretty", "html:target/htmlReport/htmlreport.html"
		,"json:target/jsonReports/cucumberjsn.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
	
	
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	
	
//	@AfterClass
////	public static void afterClass(){
////		new MyThread();
////	}
//	
//	
//	
//	
//	public static void generateReport(){
//		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//		
//		File cucumberReports=	new File("D:\\PracticeWorkspace\\BDDCucumberWithMultipleData\\target\\jsonReports\\cucumberjsn.json");
//		
//		File cucumberReportsHistory=	new File("D:\\PracticeWorkspace\\BDDCucumberWithMultipleData\\target\\jsonReports\\cucumberjsn_"+timestamp+".json");
//		
//		cucumberReports.renameTo(cucumberReportsHistory);
//		File dir = new File("D:\\PracticeWorkspace\\BDDCucumberWithMultipleData\\target\\jsonReports\\");
//		
//		FileUtils fileUtils = new FileUtils();
//		
//		
//		
//		File[] files= dir.listFiles(new FilenameFilter() {
//		    public boolean accept(File dir, String name) {
//		        return name.startsWith("cucumberjsn") && name.endsWith(".json");
//		    }});
//		
//		if(files!=null){
//		Collection<File>	jsonFiles =Arrays.asList(files);
//		List<String> jsonpaths = new ArrayList(jsonFiles.size());
//		
//		for(File file: jsonFiles){
//			jsonpaths.add(file.getAbsolutePath());
//		}
//		
//		Configuration config =new Configuration(new File("target"), "CucumberBDD");
//		
//		config.addClassifications(StringUtils.capitalize("PLATFORM"), "Windows");
//		config.addClassifications(StringUtils.capitalize("BROWSER"), "Chrome");
//		
//			
//		ReportBuilder reportbuilder = new ReportBuilder(jsonpaths, config);
////		reportbuilder.generateReports();
//		}
//	}

}


//class MyThread extends Thread{
//	
//	public void run(){
//		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//		
//	File cucumberReports=	new File("D:\\PracticeWorkspace\\BDDCucumberWithMultipleData\\target\\jsonReports\\cucumberjsn.json");
//	
//	File cucumberReportsHistory=	new File("D:\\PracticeWorkspace\\BDDCucumberWithMultipleData\\target\\jsonReports\\cucumberjsn_"+timestamp+".json");
//	
//	cucumberReports.renameTo(cucumberReportsHistory);
//	RunnerTest.generateReport();
//	
//	
//	}
	
//	}
