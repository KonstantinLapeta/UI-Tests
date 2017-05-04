package online;

import org.openqa.selenium.By;

public class MainPage extends Locators{
	
	public static void loginFB(String login, String pass) throws InterruptedException{
		
		Browser.start("firefox", url); 
		Browser.find(buttonLogin).click();
		Browser.find(fb).click(); 
		String parentWindow = Browser.getHandle();
		Browser.swichToChild(parentWindow); 
		Browser.find(fbLogin).sendKeys(login); 
		Browser.find(fbPass).sendKeys(pass);
		Browser.find(fbButtonLogin).click();
		Browser.swichToParent(parentWindow);
		Browser.find(buttonLogin).click(); 
		Browser.find(logOut).click(); 
	}
	
    public static void loginVK(String login, String pass) throws InterruptedException{
    	Browser.start("firefox", url); 
		Browser.find(buttonLogin).click(); 
		Browser.find(vk).click(); 
		String parentWindow = Browser.getHandle();
		Browser.swichToChild(parentWindow); 
		Browser.find(vkLogin).sendKeys(login); 
		Browser.find(vkPass).sendKeys(pass);
		Browser.find(vkButtonLogin).click();
		Browser.swichToParent(parentWindow);
		Browser.find(buttonLogin).click(); 
		Browser.find(logOut).click();
	}

    public static void loginOK(String login, String pass) throws InterruptedException{
    	Browser.start("firefox",url); 
		Browser.find(buttonLogin).click(); 
		Browser.find(ok).click(); 
		String parentWindow = Browser.getHandle();
		Browser.swichToChild(parentWindow); 
		Browser.find(okLogin).sendKeys(login); 
		Browser.find(okPass).sendKeys(pass);
		Browser.find(okButtonLogin).click();
		Browser.swichToParent(parentWindow);
		Browser.find(buttonLogin).click(); 
		Browser.find(logOut).click();
}
    public static void changeLanguage(By lang){
    	Browser.find(lang).click();
    }
    
}
