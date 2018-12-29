package RedBusBooking.RedBus;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import excelread.ReadExcel;

public class TestRedBus extends BaseClass{
	
	
@Test(description="Searching Buses",dataProvider="SearchBus",priority=1)

	public void searchBuses(String src,String dst,String date) {
	System.out.println(src+"   "+dst+"  111 "+date);
	 log = report.startTest("searchBuses");
		
		redBus.setFromTextField(src);
		redBus.setToTextField(dst);
		redBus.setOnwardDateTextField(date);
		redBus.clickSearchBusesButton();
		log.log(LogStatus.INFO, "data entered and search clicked");
		String actual =searchAfter.getStartingPoint()+" to "+searchAfter.getDestinationPoint();
		String expected=src+" to "+dst;
		
		Assert.assertEquals(actual, expected);
		log.log(LogStatus.PASS, "Test Passed");
}


@Test(description="Searching Buses",dataProvider="SearchBus",priority=2)

public void searchBuses1(String src,String dst,String date) {
System.out.println(src+"   "+dst+"  222 "+date);
log = report.startTest("searchBuses1");
	redBus.setFromTextField(src);
	redBus.setToTextField(dst);
	redBus.setOnwardDateTextField(date);
	redBus.clickSearchBusesButton();
	log.log(LogStatus.INFO, "data entered and search clicked");
	String actual =searchAfter.getStartingPoint()+" to "+searchAfter.getDestinationPoint();
	String expected=src+" to "+dst;
	
	Assert.assertEquals(actual, expected);
	log.log(LogStatus.PASS, "Test Passed");
}





@DataProvider(name="SearchBus")
public Object[][] dataProvider() {
	
	return ReadExcel.toRead("InputData");
	
	
}
}
