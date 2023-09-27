package Maven_Excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

@SuppressWarnings("unused")
public class Handling_ExcelSheet {
	static String value;
	
	 static void singledata() throws Exception {
		File excel = new File("C:\\Users\\White_Devil\\eclipse-workspace\\Facebook\\Excel\\demo.xlsx");
		FileInputStream input = new FileInputStream(excel);
		
		Workbook demo = new XSSFWorkbook();
		Sheet s = demo.getSheetAt(0);
		
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		CellType ct = c.getCellType();
		
		if(ct.equals(CellType.STRING)) {
			 value = c.getStringCellValue();
		}else if(ct.equals(CellType.NUMERIC)) {
			double numericValue = c.getNumericCellValue();
			value = String.valueOf(numericValue);
			
		}
		System.out.println(value);
		
	}
	
	static void Alldata() throws Exception{
		File excel = new File("C:\\Users\\White_Devil\\eclipse-workspace\\Facebook\\Excel\\demo.xlsx");
		FileInputStream input = new FileInputStream(excel);
		
		Workbook demo = new XSSFWorkbook();
		Sheet s = demo.getSheetAt(0);
		
		
		for(int i =0; i< s.getLastRowNum(); i++) {
			Row r = s.getRow(i);
			for(int j=0; j< r.getLastCellNum(); j++) {
				
				Cell c = r.getCell(j);
				CellType ct = c.getCellType();
				if(ct.equals(CellType.STRING)) {
					String value = c.getStringCellValue();
				}else if(ct.equals(CellType.NUMERIC)) {
					double numericValue = c.getNumericCellValue();
					value = String.valueOf(numericValue);
					
				}
				
			}
		}
		System.out.println(value);
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception{
//		singledata();
		Alldata();
		
	}
	
	
	
	
	
	
	

}
