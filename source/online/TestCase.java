package online;

import org.testng.annotations.Test;

public class TestCase extends Locators{

	@Test
	public static void loginShareFB() throws InterruptedException, Exception{
		StartTestPage.beginTestFB("311","firefox");
		ResultPage.shareFB();
		ResultPage.stopDriver();
	}
	
	
	@Test
	public static void loginShareVK() throws InterruptedException, Exception{
		StartTestPage.beginTestVK("311","firefox");
		ResultPage.shareVK();
		ResultPage.stopDriver();
	}
	
	
	@Test
	public static void loginShareOK() throws InterruptedException, Exception{
		StartTestPage.beginTestOK("311", "firefox");
		ResultPage.shareOK();
		ResultPage.stopDriver();
	}	
		
}
