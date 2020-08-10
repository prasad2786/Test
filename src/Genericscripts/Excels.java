package Genericscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excels 
{
	public void getexceldata(String sheet,int row,int cell) throws Exception
	{
		FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
		Workbook wh=WorkbookFactory.create(fis);
		Sheet sh=wh.getSheet(sheet);
		Row r=sh.getRow(row);
		Cell c=r.getCell(cell);
		String data= c.getStringCellValue();
		System.out.println(data);
	}
	
	public void writedata(String Sheet,int row,String data) throws Exception
	{
		FileInputStream fis=new FileInputStream("./Excel/data1.xlsx");
		Workbook wh=WorkbookFactory.create(fis);
		Sheet sh=wh.getSheet(Sheet);
		
		Row rh=sh.createRow(row);
		
		Cell ch=rh.createCell(0);
		
		ch.setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream("./Excel/data1.xlsx");
		
		wh.write(fos);
	}
}
