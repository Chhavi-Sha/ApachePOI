package ExcelOperations;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		//String excelFilePath = ".//datafilesCountries.xlxs";

		File src = new File("C:\\Chhavi\\Training\\Countries.xlsx");
		FileInputStream ip = new FileInputStream(src);

		XSSFWorkbook workbook = new XSSFWorkbook(ip);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String data0 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.print(data0);
		
		System.out.print("||");
		String data1 = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.print(data1);
		
//		//Using for Loop
//		
//		int rows = sheet.getLastRowNum();
//		int cols = sheet.getRow(1).getLastCellNum();
//		
//		for (int r= 0; r<=rows ; r++) //rows in excel
//		{
//			XSSFRow row  = sheet.getRow(r); 	//get the row by first its start with 0
//			
//			for (int c =0;c<cols;c++)		//cell in each row
//			{
//				XSSFCell cell = row.getCell(c);
//				switch(cell.getCellType())
//				{
//				case STRING: System.out.println(cell.getStringCellValue());
//								break;
//				case NUMERIC: System.out.println(cell.getNumericCellValue());break;
//				case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
//				
//				}
//				
//			}
//			
//			System.out.println();
//		}
//
	}

}
