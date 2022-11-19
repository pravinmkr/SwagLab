package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void clickScreenshoot(WebDriver driver, String name) throws IOException {
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//upcasting of TakesS.S. interface to WebDriver interface (interface to interface upcasting)to complete the methods of takesSS interface we are using complete methods of Webdriver interface with ref variable driver
		
		File destination =new File("D:\\workplace eclipse\\SwagLabs\\ScreenShot\\"+name+".png");
		
		FileHandler.copy(source, destination);
		
	}

}
