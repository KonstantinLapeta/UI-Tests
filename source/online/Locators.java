package online;

import org.openqa.selenium.By;

public class Locators {
	
	protected static final String url = "https://megatest.online/ru";
    // button on header for login
	protected static final By buttonLogin = By.className("login");
	protected static final By logOut = By.className("login__btn-logout");	
	// autorization window
	protected static final By fb = By.xpath("html/body/div[7]/div[2]/div/button[1]");
	protected static final By ok = By.xpath("html/body/div[7]/div[2]/div/button[2]");
	protected static final By vk = By.xpath("html/body/div[7]/div[2]/div/button[3]");
	protected static final By fbLogin = By.id("email");
	protected static final By fbPass = By.id("pass");
	protected static final By fbButtonLogin = By.xpath(".//*[@id='loginbutton']");
	protected static final By okLogin = By.xpath(".//*[@id='field_email']");
	protected static final By okPass = By.xpath(".//*[@id='field_password']");
	protected static final By okButtonLogin = By.xpath(".//*[@id='mainW']/div[2]/div/div/form/div[4]/input");
	protected static final By vkLogin = By.xpath(".//*[@id='login_submit']/div/div/input[6]");
	protected static final By vkPass = By.xpath(".//*[@id='login_submit']/div/div/input[7]");
	protected static final By vkButtonLogin = By.id("install_allow");
	protected static final By buttonRunTest = By.className("page-test__btn-start-test");
	//button share on our site 
	protected static final By buttonShareFB = By.xpath("(//button[@type='button'])[20]");
	protected static final By frameShareOK = By.id("__okShare1");
	protected static final By buttonShareVK = By.xpath("(//button[@type='button'])[20]");
	protected static final By pictureOnShare = By.id("image_cont");
    // buttons share in open window
	protected static final By postOnFB = By.id("u_0_k");
	protected static final By postOnOK = By.tagName("button");
	protected static final By postOnVK = By.id("post_button");
	protected static final By buttonInFrameOK = By.id("mainDiv");
    // data for login 
	protected static final String loginFB = "lapeta@megatest.online";
	protected static final String passFB = "1qaz2wsx3edc";
	protected static final String login = "+380734766240";
	protected static final String pass = "1qaz2wsx";
    
}
