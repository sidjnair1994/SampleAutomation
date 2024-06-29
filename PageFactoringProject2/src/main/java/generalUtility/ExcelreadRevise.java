package generalUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelreadRevise
{
	XSSFSheet Sh;
	
	public  ExcelreadRevise() throws IOException 
	{
		FileInputStream file= new FileInputStream("F:\\\\Workspace-Automation\\\\SeleniumSessions\\\\src\\\\main\\\\resources\\\\Excelread.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(file);
		Sh= w.getSheet("Sheet1");
		
	}
	
	public String excelreadNumericData(int i, int j) 
	{
		Row r=Sh.getRow(i);
		Cell c=r.getCell(j);
		
		int a=(int) c.getNumericCellValue();
		return String.valueOf(a);		
		
	}
	
	public String excelreadStringdata( int i, int j) 
	{
		Row r= Sh.getRow(i);
		Cell c=r.getCell(j);
		String a= c.getStringCellValue();
		return a;
	}
	
	

}
