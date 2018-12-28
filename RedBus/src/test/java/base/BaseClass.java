package base;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
	ExtentReports report;
	public ExtentTest log;
	@BeforeMethod
	public void openbrowser() {
		report=new ExtentReports(System.getProperty("user.dir") +"\\src\\test\\reports\\STMExtentReport.html");
		System.out.println("before method");
		 log = report.startTest("TestRedBus");
		driver=factory.getBrowser();
		log.log(LogStatus.INFO, "Browser Opened");
		driver.manage().window().maximize();
		log.log(LogStatus.INFO, "window Maximized");
		driver.get("https://www.redbus.in/");
		log.log(LogStatus.INFO, "Url entered");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		redBus=PageFactory.initElements(driver, RedBus.class);
		searchAfter=PageFactory.initElements(driver, SearchAfter.class);
		log.log(LogStatus.INFO, "Page created");
				
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		
		log.log(LogStatus.INFO, "closing browser");
		report.flush();
		driver.quit();
	}
}
