package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.log4testng.Logger;


public class BasePage implements IAutoConst{

	public WebDriver driver;
	public long lngETO;
	public Logger log;
	public WebDriverWait wait;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		String strETO=AutoUtility.getPropertyValue(Config_Path, "ETO");
		lngETO=Long.parseLong(strETO);
		wait=new WebDriverWait(driver, lngETO);
		log=Logger.getLogger(this.getClass());
	}
	public void verifyTitle(String eTitle)
	{
		log.info("Exprected"+eTitle);
	

	try
	{
		wait.until(ExpectedConditions.titleIs(eTitle));
		log.info("Title is matching");
	}

	catch(Exception e)
	{
	String aTitle=driver.getTitle();
	log.info("Actual Title"+aTitle);
	log.info("Title is NOT matching");
	Assert.fail();
	}
	
	}
	
	
}
