package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchAfter {
	
	@FindBy(id="//*[@id=\"dtBefore 6 am\"]")
	private WebElement before6AM;
	
	@FindBy(xpath="//*[@id='fixer']//span[@class='src']")
	private WebElement src;
	
	@FindBy(xpath="//*[@id='fixer']//span[@class='dst']")
	private WebElement dst;
	
	
	public String getStartingPoint() {
		return src.getText();
	}
	
	public String getDestinationPoint() {
		return dst.getText();
	}

}
