package online;

import java.io.IOException;
import org.openqa.selenium.WebElement;

public class ResultPage extends Locators{
	
	
	public static void shareFB() throws InterruptedException, IOException{
		 String parentWindow = Browser.getHandle();
		 Browser.find(buttonShareFB).click();
		 Browser.swichToChild(parentWindow);
		 Browser.waitLoad(postOnFB).click();
		 Browser.swichToParent(parentWindow);
	 }
	 
	 public static void shareOK() throws InterruptedException, IOException{
		 Browser.getDriver().get(Browser.find(frameShareOK).getAttribute("src"));
		 String parentWindow = Browser.getHandle();
		 Browser.find(buttonInFrameOK).click();
		 Browser.swichToChild(parentWindow);
		 Browser.find(postOnOK).click();
	 }
	 
		 
	 public static void shareVK() throws InterruptedException, IOException{
		 String parentWindow = Browser.getHandle();
		 WebElement shareButton = Browser.waitLoad(buttonShareVK);
		 Thread.sleep(2000);
		 shareButton.click();
		 Browser.swichToChild(parentWindow);
		 Browser.waitLoad(pictureOnShare).isDisplayed();
		 Browser.waitLoad(postOnVK).click();
		 Thread.sleep(3000);
		 Browser.swichToParent(parentWindow);
	 }
	 
	 public static void stopDriver(){
		 Browser.stop();
	 }

}
