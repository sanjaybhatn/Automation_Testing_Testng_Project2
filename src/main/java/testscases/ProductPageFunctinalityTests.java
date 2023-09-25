package testscases;

import org.testng.annotations.Test;

import Pages.LoginFunctionalitytestsPage;
import Pages.ProductPageFunctinalityPage;
import factoryManager.PageinstancesFactory;

public class ProductPageFunctinalityTests extends BaseTest {

	@Test(testName = "Test Case 8: Verify All Products and product detail page")
	public void productPageValidation() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.clickonProductButton();
		productPageFunction.verifyUserisInallProductpage();
		productPageFunction.verifyproductlistVisible();
		productPageFunction.clickonViewProductLink();
		productPageFunction.verifyUserinProductDetailsPage();
		productPageFunction.verifyallDetailsisVisble();

	}

    @Test(testName = "Test Case 9: Search Product")
	public void searchProduct() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.clickonProductButton();
		productPageFunction.verifyUserisInallProductpage();
		productPageFunction.verifyproductlistVisible();
		productPageFunction.searchProduct("Blue Top");
		productPageFunction.verifySearchedProductText();
		productPageFunction.verifySeachedproductVisible("Blue Top");

	}

   @Test(testName = "Test Case 10: Verify Subscription in home page")
	public void verifySubscriptioninHomePage() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.scrollDowntoFooter();
		productPageFunction.verifySubscriptionText();
		productPageFunction.entertheEmailandClickArrowButton("sanjay.bhatv@gmail.com");
		productPageFunction.verifySubscriptionSuccussMessage();

	}

	@Test(testName = "Test Case 11: Verify Subscription in Cart page")
	public void verifySubscriptionincartPage() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.clickOnCartButton();
		productPageFunction.scrollDowntoFooter();
		productPageFunction.verifySubscriptionText();
		productPageFunction.entertheEmailandClickArrowButton("sanjay.bhatv@gmail.com");
		productPageFunction.verifySubscriptionSuccussMessage();

	}

    @Test(testName = "Test Case 12: Add Products in Cart")
	public void addProductInCart() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.clickonProductButton();
		productPageFunction.hoverOverVisibleElementandClickaddToCart("First Product");
		productPageFunction.clickOnContinueShoppingLink();
		productPageFunction.hoverOverVisibleElementandClickaddToCart("Second Product");
		productPageFunction.clickOnViewCartButton();
		productPageFunction.verifyProductAreAddedtoCart("Blue Top");
		productPageFunction.verifyProductAreAddedtoCart("Men Tshirt");
		productPageFunction.VerifyTheCartDetails("Rs. 500", "1", "Rs. 500");
		productPageFunction.VerifyTheCartDetails("Rs. 400", "1", "Rs. 400");

	}

	@Test(testName = "Test Case 13: Verify Product quantity in Cart")
	public void verifyProductQuantityInCart() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.clickOnviewProductLink();
		productPageFunction.verifyProductDetails("Blue Top");
		productPageFunction.addQuantity("4");
		productPageFunction.clickonAddtoCart();
		productPageFunction.clickOnViewCartButton();
		productPageFunction.verifyProductAreAddedtoCart("Blue Top");
		productPageFunction.VerifyTheCartDetails("Rs. 500", "4", "Rs. 2000");

	}

	@Test(testName = "Test Case 14: Place Order: Register while Checkout")
	public void placeOrderRegisterWhileCheckout() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.hoverOverVisibleElementandClickaddToCart("First Product");
		productPageFunction.clickOnContinueShoppingLink();
		productPageFunction.hoverOverVisibleElementandClickaddToCart("Second Product");
		productPageFunction.clickOnContinueShoppingLink();
		productPageFunction.clickOnCartButton();
		productPageFunction.verifyProductAreAddedtoCart("Blue Top");
		productPageFunction.verifyProductAreAddedtoCart("Men Tshirt");
		productPageFunction.clickonProceedToCheckout();
		productPageFunction.clickOnRegisterLogin();
		loginFunction.verifyNewUserSignUp();
		loginFunction.enterUsername(test.getProperty("username"));
		loginFunction.enterEmail(test.getProperty("email"));
		loginFunction.clickOnSignupButton();
		loginFunction.verifyEnterAccountInformationisVisible("ENTER ACCOUNT INFORMATION");
		loginFunction.enterTitle("Mr");
		loginFunction.enterName(test.getProperty("username"));
		loginFunction.enterPassword(test.getProperty("password"));
		loginFunction.enterDOB("11", "June", "1997");
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
		productPageFunction.clickOnCartButton();
		productPageFunction.clickonProceedToCheckout();
		productPageFunction.verifyDeliveryAddress();
		productPageFunction.verifyProductDetails("Blue Top");
		productPageFunction.verifyProductDetails("Men Tshirt");
		productPageFunction.enterTheDescription("Ordering to test functionality");
		productPageFunction.enterPaymentDetails();
		productPageFunction.verifyorderSuccussMessage();
		loginFunction.clickOnDeletAccountButton();
		loginFunction.verifyAccountDeletedisVisibleandClickContinue();

	}

	@Test(testName = "Test Case 15: Place Order: Register before Checkout")
	public void placeOrderRegisterbeforeCheckout() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		loginFunction.clickOnSignUpbutton();
		loginFunction.verifyNewUserSignUp();
		loginFunction.enterUsername(test.getProperty("username"));
		loginFunction.enterEmail(test.getProperty("email"));
		loginFunction.clickOnSignupButton();
		loginFunction.verifyEnterAccountInformationisVisible("ENTER ACCOUNT INFORMATION");
		loginFunction.enterTitle("Mr");
		loginFunction.enterName(test.getProperty("username"));
		loginFunction.enterPassword(test.getProperty("password"));
		loginFunction.enterDOB("11", "June", "1997");
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
		loginFunction.clickOnlogoutButton();
		loginFunction.clickOnSignUpbutton();
		loginFunction.verifyNewUserSignUp();
		loginFunction.enterUsername(test.getProperty("username"));
		loginFunction.enterEmail(test.getProperty("email"));
		loginFunction.clickOnSignupButton();
		loginFunction.ValidateExistingmailErrorMessage();
		loginFunction.enterLoginEmail(test.getProperty("email"));
		loginFunction.enterLoginPass(test.getProperty("password"));
		loginFunction.clickOnlogin();
		loginFunction.verifyLoggeginasUsername(test.getProperty("firstname"));
		productPageFunction.hoverOverVisibleElementandClickaddToCart("First Product");
		productPageFunction.clickOnContinueShoppingLink();
		productPageFunction.hoverOverVisibleElementandClickaddToCart("Second Product");
		productPageFunction.clickOnContinueShoppingLink();
		productPageFunction.clickOnCartButton();
		productPageFunction.verifyProductAreAddedtoCart("Blue Top");
		productPageFunction.verifyProductAreAddedtoCart("Men Tshirt");
		productPageFunction.clickonProceedToCheckout();
		productPageFunction.verifyDeliveryAddress();
		productPageFunction.verifyProductDetails("Blue Top");
		productPageFunction.verifyProductDetails("Men Tshirt");
		productPageFunction.enterTheDescription("Ordering to test functionality");
		productPageFunction.enterPaymentDetails();
		productPageFunction.verifyorderSuccussMessage();
		loginFunction.clickOnDeletAccountButton();
		loginFunction.verifyAccountDeletedisVisibleandClickContinue();

	}

	@Test(testName = "Test Case 16: Place Order: Login before Checkout")
	public void placeOrderLoginBbeforeCheckout() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		loginFunction.clickOnSignUpbutton();
		loginFunction.verifyNewUserSignUp();
		loginFunction.enterUsername(test.getProperty("username"));
		loginFunction.enterEmail(test.getProperty("email"));
		loginFunction.clickOnSignupButton();
		loginFunction.verifyEnterAccountInformationisVisible("ENTER ACCOUNT INFORMATION");
		loginFunction.enterTitle("Mr");
		loginFunction.enterName(test.getProperty("username"));
		loginFunction.enterPassword(test.getProperty("password"));
		loginFunction.enterDOB("11", "June", "1997");
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
		loginFunction.clickOnlogoutButton();
		loginFunction.clickOnSignUpbutton();
		loginFunction.verifyNewUserSignUp();
		loginFunction.enterUsername(test.getProperty("username"));
		loginFunction.enterEmail(test.getProperty("email"));
		loginFunction.clickOnSignupButton();
		loginFunction.ValidateExistingmailErrorMessage();
		loginFunction.enterLoginEmail(test.getProperty("email"));
		loginFunction.enterLoginPass(test.getProperty("password"));
		loginFunction.clickOnlogin();
		loginFunction.verifyLoggeginasUsername(test.getProperty("firstname"));
		productPageFunction.hoverOverVisibleElementandClickaddToCart("First Product");
		productPageFunction.clickOnContinueShoppingLink();
		productPageFunction.hoverOverVisibleElementandClickaddToCart("Second Product");
		productPageFunction.clickOnContinueShoppingLink();
		productPageFunction.clickOnCartButton();
		productPageFunction.verifyProductAreAddedtoCart("Blue Top");
		productPageFunction.verifyProductAreAddedtoCart("Men Tshirt");
		productPageFunction.clickonProceedToCheckout();
		productPageFunction.verifyDeliveryAddress();
		productPageFunction.verifyProductDetails("Blue Top");
		productPageFunction.verifyProductDetails("Men Tshirt");
		productPageFunction.enterTheDescription("Ordering to test functionality");
		productPageFunction.enterPaymentDetails();
		productPageFunction.verifyorderSuccussMessage();
		loginFunction.clickOnDeletAccountButton();
		loginFunction.verifyAccountDeletedisVisibleandClickContinue();

	}

	@Test(testName = "Test Case 17: Remove Products From Cart")
	public void removeProductsFromCart() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.hoverOverVisibleElementandClickaddToCart("First Product");
		productPageFunction.clickOnContinueShoppingLink();
		productPageFunction.clickOnCartButton();
		productPageFunction.verifyProductAreAddedtoCart("Blue Top");
		productPageFunction.verifyCartPageDisplayed();
		productPageFunction.clickOnXbuttonandRemoved();
		productPageFunction.verifyProductRemovedFromCartPage();

	}

    @Test(testName = "Test Case 18: View Category Products")
	public void viewCategoryProducts() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.verifyCategory("Women");
		productPageFunction.clickOnSubCategory("Women", "Dress");
		productPageFunction.verifyCategory("Women");
		productPageFunction.clickOnSubCategory("Women", "Top");
		productPageFunction.verifytheTextinCatogoryPage("WOMEN - TOPS PRODUCTS");
		productPageFunction.verifyCategory("Men");
		productPageFunction.clickOnSubCategory("Men", "Tshirts");
		productPageFunction.verifytheTextinCatogoryPage("MEN - TSHIRTS PRODUCTS");

	}

	@Test(testName = "Test Case 19: View & Cart Brand Products")
	public void viewandcartProductsValidation() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.clickonProductButton();
		productPageFunction.verifyUserisInallProductpage();
		productPageFunction.verifyBrandsAreVisible();
		productPageFunction.clickOnbrandName("Polo");
		productPageFunction.verifyUserisNavigatedtoBrandPage("Brand - Polo Products");
		productPageFunction.clickOnbrandName("Madame");
		productPageFunction.verifyUserisNavigatedtoBrandPage("Brand - Madame Products");

	}

	@Test(testName = "Test Case 20: Search Products and Verify Cart After Login")
	public void searchProductsandVerifyCartAfterLogin() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.clickonProductButton();
		productPageFunction.verifyUserisInallProductpage();
		productPageFunction.searchProduct("Blue Top");
		productPageFunction.verifySearchedProductText();
		productPageFunction.hoverOverVisibleElementandClickaddToCart("First Product");
		productPageFunction.clickOnViewCartButton();
		productPageFunction.verifyProductAreAddedtoCart("Blue Top");
		productPageFunction.VerifyTheCartDetails("Rs. 500", "1", "Rs. 500");
		productPageFunction.clickonProceedToCheckout();
		productPageFunction.clickOnRegisterLogin();
		loginFunction.verifyNewUserSignUp();
		loginFunction.enterUsername(test.getProperty("username"));
		loginFunction.enterEmail(test.getProperty("email"));
		loginFunction.clickOnSignupButton();
		loginFunction.verifyEnterAccountInformationisVisible("ENTER ACCOUNT INFORMATION");
		loginFunction.enterTitle("Mr");
		loginFunction.enterName(test.getProperty("username"));
		loginFunction.enterPassword(test.getProperty("password"));
		loginFunction.enterDOB("11", "June", "1997");
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
		productPageFunction.clickOnCartButton();
		productPageFunction.VerifyTheCartDetails("Rs. 500", "1", "Rs. 500");
		loginFunction.clickOnDeletAccountButton();
		loginFunction.verifyAccountDeletedisVisibleandClickContinue();

	}

	@Test(testName = "Test Case 21: Add review on product")
	public void addReviewOnProduct() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.clickonProductButton();
		productPageFunction.verifyUserisInallProductpage();
		productPageFunction.clickOnviewProductLink();
		productPageFunction.ValidateWriteYourReviewText();
		productPageFunction.enterNameinReviewPage(test.getProperty("username"));
		productPageFunction.enterEmailinReviewPage(test.getProperty("email"));
		productPageFunction.enterReviewinReviewPage("I am writing review to test this functionality");
		productPageFunction.clickOnSubmitButtonReviewPage();
		productPageFunction.validateReviewSuccussMessage();

	}

	@Test(testName = "Test Case 22: Add to cart from Recommended items")
	public void addToCartFromRecommendedItems() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.scrollDowntoFooter();
		productPageFunction.addRecommendedItem();
		productPageFunction.clickOnViewCartButton();
		productPageFunction.verifyProductAreAddedtoCart("Stylish Dress");

	}

	@Test(testName = "Test Case 23: Verify address details in checkout page")
	public void verifyAddressDetailsInCheckoutPage() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		loginFunction.clickOnSignUpbutton();
		loginFunction.verifyNewUserSignUp();
		loginFunction.enterUsername(test.getProperty("username"));
		loginFunction.enterEmail(test.getProperty("email"));
		loginFunction.clickOnSignupButton();
		loginFunction.verifyEnterAccountInformationisVisible("ENTER ACCOUNT INFORMATION");
		loginFunction.enterTitle("Mr");
		loginFunction.enterName(test.getProperty("username"));
		loginFunction.enterPassword(test.getProperty("password"));
		loginFunction.enterDOB("11", "June", "1997");
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
		productPageFunction.hoverOverVisibleElementandClickaddToCart("First Product");
		productPageFunction.clickOnContinueShoppingLink();
		productPageFunction.clickOnCartButton();
		productPageFunction.verifyProductAreAddedtoCart("Blue Top");
		productPageFunction.clickonProceedToCheckout();
		productPageFunction.verifyDeliveryAddress();
		productPageFunction.ValidateDeliveryAddress(test.getProperty("companyname"), test.getProperty("address"),
				test.getProperty("address2"), test.getProperty("addres3"), test.getProperty("country"),
				test.getProperty("number"));
		productPageFunction.ValidateBillingAddress(test.getProperty("companyname"), test.getProperty("address"),
				test.getProperty("address2"), test.getProperty("addres3"), test.getProperty("country"),
				test.getProperty("number"));
		loginFunction.clickOnDeletAccountButton();
		loginFunction.verifyAccountDeletedisVisibleandClickContinue();

	}

    @Test(testName = "Test Case 24: Download Invoice after purchase order")
	public void downloadInvoiceAfterPurchaseOrder() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		loginFunction.clickOnSignUpbutton();
		loginFunction.verifyNewUserSignUp();
		loginFunction.enterUsername(test.getProperty("username"));
		loginFunction.enterEmail(test.getProperty("email"));
		loginFunction.clickOnSignupButton();
		loginFunction.verifyEnterAccountInformationisVisible("ENTER ACCOUNT INFORMATION");
		loginFunction.enterTitle("Mr");
		loginFunction.enterName(test.getProperty("username"));
		loginFunction.enterPassword(test.getProperty("password"));
		loginFunction.enterDOB("11", "June", "1997");
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
		loginFunction.clickOnlogoutButton();
		loginFunction.clickOnSignUpbutton();
		loginFunction.verifyNewUserSignUp();
		loginFunction.enterUsername(test.getProperty("username"));
		loginFunction.enterEmail(test.getProperty("email"));
		loginFunction.clickOnSignupButton();
		loginFunction.ValidateExistingmailErrorMessage();
		loginFunction.enterLoginEmail(test.getProperty("email"));
		loginFunction.enterLoginPass(test.getProperty("password"));
		loginFunction.clickOnlogin();
		loginFunction.verifyLoggeginasUsername(test.getProperty("firstname"));
		productPageFunction.hoverOverVisibleElementandClickaddToCart("First Product");
		productPageFunction.clickOnContinueShoppingLink();
		productPageFunction.clickOnCartButton();
		productPageFunction.verifyProductAreAddedtoCart("Blue Top");
		productPageFunction.clickonProceedToCheckout();
		productPageFunction.verifyDeliveryAddress();
		productPageFunction.verifyProductDetails("Blue Top");
		productPageFunction.enterTheDescription("Ordering to test functionality");
		productPageFunction.enterPaymentDetails();
		productPageFunction.verifyorderSuccussMessage();
		productPageFunction.validateDownloadInvoiceFunctionality();
		loginFunction.clickOnDeletAccountButton();
		loginFunction.verifyAccountDeletedisVisibleandClickContinue();

	}

     @Test(testName = "Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality")
	public void verifyScrollUpUsingArrowButtonandScrollDownFunctionality() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
				.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.scrollDowntoFooter();
		productPageFunction.verifySubscriptionText();
		productPageFunction.clickOnArrowButton();
		productPageFunction.verifyHomePageText();

	}
	
	 @Test(testName = "Test Case 26: Verify Scroll Up without 'Arrow' button and Scroll Down functionality")
		public void verifyScrollUpWithoutArrowButtonandScrollDownFunctionality() throws Exception {
			LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
			loginFunction.enterURl(test.getProperty("url"));
			loginFunction.validateHomePage("Automation Exercise");
			ProductPageFunctinalityPage productPageFunction = PageinstancesFactory
					.getInstance(ProductPageFunctinalityPage.class);
			productPageFunction.scrollDowntoFooter();
			productPageFunction.verifySubscriptionText();
			productPageFunction.scrollUpthePage();
			productPageFunction.verifyHomePageText();

		}

}