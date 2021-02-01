package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	// generic Reusable method
	public String getCellData(String path,String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		return value;
		
	}
	
	public int getRowCount(String path,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowcount = sh.getLastRowNum();
		return rowcount;
	}
	
	
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
	

}