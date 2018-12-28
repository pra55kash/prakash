package propertyread;

import base.TypedProperties;

public class PropertyReader {

	TypedProperties typedProperties=new TypedProperties("/config.properties") ;
	
	public String getBrowserName() {
		return typedProperties.getValue("browser.name");
	}
}
