package script;


import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.AutoUtility;
import generic.BaseTest;
import generic.Excel;


public class WBT extends BaseTest{

	@Test
	public void testWBT()
	{
		
	//	log.info("My 1st log");
	//	log.info("executing....");
int r=	Excel.getRowValue(INPUT_PATH, "sheet1");
log.info("RowCount"+r);
	

	String v=Excel.getCellValue(INPUT_PATH, "sheet1", 0, 0);
	log.info("CellValue"+v);
//	log.info("EXecuting WBT test");
	Assert.fail();
	


	}
	
	
}
