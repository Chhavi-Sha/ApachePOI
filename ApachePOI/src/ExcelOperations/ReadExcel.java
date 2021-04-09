package ExcelOperations;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		File src = new File("C:\\Chhavi\\Training\\Countries.xlsx");
		FileInputStream ip = new FileInputStream(src);

		XSSFWorkbook workbook = new XSSFWorkbook(ip);
		XSSFSheet sheet = workbook.getSheetAt(0);
	
		int rowcount = sheet.getLastRowNum();
		
		System.out.println("Total number of rows : "+rowcount);

		for(int r=0;r<=rowcount;r++)
		{
			//Row row = sheet.getRow(r);
			for(int c=0;c<sheet.getRow(r).getLastCellNum();c++)
			{
				System.out.print(sheet.getRow(r).getCell(c).getStringCellValue()+"||");
			}
		
		System.out.println();
		}
		
		workbook.close();
		
	}

}
