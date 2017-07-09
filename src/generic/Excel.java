package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	
	public static String getCellValue(String path, String sheet, int r, int c)
	{
		String v=" ";
		try
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			
		}
		return v;
	}
	
	
	
	public static int getRowValue(String path, String sheet)
	{
		int r=0;
		try
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			r=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			
		}
		return r;
	}
	
	
	
	
	
	
	
	
}
