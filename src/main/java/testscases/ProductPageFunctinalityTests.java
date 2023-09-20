package testscases;

import org.testng.annotations.Test;

import Pages.LoginFunctionalitytestsPage;
import Pages.ProductPageFunctinalityPage;
import factoryManager.PageinstancesFactory;

public class ProductPageFunctinalityTests extends BaseTest {

//	@Test(testName = "Test Case 8: Verify All Products and product detail page")
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

//	@Test(testName = "Test Case 9: Search Product")
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

//	@Test(testName = "Test Case 10: Verify Subscription in home page")
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

//	@Test(testName = "Test Case 11: Verify Subscription in Cart page")
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

//@Test(testName = "Test Case 12: Add Products in Cart")
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
//	@Test(testName = "Test Case 13: Verify Product quantity in Cart")
	public void verifyProductQuantityInCart() throws Exception {
		LoginFunctionalitytestsPage loginFunction = PageinstancesFactory.getInstance(LoginFunctionalitytestsPage.class);
		loginFunction.enterURl(test.getProperty("url"));
		loginFunction.validateHomePage("Automation Exercise");
		ProductPageFunctinalityPage productPageFunction = PageinstancesFactory.getInstance(ProductPageFunctinalityPage.class);
		productPageFunction.clickOnviewProductLink();
		productPageFunction.verifyProductDetails("Blue Top");
		productPageFunction.addQuantity("4");
		productPageFunction.clickonAddtoCart();
		productPageFunction.clickOnViewCartButton();
		productPageFunction.verifyProductAreAddedtoCart("Blue Top");
		productPageFunction.VerifyTheCartDetails("Rs. 500","4","Rs. 2000");
		
	
		
		
		
}
}