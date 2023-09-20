package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ContactUsFunctionalityPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, 50);

	public ContactUsFunctionalityPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[normalize-space()='Contact us']")
	private WebElement contactUsLink;
	@FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
	private WebElement getinTouchtextLocator;
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement nameField;
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement EmailField;
	@FindBy(xpath = "//input[@placeholder='Subject']")
	private WebElement subjectField;
	@FindBy(xpath = "//textarea[@id='message']")
	private WebElement messageField;
	@FindBy(xpath = "//input[@name='upload_file']")
	private WebElement chooseFileField;
	@FindBy(xpath = "//input[@name='submit']")
	private WebElement submitButton;
	@FindBy(xpath = "//div[@class='status alert alert-success']")
	private WebElement succussMessageLocator;
	@FindBy(xpath = "//a[@class='btn btn-success'][contains(.,'Home')]")
	private WebElement HomePageLocator;
	@FindBy(xpath = "//a[contains(text(),'Test Cases')]")
	private WebElement testcasesLinkLocator;
	@FindBy(xpath = "//b[normalize-space()='Test Cases']")
	private WebElement TestCasesPageSuccussMessageLocator;

	// Clicking on contactUs link
	public void clickOnContactUs() {
		wait.until(ExpectedConditions.visibilityOf(contactUsLink));
		contactUsLink.click();

	}

	// Verify text message
	public void VerifyGetinTouchTextinthePage() {
		wait.until(ExpectedConditions.visibilityOf(getinTouchtextLocator));
		String expectedText = getinTouchtextLocator.getText();
		String actualText = "GET IN TOUCH";
		Assert.assertEquals(true, expectedText.equals(actualText));

	}

	// Entering name
	public void enterName(String name) {
		wait.until(ExpectedConditions.visibilityOf(nameField));
		nameField.sendKeys(name);

	}

	// Entering Email
	public void enterEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(EmailField));
		EmailField.sendKeys(email);

	}

	// Entering subject
	public void enterSubject(String subject) {
		wait.until(ExpectedConditions.visibilityOf(subjectField));
		subjectField.sendKeys(subject);

	}

	// Entering Message
	public void enterMessage(String message) {
		wait.until(ExpectedConditions.visibilityOf(messageField));
		messageField.sendKeys(message);

	}

	// Choosing file
	public void clickandChooseFile() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(chooseFileField));
		chooseFileField.sendKeys("D:\\Git Repo\\Project2\\src\\test\\resources\\configuration\\UploadFile.txt");
	}

	// Clicking on submit
	public void clickOnsubmit() {
		wait.until(ExpectedConditions.visibilityOf(submitButton));
		submitButton.click();

	}

	// Clicking on Ok button
	public void clickOnalertOkbutton() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	// Verifying succuss Message
	public void verifyingSuccussMessage() {
		wait.until(ExpectedConditions.visibilityOf(succussMessageLocator));
		String expectedText = succussMessageLocator.getText();
		String actualText = "Success! Your details have been submitted successfully.";
		Assert.assertEquals(true, expectedText.equals(actualText));

	}

	// Verifying user is in home Page
	public void verifyUserInHomePage() {
		wait.until(ExpectedConditions.visibilityOf(HomePageLocator));
		HomePageLocator.click();

	}
   //Clicking on TestCases Link
	public void clickonTestCasesButton() {
		wait.until(ExpectedConditions.visibilityOf(testcasesLinkLocator));
		testcasesLinkLocator.click();

	}
     //Verifying use is in TestCases Page
	public void validateUserisinTestcasesPage() {
		wait.until(ExpectedConditions.visibilityOf(TestCasesPageSuccussMessageLocator));
		String expectedText = TestCasesPageSuccussMessageLocator.getText();
		String actualText = "TEST CASES";
		Assert.assertEquals(true, expectedText.equals(actualText));

	}

}
