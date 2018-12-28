package browsers;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import logger.LoggerUtils;
import propertyread.PropertyReader;

public class BrowserFactory {
String className="BrowserFactory";
WebDriver driver;
PropertyReader prop=new PropertyReader();

public WebDriver getBrowser() {
	String methodName="getBrowser";
	String browserName=prop.getBrowserName();
	 PropertyConfigurator.configure("log4j.properties");
	LoggerUtils.debugMsg(className, methodName, "Browser Name "+browserName);
	
	switch (browserName) {
	
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		  ops.addArguments("--disable-notifications");
		driver=new ChromeDriver(ops);
				
		break;
		
	case "internetexplorer":
		System.setProperty("webdriver.ie.driver", "./lib/IEDriverServer.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		driver=new InternetExplorerDriver(cap);
				
		break;

	default:
		driver=new FirefoxDriver();
		break;
	}
	
	return driver;
}
}
