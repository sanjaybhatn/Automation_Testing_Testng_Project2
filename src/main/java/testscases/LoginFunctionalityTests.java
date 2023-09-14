package testscases;

import org.testng.annotations.Test;

import Pages.LoginFunctionalitytestsPage;
import factoryManager.*;

public class LoginFunctionalityTests extends BaseTest {

	@Test(testName = "Test Case 1: Register User")
	public void registerUser() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		loginFunction.clickOnSignUpbutton();
		loginFunction.verifyNewUserSignUp();
		loginFunction.enterUsername(test.getProperty("username"));
		loginFunction.enterEmail(test.getProperty("email"));
		loginFunction.clickOnSignupButton();
		loginFunction.verifyEnterAccountInformationisVisible("ENTER ACCOUNT INFORMATION");
		loginFunction.enterTitle("Mr");
		loginFunction.enterName(test.getProperty("username"));
		loginFunction.enterPassword(test.getProperty("password"));
		loginFunction.enterDOB("11","June","1997");
		loginFunction.clickOnSignUpforNewsLetter();
		loginFunction.clickOnRecieveSpecialOfferFromourParteners();
		loginFunction.enterFirstName(test.getProperty("firstname"));
		loginFunction.enterLastName(test.getProperty("lastname"));
		loginFunction.enterCompanyName(test.getProperty("companyname"));
		loginFunction.enterAddress(test.getProperty("address"));
		loginFunction.enterAddress2(test.getProperty("address2"));
		loginFunction.selectCountry(test.getProperty("country"));
		loginFunction.enterState(test.getProperty("state"));
		loginFunction.enterCity(test.getProperty("city"));
		loginFunction.enterZipcode(test.getProperty("zipcode"));
		loginFunction.enterMobileNumber(test.getProperty("number"));
		loginFunction.clickOnCreateAccountButton();
		loginFunction.verifyAccountcreatedisVisible();
		loginFunction.clickOnContinueButton();
		loginFunction.verifyLoggeginasUsername(test.getProperty("firstname"));
		loginFunction.clickOnDeletAccountButton();
		loginFunction.verifyAccountDeletedisVisibleandClickContinue();

	}
}
