package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCnumb1
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("E:\\march automation\\Babu.xlsx");
		FileOutputStream fos;
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(4);
		cell.setCellValue("Passed");
		
		fos = new FileOutputStream("E:\\march automation\\Babu.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
