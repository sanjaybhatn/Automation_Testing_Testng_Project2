package Pages;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductPageFunctinalityPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, 50);

	public ProductPageFunctinalityPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@href='/products']")
	private WebElement productPageLink;
	@FindBy(xpath = "//h2[@class='title text-center'][contains(.,'All Products')]")
	private WebElement allProductText;
	@FindBy(xpath = "//div[contains(@id,'accordian')]")
	private WebElement productListMenu;
	@FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
	private WebElement viewProductLink;
	@FindBy(xpath = "//div[@class='view-product']//img[@alt='ecommerce website products']")
	private WebElement productDetailsPage;
	@FindBy(xpath = "//h2[normalize-space()='Blue Top']")
	private WebElement productNameLocator;
	@FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
	private WebElement catogoryNameLocator;
	@FindBy(xpath = "//span[normalize-space()='Rs. 500']")
	private WebElement priceNameLocator;
	@FindBy(xpath = "//p[contains(.,'Availability: In Stock')]")
	private WebElement availabilityLocator;
	@FindBy(xpath = "//p[contains(.,'Condition: New')]")
	private WebElement conditionLocator;
	@FindBy(xpath = "//p[contains(.,'Brand: Polo')]")
	private WebElement brandLocator;
	@FindBy(xpath = "//h2[@class='title text-center'][contains(.,'Searched Products')]")
	private WebElement searchedProductText;
	@FindBy(xpath = "//input[@id='search_product']")
	private WebElement searchField;
	@FindBy(xpath = "//button[@id='submit_search']")
	private WebElement submitSearchButton;
	@FindBy(xpath = "//h2[normalize-space()='Subscription']")
	private WebElement subscriptionTitleTextLocater;
	@FindBy(xpath = "//input[@id='susbscribe_email']")
	private WebElement subEmailTextField;
	@FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
	private WebElement arrowButton;
	@FindBy(xpath = "//div[@class='alert-success alert']")
	private WebElement subSuccussMessage;
	@FindBy(xpath = "//a[normalize-space()='Cart']")
	private WebElement cartoptionLocator;
	@FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
	private WebElement continueShoppingButton;
	@FindBy(xpath = "//u[normalize-space()='View Cart']")
	private WebElement viewCartLink;
	@FindBy(xpath = "//a[@class='btn btn-default check_out']")
	private WebElement proceedToCheckOut;
	@FindBy(xpath = "(//a[contains(.,'View Product')])[1]")
	private WebElement viewProduct;
	@FindBy(xpath = "//input[@id='quantity']")
	private WebElement quantityField;
	@FindBy(xpath = "//button[@type='button'][contains(.,'Add to cart')]")
	private WebElement addToCart;
	@FindBy(xpath = "//u[normalize-space()='Register / Login']")
	private WebElement registerLogin;
	@FindBy(xpath = "//ul[contains(@id,'address_delivery')]")
	private WebElement yourDeliveryAddressM;
	@FindBy(xpath = "//ul[contains(@id,'address_invoice')]")
	private WebElement yourBillingAddressM;
	@FindBy(xpath = "//textarea[contains(@class,'form-control')]")
	private WebElement messageTextBox;
	@FindBy(xpath = "//a[@href='/payment'][contains(.,'Place Order')]")
	private WebElement placeOrder;
	@FindBy(xpath = "//input[contains(@name,'name_on_card')]")
	private WebElement nameOnCard;
	@FindBy(xpath = "//input[contains(@name,'card_number')]")
	private WebElement cardNumber;
	@FindBy(xpath = "//input[contains(@name,'cvc')]")
	private WebElement cvcTextField;
	@FindBy(xpath = "//input[contains(@class,'form-control card-expiry-month')]")
	private WebElement expiryDateField;
	@FindBy(xpath = "//input[contains(@name,'expiry_year')]")
	private WebElement expiryYearField;
	@FindBy(xpath = "//button[contains(@id,'submit')]")
	private WebElement payAndConfirmOrder;
	@FindBy(xpath = "//p[contains(.,'Congratulations! Your order has been confirmed!')]")
	private WebElement congratulationsPaymentMessage;
	@FindBy(xpath = "//li[@class='active'][contains(.,'Shopping Cart')]")
	private WebElement shoppingCart;
	@FindBy(xpath = "//a[contains(@class,'cart_quantity_delete')]")
	private WebElement xButton;
	@FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
	private WebElement cartIsEmpty;
	@FindBy(xpath = "//h2[contains(@class,'title text-center')]")
	private WebElement categoryHeader;
	@FindBy(xpath = "//h2[contains(.,'Brands')]")
	private WebElement brandsLocator;
	@FindBy(xpath = "//a[@href='#reviews'][contains(.,'Write Your Review')]")
	private WebElement writeYourReviewLocator;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement nameFieldReview;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailFieldReview;
	@FindBy(xpath = "//textarea[@id='review']")
	private WebElement reviewMessageTextField;
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement reviewSumbitButton;
	@FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
	private WebElement reviewSuccussMessage;
	@FindBy(xpath = "(//a[@data-product-id='4'][contains(.,'Add to cart')])[3]")
	private WebElement addTocartRecommendedItemButton;
	@FindBy(xpath = "(//ul[@id='address_delivery']//li[3]")
	private WebElement companyNameinDeliveryAddress;
	@FindBy(xpath = "(//ul[@id='address_delivery']//li[4]")
	private WebElement Address1inDeliveryAddress;
	@FindBy(xpath = "(//ul[@id='address_delivery']//li[5]")
	private WebElement Address2inDeliveryAddress;
	@FindBy(xpath = "(//ul[@id='address_delivery']//li[6]")
	private WebElement Address31inDeliveryAddress;
	@FindBy(xpath = "(//ul[@id='address_delivery']//li[7]")
	private WebElement countryinDeliveryAddress;
	@FindBy(xpath = "(//ul[@id='address_delivery']//li[8]")
	private WebElement numberinDeliveryAddress;
	@FindBy(xpath = "(//ul[@id='address_invoice']//li[3]")
	private WebElement companyNameinBillingAddress;
	@FindBy(xpath = "(//ul[@id='address_invoice']//li[4]")
	private WebElement Address1inBillingAddress;
	@FindBy(xpath = "(//ul[@id='address_invoice']//li[5]")
	private WebElement Address2inBillingAddress;
	@FindBy(xpath = "(//ul[@id='address_invoice']//li[6]")
	private WebElement Address31inBillingAddress;
	@FindBy(xpath = "(//ul[@id='address_invoice']//li[7]")
	private WebElement countryinBillingAddress;
	@FindBy(xpath = "(//ul[@id='address_invoice']//li[8]")
	private WebElement numberinBillingAddress;
	@FindBy(xpath = "//a[contains(text(),'Download Invoice')]")
	private WebElement downloadInvoiceButton;
	@FindBy(xpath = "//i[@class='fa fa-angle-up']")
	private WebElement arrowButtonLocator;
	@FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
	private WebElement homePageTextLocators;

	// Clicking on Product Page
	public void clickonProductButton() {
		wait.until(ExpectedConditions.visibilityOf(productPageLink));
		productPageLink.click();

	}

	// Validating user is in product Page
	public void verifyUserisInallProductpage() {
		wait.until(ExpectedConditions.visibilityOf(allProductText));
		String expectedText = "ALL PRODUCTS";
		String actualText = allProductText.getText();
		Assert.assertEquals(true, expectedText.equals(actualText));

	}

	// Validating Product list
	public void verifyproductlistVisible() {
		wait.until(ExpectedConditions.visibilityOf(productListMenu));
		Assert.assertEquals(true, productListMenu.isDisplayed());

	}

	// Clicking on view Product link
	public void clickonViewProductLink() {
		wait.until(ExpectedConditions.visibilityOf(viewProductLink));
		viewProductLink.click();

	}

	// Verify user is in product details page
	public void verifyUserinProductDetailsPage() {
		wait.until(ExpectedConditions.visibilityOf(productDetailsPage));
		Assert.assertEquals(true, productDetailsPage.isDisplayed());

	}

	// Verifying Brand locator
	public void verifyallDetailsisVisble() {
		wait.until(ExpectedConditions.visibilityOf(priceNameLocator));
		Assert.assertEquals(true, priceNameLocator.isDisplayed());
		Assert.assertEquals(true, catogoryNameLocator.isDisplayed());
		Assert.assertEquals(true, priceNameLocator.isDisplayed());
		Assert.assertEquals(true, availabilityLocator.isDisplayed());
		Assert.assertEquals(true, conditionLocator.isDisplayed());
		Assert.assertEquals(true, brandLocator.isDisplayed());
	}

	// Varifying Search Field
	public void searchProduct(String productName) {
		wait.until(ExpectedConditions.visibilityOf(searchField));
		searchField.sendKeys(productName);
		submitSearchButton.click();

	}

	// Validate searched product Text
	public void verifySearchedProductText() {
		wait.until(ExpectedConditions.visibilityOf(searchedProductText));
		String expectedText = "SEARCHED PRODUCTS";
		String actualText = searchedProductText.getText();
		Assert.assertEquals(true, expectedText.equals(actualText));

	}

	// Verify Searched Product is visible
	public void verifySeachedproductVisible(String productName) {
		WebElement productname = driver
				.findElement(By.xpath("//div[@class='overlay-content']//p[contains(text(),'" + productName + "')]"));
		WebElement productMenu = driver.findElement(By.xpath("//div[@class='product-image-wrapper']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(productMenu);
		Assert.assertEquals(true, productname.isDisplayed());

	}

	// Scrolling down to footer
	public void scrollDowntoFooter() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	// Verifying Subscription Text
	public void verifySubscriptionText() {
		wait.until(ExpectedConditions.visibilityOf(subscriptionTitleTextLocater));
		String expectedText = "SUBSCRIPTION";
		String actualText = subscriptionTitleTextLocater.getText();
		Assert.assertEquals(true, expectedText.equals(actualText));

	}

	// Entering Email id and clicking arrow button
	public void entertheEmailandClickArrowButton(String email) {
		wait.until(ExpectedConditions.visibilityOf(subEmailTextField));
		subEmailTextField.sendKeys(email);
		arrowButton.click();
	}

	// Verifying subscription Succuss message
	public void verifySubscriptionSuccussMessage() {
		wait.until(ExpectedConditions.visibilityOf(subSuccussMessage));
		String expectedText = "You have been successfully subscribed!";
		String actualText = subSuccussMessage.getText();
		Assert.assertEquals(true, expectedText.equals(actualText));

	}

	// Clicking on Cart button
	public void clickOnCartButton() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(cartoptionLocator));
		cartoptionLocator.click();
		Thread.sleep(3000);

	}

	// Hover over visible element
	public void hoverOverVisibleElementandClickaddToCart(String element) throws Exception {
		if (element.equals("First Product")) {
			WebElement mainCartButton1 = driver.findElement(By.xpath("(//a[contains(.,'Add to cart')])[1]"));

			WebElement mainCartButton2 = driver.findElement(By.xpath("(//a[contains(.,'Add to cart')])[2]"));
			Actions builder = new Actions(driver);
			builder.moveToElement(mainCartButton1).build().perform();
			builder.click();
			Thread.sleep(4000);
			mainCartButton2.click();

		} else if (element.equals("Second Product")) {
			WebElement mainCartButton1 = driver.findElement(By.xpath("(//a[contains(.,'Add to cart')])[3]"));

			WebElement mainCartButton2 = driver.findElement(By.xpath("(//a[contains(.,'Add to cart')])[4]"));
			Actions builder = new Actions(driver);
			builder.moveToElement(mainCartButton1).build().perform();
			builder.click();
			Thread.sleep(4000);
			mainCartButton2.click();
		}

	}

	// Click on Continue Shopping Link
	public void clickOnContinueShoppingLink() {
		wait.until(ExpectedConditions.visibilityOf(continueShoppingButton));
		continueShoppingButton.click();

	}

	// Clicking on View cart Button
	public void clickOnViewCartButton() {
		wait.until(ExpectedConditions.visibilityOf(viewCartLink));
		viewCartLink.click();

	}

	// Verifying product Added to Cart
	public void verifyProductAreAddedtoCart(String productName) {
		wait.until(ExpectedConditions.visibilityOf(proceedToCheckOut));
		WebElement product_name = driver.findElement(By.xpath("//a[normalize-space()='" + productName + "']"));
		Assert.assertEquals(true, product_name.isDisplayed());

	}

	// Verifying cart details
	public void VerifyTheCartDetails(String price, String quantity, String totalprice) {
		WebElement priceDetails = driver
				.findElement(By.xpath("//td[@class='cart_price']//p[contains(text(),'" + price + "')]"));
		WebElement quantityDetails = driver.findElement(
				By.xpath("//tr[@id='product-1']//button[@class='disabled'][normalize-space()='" + quantity + "']"));
		WebElement totalpriceDetails = driver
				.findElement(By.xpath("//p[@class='cart_total_price'][normalize-space()='" + totalprice + "']"));
		Assert.assertEquals(true, priceDetails.isDisplayed());
		Assert.assertEquals(true, quantityDetails.isDisplayed());
		Assert.assertEquals(true, totalpriceDetails.isDisplayed());

	}

	// clicking on view cart link
	public void clickOnviewProductLink() {
		wait.until(ExpectedConditions.visibilityOf(viewProduct));
		viewProduct.click();

	}

	// adding quantity number
	public void addQuantity(String quantity) {
		wait.until(ExpectedConditions.visibilityOf(quantityField));
		quantityField.clear();
		quantityField.sendKeys(quantity);

	}

	// clicking on add to cart button
	public void clickonAddtoCart() {
		wait.until(ExpectedConditions.visibilityOf(addToCart));
		addToCart.click();

	}

	// Verifying Product Details
	public void verifyProductDetails(String productName) {
		WebElement product_name = driver.findElement(By.xpath("//*[normalize-space()='" + productName + "']"));
		Assert.assertEquals(true, product_name.isDisplayed());

	}

	// Clicking on Proceed to check out
	public void clickonProceedToCheckout() {
		wait.until(ExpectedConditions.visibilityOf(proceedToCheckOut));
		proceedToCheckOut.click();

	}

	// Click on Register/Login
	public void clickOnRegisterLogin() {
		wait.until(ExpectedConditions.visibilityOf(registerLogin));
		registerLogin.click();

	}

	// Verifying Delivery address
	public void verifyDeliveryAddress() {
		wait.until(ExpectedConditions.visibilityOf(yourDeliveryAddressM));
		System.out.println(yourDeliveryAddressM.getText());
		System.out.println(yourBillingAddressM.getText());
		Assert.assertEquals(true, yourDeliveryAddressM.isDisplayed());
		Assert.assertEquals(true, yourBillingAddressM.isDisplayed());

	}

	// Entering description
	public void enterTheDescription(String message) {
		wait.until(ExpectedConditions.visibilityOf(messageTextBox));
		messageTextBox.sendKeys(message);
		placeOrder.click();

	}

	// Entering Payment Details
	public void enterPaymentDetails() {
		wait.until(ExpectedConditions.visibilityOf(nameOnCard));
		nameOnCard.sendKeys("Sanjay Bhat");
		cardNumber.sendKeys("5678765434430098");
		cvcTextField.sendKeys("657");
		expiryDateField.sendKeys("07");
		expiryYearField.sendKeys("2034");
		payAndConfirmOrder.click();

	}

	// Validating Payment Succuss message
	public void verifyorderSuccussMessage() {
		wait.until(ExpectedConditions.visibilityOf(congratulationsPaymentMessage));
		String expectedText = "Congratulations! Your order has been confirmed!";
		String actualText = congratulationsPaymentMessage.getText();
		Assert.assertEquals(true, expectedText.equals(actualText));

	}

	// Verifying cart page loaded succussfully
	public void verifyCartPageDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(shoppingCart));
		Assert.assertEquals(true, shoppingCart.isDisplayed());

	}

	// Clicking on X button Cart Page
	public void clickOnXbuttonandRemoved() {
		wait.until(ExpectedConditions.visibilityOf(xButton));
		xButton.click();

	}

	// Validating product removed from cart page
	public void verifyProductRemovedFromCartPage() {
		wait.until(ExpectedConditions.visibilityOf(cartIsEmpty));
		Assert.assertEquals(true, cartIsEmpty.isDisplayed());

	}

	// Validating Catogory
	public void verifyCategory(String category) throws Exception {
		WebElement categoryType = driver.findElement(By.xpath("//a[normalize-space()='" + category + "']"));
		wait.until(ExpectedConditions.visibilityOf(categoryType));
		Assert.assertEquals(true, categoryType.isDisplayed());
		categoryType.click();

	}

	// Validating Sub Catogory
	public void clickOnSubCategory(String category, String subCategory) throws Exception {
		WebElement subCatType = driver
				.findElement(By.xpath("//div[@id='" + category + "']//a[contains(text(),'" + subCategory + "')]"));
		wait.until(ExpectedConditions.visibilityOf(subCatType));
		Assert.assertEquals(true, subCatType.isDisplayed());
		subCatType.click();

	}

	// Verifying page Title
	public void verifytheTextinCatogoryPage(String expectedText) throws Exception {
		wait.until(ExpectedConditions.visibilityOf(categoryHeader));
		String actualText = categoryHeader.getText();
		Assert.assertEquals(true, expectedText.equals(actualText));

	}

	// Verify brands are visible
	public void verifyBrandsAreVisible() {
		wait.until(ExpectedConditions.visibilityOf(brandsLocator));
		String expectedText = "BRANDS";
		String actualText = brandsLocator.getText();
		Assert.assertEquals(true, expectedText.equals(actualText));

	}

	// Clicking on Brand Name
	public void clickOnbrandName(String brandName) {
		WebElement brandname = driver.findElement(By.xpath("//a[@href='/brand_products/" + brandName + "']"));
		Assert.assertEquals(true, brandname.isDisplayed());
		brandname.click();

	}

	// Validated user is in brand page
	public void verifyUserisNavigatedtoBrandPage(String brandType) {
		WebElement brandTextname = driver
				.findElement(By.xpath("//h2[@class='title text-center'][contains(.,'" + brandType + "')]"));
		Assert.assertEquals(true, brandTextname.isDisplayed());

	}

	// Validate the text in review page
	public void ValidateWriteYourReviewText() {
		wait.until(ExpectedConditions.visibilityOf(writeYourReviewLocator));
		String expectedText = "WRITE YOUR REVIEW";
		String actualText = writeYourReviewLocator.getText();
		Assert.assertEquals(true, expectedText.equals(actualText));

	}

	// Enter the name in review page
	public void enterNameinReviewPage(String name) {
		wait.until(ExpectedConditions.visibilityOf(nameFieldReview));
		nameFieldReview.sendKeys(name);

	}

	// Enter the email in review page
	public void enterEmailinReviewPage(String email) {
		wait.until(ExpectedConditions.visibilityOf(emailFieldReview));
		emailFieldReview.sendKeys(email);
	}

	// Enter the review comments in review page
	public void enterReviewinReviewPage(String comments) {
		wait.until(ExpectedConditions.visibilityOf(reviewMessageTextField));
		reviewMessageTextField.sendKeys(comments);

	}

	// Click on Sumbit button review Page
	public void clickOnSubmitButtonReviewPage() {
		wait.until(ExpectedConditions.visibilityOf(reviewSumbitButton));
		reviewSumbitButton.click();

	}

	// Validater review Succuss page
	public void validateReviewSuccussMessage() {
		wait.until(ExpectedConditions.visibilityOf(reviewSuccussMessage));
		String expectedText = "Thank you for your review.";
		String actualText = reviewSuccussMessage.getText();
		System.out.println(actualText);
		Assert.assertEquals(true, expectedText.equals(actualText));
	}

	// Adding Recommended product
	public void addRecommendedItem() {
		wait.until(ExpectedConditions.visibilityOf(addTocartRecommendedItemButton));
		addTocartRecommendedItemButton.click();

	}

	// Validating delivery Address
	public void ValidateDeliveryAddress(String companyName, String address, String address1, String address2,
			String country, String phonenumber) {
		wait.until(ExpectedConditions.visibilityOf(yourDeliveryAddressM));
		String expectedText1 = companyNameinDeliveryAddress.getText();
		Assert.assertEquals(true, expectedText1.equals(companyName));
		String expectedText2 = Address1inDeliveryAddress.getText();
		Assert.assertEquals(true, expectedText2.equals(address));
		String expectedText3 = Address2inDeliveryAddress.getText();
		Assert.assertEquals(true, expectedText3.equals(address1));
		String expectedText4 = Address31inDeliveryAddress.getText();
		Assert.assertEquals(true, expectedText4.equals(address2));
		String expectedText5 = countryinDeliveryAddress.getText();
		Assert.assertEquals(true, expectedText5.equals(country));
		String expectedText6 = numberinDeliveryAddress.getText();
		Assert.assertEquals(true, expectedText6.equals(phonenumber));

	}

	// Validating Billing Address
	public void ValidateBillingAddress(String companyName, String address, String address1, String address2,
			String country, String phonenumber) {
		wait.until(ExpectedConditions.visibilityOf(yourBillingAddressM));
		String expectedText1 = companyNameinBillingAddress.getText();
		Assert.assertEquals(true, expectedText1.equals(companyName));
		String expectedText2 = Address1inBillingAddress.getText();
		Assert.assertEquals(true, expectedText2.equals(address));
		String expectedText3 = Address2inBillingAddress.getText();
		Assert.assertEquals(true, expectedText3.equals(address1));
		String expectedText4 = Address31inBillingAddress.getText();
		Assert.assertEquals(true, expectedText4.equals(address2));
		String expectedText5 = countryinBillingAddress.getText();
		Assert.assertEquals(true, expectedText5.equals(country));
		String expectedText6 = numberinBillingAddress.getText();
		Assert.assertEquals(true, expectedText6.equals(phonenumber));

	}

	// Validation file downloading properly
	public void validateDownloadInvoiceFunctionality() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(downloadInvoiceButton));
		downloadInvoiceButton.click();
		Thread.sleep(3000);
		File folder = new File(System.getProperty("user.dir") + File.separator + "downloads");
		File[] files = folder.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				String Filename = file.getName();
				if (Filename.startsWith("invoice")) {
					System.out.println("Invoice Downloaded Succussfully" + Filename);
					if (file.delete()) {
						System.out.println(file + " file is deleted succussfully");
					} else {
						Assert.fail("File not deleted succussfully");
					}

				}
			}
		}

	}

	// Click on Arrow Button
	public void clickOnArrowButton() {
		wait.until(ExpectedConditions.visibilityOf(arrowButtonLocator));
		arrowButtonLocator.click();

	}

	// Verify home page text
	public void verifyHomePageText() {
		wait.until(ExpectedConditions.visibilityOf(homePageTextLocators));
		String expectedText = homePageTextLocators.getText();
		String actualText = "Full-Fledged practice website for Automation Engineers";
		Assert.assertEquals(true, expectedText.equals(actualText));

	}

	// Scrolling up the page
	public void scrollUpthePage() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", homePageTextLocators);

	}

}
