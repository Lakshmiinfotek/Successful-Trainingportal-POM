package pageobjects;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class Registrationpage {
		WebDriver driver;

		Registrationpage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);// the parameter driver is looking for elements
		}

		@FindBy(name = "name")
		WebElement Name;

		@FindBy(name = "email")
		WebElement Email;

		@FindBy(name = "website")
		WebElement Website;

		@FindBy(name = "comment")
		WebElement Comment;

		@FindBy(xpath = "//input[@value='male']")
		WebElement Radiobuttonmale;

		@FindBy(xpath = "//input[@name='horse']")
		WebElement checkboxhorse;

		@FindBy(name = "country")
		WebElement Cntry;// country mentioned like Cntry

		@FindBy(id = "alert")
		WebElement alerttext;

		@FindBy(xpath = "//input[@value='Send']")
		WebElement submitButton;

		// methods for webElements
		public void setName(String pname) {
			Name.sendKeys(pname);// Name is a webElement and pname is a just a name as object
		}

		public void setEmail(String pmail) {
			Email.sendKeys(pmail);// Email is a webElement and pmail is a just a name as object
		}

		public void setWebsite(String psite) {
			Website.sendKeys(psite);// Website is a webElement and psite is a just a name as object.
		}

		public void setComment(String pcomment) {
			Comment.sendKeys(pcomment);

		}

		public void clickmalebutton()// Radiobutton female is a webElement and pbutton is a just a name as object
		{
			Radiobuttonmale.click();
		}

		public void clickhorsecheckbox()// Checkboxhorse is a webElement and used click method
		{
			checkboxhorse.click();
		}

		public void setctry(String Fcountry)// Cntry is a webelement and send keys is a object Fcountry.

		{
			Cntry.sendKeys(Fcountry);
		}

		public void clickAlerttext() {
			alerttext.click();// alerttext is a webelement and used click method
		}

		public void clicksubmitButton()// submit button

		{
			submitButton.click();
		}
	}



