package online;

import org.openqa.selenium.WebElement;

public class StartTestPage extends Locators{
	
 
	public static void beginTestFB(String testId, String browser) throws InterruptedException, Exception{
		 Browser.start(browser, url + "/test/"+ testId);
		    Browser.find(buttonRunTest).click();
		    Browser.find(fb).click();
		    String parentWindow = Browser.getHandle();
			Browser.swichToChild(parentWindow);
			Browser.waitLoad(fbLogin).sendKeys(loginFB); 
			Browser.find(fbPass).sendKeys(passFB);
			Browser.find(fbButtonLogin).click();
			Browser.swichToParent(parentWindow);
			Browser.waitLoad(buttonShareFB);
			//Browser.screenshot("Test" + testId);
	}
	
	public static void beginTestOK(String testId, String browser) throws InterruptedException, Exception{
		 	Browser.start(browser, url + "/test/"+ testId);
		    Browser.find(buttonRunTest).click();
		    Browser.find(ok).click();
		    String parentWindow = Browser.getHandle();
			Browser.swichToChild(parentWindow);
			Browser.waitLoad(okLogin).sendKeys(login); 
			Browser.find(okPass).sendKeys(pass);
			Browser.find(okButtonLogin).click();
			Browser.swichToParent(parentWindow);
			//Browser.screenshot("Test" + testId);
	}
	
	public static void beginTestVK(String testId, String browser) throws InterruptedException, Exception{
		 Browser.start(browser, url + "/test/"+ testId);
		    Browser.find(buttonRunTest).click();
		    Browser.find(vk).click();
		    String parentWindow = Browser.getHandle();
			Browser.swichToChild(parentWindow);
			WebElement loginFild = Browser.waitLoad(vkLogin);
			loginFild.clear();
			loginFild.sendKeys(login);
			WebElement passFild = Browser.find(vkPass);
			passFild.click();
			passFild.clear();
			passFild.sendKeys(pass);
			Browser.find(vkButtonLogin).click();
			Browser.swichToParent(parentWindow);
			Browser.waitLoad(buttonShareVK);
			//Browser.screenshot("Test" + testId);
	}
	
	public static void stopDriver(){
	 Browser.stop();
	}

}

