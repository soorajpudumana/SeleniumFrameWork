package utilityLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getData(String sheetName, int rowNumber, int colNumber) throws Exception {
		String data = "";
		File file= new File("/NewFrameWork/src/main/resources/Book.xslx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.getCell(colNumber);
		data = cell.getStringCellValue();
		return data;
	}
	
	public void writeData(String sheetName,int rowNumber,int colNumber, String inputData) throws Exception {
		File file = new File("/NewFrameWork/src/main/resources/Book.xslx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.createRow(rowNumber);
		Cell cell = row.createCell(colNumber);
		cell.setCellValue(inputData);
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		fos.close();
	}
	
	public void readDownloadedFile() {
		
		
	}
}
