package logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import propertyread.PropertyReader;

public class LoggerUtils {
	
	
	PropertyReader prop=new PropertyReader();
	static Logger logger = Logger.getLogger(LoggerUtils.class);
	
	public static void debugMsg(String classname,String methodname,String msg) {
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("Class Name "+classname+" method Name "+methodname+" "+msg);
	}
	

}
