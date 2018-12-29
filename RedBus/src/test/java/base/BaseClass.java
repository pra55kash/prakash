package base;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import browsers.BrowserFactory;
import pages.RedBus;
import pages.SearchAfter;

public class BaseClass {

	public WebDriver driver;
	public RedBus redBus;
	public SearchAfter searchAfter;
	BrowserFactory factory=new BrowserFactory();
	public ExtentReports report;
	public ExtentTest log;
	
	@BeforeTest
	public void startReport(){
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.home"));
		//report = new ExtentReports ("./../../test-output/xtentReport.html", true);
		report = new ExtentReports (System.getProperty("user.dir")+"/test-output/xtentReport1.html", true);
		 
		 }
	@BeforeMethod
	public void openbrowser() {
		System.out.println("before method");
		driver=factory.getBrowser();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		redBus=PageFactory.initElements(driver, RedBus.class);
		searchAfter=PageFactory.initElements(driver, SearchAfter.class);
				
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		report.endTest(log);
		driver.quit();
	}
	
	@AfterTest
public void close() {
		
		report.flush();
report.close();
	}
}
