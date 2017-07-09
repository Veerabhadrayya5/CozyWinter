package generic;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AutoUtility {
//toget screenshot of desktop
	/**
	 * Get screenshot of desktop
	 * @param path -> path of the image file
	 * return void
	 */
	public static void getScreenshot(String path)  {
		// TODO Auto-generated method stub
		
try
{
		
		Robot r=new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRect=new Rectangle(screenSize);
BufferedImage image = r.createScreenCapture(screenRect);

ImageIO.write(image, "png", new File(path));

}
catch(Exception e)
{
	
}
}

	//to get screenshot of page
	/**
	 * get screenshot of page
	 * @param driver
	 * @param path -> path of the image file
	 */
	public static void getScreenshot(WebDriver driver, String path)
	{
		try
		{
			TakesScreenshot t=(TakesScreenshot)driver;
			File image=t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(image, new File(path));
			
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	public static String now()
	{
		SimpleDateFormat s=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
	String timeStamp=s.format(new Date());
		return timeStamp;
	}
	
	
	
	public static String getPropertyValue(String path, String key)
	{
	String value=" ";
	try
	{
	
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		
		
		value=p.getProperty(key);
	}
	
	catch(Exception e)
	{
		
	}
	return value;
	}
	
	
	
	
	
}
