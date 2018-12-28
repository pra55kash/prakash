package excelread;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import logger.LoggerUtils;

public class ReadExcel {
	static String currentDir = System.getProperty("user.dir");
	public static Object[][] toRead(String inputDataFile) {
		LoggerUtils.debugMsg("ReadExcel", "toRead", inputDataFile);
		Object[][] inputData=null;
		String testDataExcelPath = currentDir + "\\src\\test\\resources\\";
		LoggerUtils.debugMsg("ReadExcel", "toRead", testDataExcelPath+inputDataFile);
		File src =new File(testDataExcelPath+inputDataFile+".xlsx");
		LoggerUtils.debugMsg("ReadExcel", "toRead", src.getAbsolutePath());
		try {
			XSSFWorkbook book=new XSSFWorkbook(new FileInputStream(src.getAbsolutePath()));
			XSSFSheet sheet=book.getSheetAt(0);
			int rowCnt=sheet.getLastRowNum();
			LoggerUtils.debugMsg("ReadExcel", "toRead", "no of row" +rowCnt);
			inputData=new Object[rowCnt+1][3];
			for(int i=0;i<rowCnt+1;i++) {
				inputData[i]=new Object[3];
				inputData[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
				inputData[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
				inputData[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
				
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LoggerUtils.debugMsg("ReadExcel", "toRead", "Exception Occured "+e.getMessage());
		}
	return inputData;
	}

}
