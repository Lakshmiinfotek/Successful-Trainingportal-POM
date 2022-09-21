package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registrationpagetest {
	@Test
	public void verifyreg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Registrationpage Regpage = new Registrationpage(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://training.qaonlinetraining.com/testPage.php");
		Regpage.setName("Apple");
		Regpage.setEmail("Apple@yahoo.com");
		Regpage.setWebsite("https://www.amazon.com/");
		Regpage.setComment("I am learning");

		Regpage.clickmalebutton();// line 63 in reg.pageclick radiobutton female
		Regpage.clickhorsecheckbox();// line68 in regpage.
		Regpage.setctry("France");// setctry is the method in method line73
		Regpage.clicksubmitButton();// click submit/send button
		Regpage.clickAlerttext();// clickalerttext is the method from regratin page.line79

		Thread.sleep(1000);

	}

}


