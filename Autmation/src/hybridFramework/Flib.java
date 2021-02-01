package hybridFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
// this fLib class will have only the methods which are used to perform the reading /writting operation on the excel/prop file
public class Flib {
	// generic reusable method to read the data from the property file
	public String readPropertyData(String path,String key) throws IOException
	{ 
		FileInputStream fis = new FileInputStream(path);
	    Properties prop = new Properties();
	    prop.load(fis);
	    String value = prop.getProperty(key);
		return value;
		
	}
	// generic reyusable method  to get the row count
	public int getRowCount(String path,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowcount = sh.getLastRowNum();
		return rowcount;
	}
	
	// generic reusable method to write the data in the excel file
	public void writeExcel(String path,String sheetName,int rowNum,int cellNum,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);//read the excel where in we need to store the data
		Workbook wb = WorkbookFactory.create(fis);// make the file ready for read operation
		Sheet sh = wb.getSheet(sheetName);//get the shwwt where in data has to be inserted
		Row row = sh.getRow(rowNum);//make the row ready for write operation
		Cell cell = row.createCell(cellNum);// it will make the cell ready for writting operation
        cell.setCellValue(data);// set the value of the cell
        FileOutputStream fos = new FileOutputStream(path);//file path has to be given for write operation 
        wb.write(fos);// this method of Worknbook actually performs the write operation
	}
	
	// generic reusable method to read the data from the excel file
	public String readExcelData(String path,String sheet,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row row = sh.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String excelData = cell.getStringCellValue();
		return excelData;
	}	

}