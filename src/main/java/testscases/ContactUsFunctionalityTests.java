package testscases;

import org.testng.annotations.Test;

import Pages.ContactUsFunctionalityPage;
import Pages.LoginFunctionalitytestsPage;
import factoryManager.PageinstancesFactory;

public class ContactUsFunctionalityTests extends BaseTest {

	@Test(testName = "Test Case 6: Contact Us Form")
	public void contactusfromValidation() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ContactUsFunctionalityPage contactusFunction = PageinstancesFactory
				.getInstance(ContactUsFunctionalityPage.class);
		contactusFunction.clickOnContactUs();
		contactusFunction.VerifyGetinTouchTextinthePage();
		contactusFunction.enterName(test.getProperty("username"));
		contactusFunction.enterEmail(test.getProperty("email"));
		contactusFunction.enterSubject("Testing Subject Field");
		contactusFunction.enterMessage("Testing Message Field");
		contactusFunction.clickandChooseFile();
		contactusFunction.clickOnsubmit();
		contactusFunction.clickOnalertOkbutton();
		contactusFunction.verifyingSuccussMessage();
		contactusFunction.verifyUserInHomePage();
		loginFunction.validateHomePage("Automation Exercise");
		

	}
	
	@Test(testName = "Test Case 7: Verify Test Cases Page")
	public void testcasesPageValidation() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ContactUsFunctionalityPage contactusFunction = PageinstancesFactory
				.getInstance(ContactUsFunctionalityPage.class);
		contactusFunction.clickonTestCasesButton();
		contactusFunction.validateUserisinTestcasesPage();

		
		

	}
}
