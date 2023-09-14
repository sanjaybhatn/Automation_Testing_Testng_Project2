package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.BasePage;

public class LoginFunctionalitytestsPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, 50);

	public LoginFunctionalitytestsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//img[@alt='Website for automation practice']")
	private WebElement homePageLogo;
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	private WebElement signupLoginLink;
	@FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
	private WebElement newUserSignUp;
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement nameTextField;
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	private WebElement emailTextField;
	@FindBy(xpath = "//button[normalize-space()='Signup']")
	private WebElement signUpButton;
	@FindBy(xpath = "//b[contains(.,'Enter Account Information')]")
	private WebElement ENTERACCOUNTINFORMATIONtext;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement nameField;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailIdField;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passField;
	@FindBy(xpath = "//select[@id='days']")
	private WebElement daysDrop;
	@FindBy(xpath = "//select[contains(@data-qa,'months')]")
	private WebElement monthsDrop;
	@FindBy(xpath = "//select[contains(@data-qa,'years')]")
	private WebElement yearsDrop;
	@FindBy(xpath = "//input[@id='newsletter']")
	private WebElement newsLetterRadio;
	@FindBy(xpath = "//input[@id='optin']")
	private WebElement recieveSpecialOffer;
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstNamaeField;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastNameField;
	@FindBy(xpath = "//input[@id='company']")
	private WebElement CompanyNamaeField;
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement address1Field;
	@FindBy(xpath = "//input[@id='address2']")
	private WebElement address2Field;
	@FindBy(xpath = "//select[@id='country']")
	private WebElement countryDrop;
	@FindBy(xpath = "//input[@id='state']")
	private WebElement stateField;
	@FindBy(xpath = "//input[@id='city']")
	private WebElement cityField;
	@FindBy(xpath = "//input[@id='zipcode']")
	private WebElement zipCodeField;
	@FindBy(xpath = "//input[@id='mobile_number']")
	private WebElement mobileNumberField;
	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	private WebElement createAccountButton;
	@FindBy(xpath = "//b[normalize-space()='Account Created!']")
	private WebElement accountCreatedsuccussMessage;
	@FindBy(xpath = "//p[contains(text(),'Congratulations! Your new account has been success')]")
	private WebElement congratulationssuccussMessage;
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement continueButton;
	@FindBy(xpath = "//a[@href='/delete_account'][contains(.,'Delete Account')]")
	private WebElement deleteButton;
	@FindBy(xpath = "//b[contains(.,'Account Deleted!')]")
	private WebElement accountDeletedMessage;
	@FindBy(xpath = "//p[contains(.,'Your account has been permanently deleted!')]")
	private WebElement congratulationaccountDeletedMessage;

	// Entering webSite Url
	public void enterURl(String url) {
		driver.get(url);

	}

	// Valiadting Page Title
	public void validateHomePage(String pageTitle) {
		wait.until(ExpectedConditions.visibilityOf(homePageLogo));
		if (homePageLogo.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		String actualTitle = driver.getTitle();
		if (pageTitle.equals(actualTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	// Clicking on SignUpbutton
	public void clickOnSignUpbutton() {
		wait.until(ExpectedConditions.visibilityOf(signupLoginLink));
		signupLoginLink.click();
	}

	// Verifying new user signUp
	public void verifyNewUserSignUp() {
		wait.until(ExpectedConditions.visibilityOf(newUserSignUp));
		Assert.assertEquals(true, newUserSignUp.isDisplayed());
	}

	// Entering username
	public void enterUsername(String name) {
		wait.until(ExpectedConditions.visibilityOf(nameTextField));
		nameTextField.sendKeys(name);
	}

	// Entering Emailid
	public void enterEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(emailTextField));
		emailTextField.sendKeys(email);
	}

	// Clicking on signUP Button
	public void clickOnSignupButton() {
		wait.until(ExpectedConditions.visibilityOf(signUpButton));
		signUpButton.click();
	}

	// Verifing enter account details text is visible
	public void verifyEnterAccountInformationisVisible(String TextMessage) {
		wait.until(ExpectedConditions.visibilityOf(ENTERACCOUNTINFORMATIONtext));
		Assert.assertEquals(true, ENTERACCOUNTINFORMATIONtext.isDisplayed());

	}

	// Selecting title radio button
	public void enterTitle(String buttonName) {
		WebElement titleRadioButton = driver.findElement(By.xpath("//input[@value='" + buttonName + "']"));
		titleRadioButton.click();

	}

	// Entering name
	public void enterName(String name) {
		wait.until(ExpectedConditions.visibilityOf(nameField));
		nameField.clear();
		nameField.sendKeys(name);
	}

	// Validating emailid
	public void verifyEmailId(String emailid) {
		wait.until(ExpectedConditions.visibilityOf(emailIdField));
		String enteredmailid = emailIdField.getText();
		System.out.println(enteredmailid);
		Assert.assertEquals(true, enteredmailid.equals(emailid));
	}

	// Entering password
	public void enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(passField));
		passField.clear();
		passField.sendKeys(password);
	}

	// Entering DoB
	public void enterDOB(String day, String month, String year) throws Exception {
		wait.until(ExpectedConditions.visibilityOf(daysDrop));
		Select d_Select = new Select(daysDrop);
		d_Select.selectByValue(day);
	    monthsDrop.click();
	    driver.findElement(By.xpath("//*[text()='"+month+"']")).click();
	    yearsDrop.click();
	    driver.findElement(By.xpath("//*[text()='"+year+"']")).click();
		

	}

	// Selecting NewsLetter Radio button
	public void clickOnSignUpforNewsLetter() {
		wait.until(ExpectedConditions.visibilityOf(newsLetterRadio));
		newsLetterRadio.click();
	}

	// Selecting recieve special offer from our parten radio button
	public void clickOnRecieveSpecialOfferFromourParteners() {
		wait.until(ExpectedConditions.visibilityOf(recieveSpecialOffer));
		recieveSpecialOffer.click();
	}

	// Entering FirstName
	public void enterFirstName(String firstname) {
		wait.until(ExpectedConditions.visibilityOf(firstNamaeField));
		firstNamaeField.sendKeys(firstname);
	}

	// Entering LastName
	public void enterLastName(String lastname) {
		wait.until(ExpectedConditions.visibilityOf(lastNameField));
		lastNameField.sendKeys(lastname);
	}

	// Entering CompanyName
	public void enterCompanyName(String companyname) {
		wait.until(ExpectedConditions.visibilityOf(CompanyNamaeField));
		CompanyNamaeField.sendKeys(companyname);
	}

	// Entering address1
	public void enterAddress(String address1) {
		wait.until(ExpectedConditions.visibilityOf(address1Field));
		address1Field.sendKeys(address1);
	}

	// Entering address2
	public void enterAddress2(String address2) {
		wait.until(ExpectedConditions.visibilityOf(address2Field));
		address2Field.sendKeys(address2);
	}

	// Selecting Country
	public void selectCountry(String country) {
		wait.until(ExpectedConditions.visibilityOf(countryDrop));
		Select country_Select = new Select(countryDrop);
		country_Select.selectByValue(country);
	}

	// Entering state
	public void enterState(String statename) {
		wait.until(ExpectedConditions.visibilityOf(stateField));
		stateField.sendKeys(statename);
	}

	// Entering City
	public void enterCity(String cityname) {
		wait.until(ExpectedConditions.visibilityOf(cityField));
		cityField.sendKeys(cityname);
	}

	// Entering Zipcode
	public void enterZipcode(String zipcode) {
		wait.until(ExpectedConditions.visibilityOf(zipCodeField));
		zipCodeField.sendKeys(zipcode);
	}

	// Entering mobile number
	public void enterMobileNumber(String number) {
		wait.until(ExpectedConditions.visibilityOf(mobileNumberField));
		mobileNumberField.sendKeys(number);
	}

	// Clicking on create account button
	public void clickOnCreateAccountButton() {
		wait.until(ExpectedConditions.visibilityOf(createAccountButton));
		createAccountButton.click();
	}

	// Validating account created message
	public void verifyAccountcreatedisVisible() {
		wait.until(ExpectedConditions.visibilityOf(accountCreatedsuccussMessage));
		String actualText1 = "ACCOUNT CREATED!";
		String expectedText1 = accountCreatedsuccussMessage.getText();
		String actualText2 = "Congratulations! Your new account has been successfully created!";
		String expectedText2 = congratulationssuccussMessage.getText();
		Assert.assertEquals(true, actualText1.equals(expectedText1));
		Assert.assertEquals(true, actualText2.equals(expectedText2));
	}

	// Clicking on Continue button
	public void clickOnContinueButton() {
		wait.until(ExpectedConditions.visibilityOf(continueButton));
		continueButton.click();
	}

	// Verifying logged username
	public void verifyLoggeginasUsername(String Username) {
		wait.until(ExpectedConditions.visibilityOf(homePageLogo));
		WebElement loggedUser = driver.findElement(By.xpath("//b[contains(.,'" + Username + "')]"));
		Assert.assertEquals(true, loggedUser.isDisplayed());

	}

	// clicking on delete account button
	public void clickOnDeletAccountButton() {
		wait.until(ExpectedConditions.visibilityOf(deleteButton));
		deleteButton.click();
	}

	// verifying accountDeleted succuss message
	public void verifyAccountDeletedisVisibleandClickContinue() {
		
		wait.until(ExpectedConditions.visibilityOf(accountDeletedMessage));
		String actualText1 = "ACCOUNT DELETED!";
		String expectedText1 = accountDeletedMessage.getText();
		String actualText2 = "Your account has been permanently deleted!";
		String expectedText2 = congratulationaccountDeletedMessage.getText();
		Assert.assertEquals(true, actualText1.equals(expectedText1));
		Assert.assertEquals(true, actualText2.equals(expectedText2));
		continueButton.click();

	}

}
