package online;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser {
	private static WebDriver driver;
	private static String firefox ="C:/Users/User/Desktop/geckodriver.exe";
	private static String gecko = "webdriver.gecko.driver";
	private static String chrome = "C:/Users/User/Desktop/sc/driver/chromedriver.exe";
	private static String chromeDriver = "webdriver.chrome.driver";
	
	public static void start(String browser, String url){
		
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty(gecko,firefox);
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty(chromeDriver, chrome);
			driver = new ChromeDriver();	
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static void stop(){
		driver.close();
		driver.quit();
	}
	
	public static WebElement find(By how){
	WebElement result = driver.findElement(how);
		return result; 
	}
	
	public static String getHandle(){
		  String window = driver.getWindowHandle();
		  return window;
	}
	
	 public static void swichToChild(String parentHandle){
		for (String child : driver.getWindowHandles()){
			 if(!child.equals(parentHandle)){
				 driver.switchTo().window(child);
		  }
		}
	 }
	 
	 public static void swichToParent(String parentHandle){
		 driver.switchTo().window(parentHandle);
	 }
	
	 public static WebElement waitLoad(By waitLocator) throws InterruptedException{
		 WebElement element = null;
		 for (int i = 0; i<=10; i++){ 
			 if(find(waitLocator).isDisplayed() !=true){
				 Thread.sleep(1000);
			 } else{
				 element = find(waitLocator);
				 break;
			 }
		 }
		return element;
	}
	 
	 public static void screenshot(String name) throws IOException{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String fileName = new File(name + ".png").getAbsolutePath();
		System.out.println(fileName);
		if (new File(fileName).exists()){
			new File(fileName).delete();
			FileUtils.copyFile(scrFile, new File(fileName));
		} else {
			FileUtils.copyFile(scrFile, new File(fileName));
		}
		
	 }
	 
	 	public static WebDriver getDriver(){
	 		return driver;
	 	}

}
