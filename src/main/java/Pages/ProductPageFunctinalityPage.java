package Pages;

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
	public void clickOnCartButton() {
		wait.until(ExpectedConditions.visibilityOf(cartoptionLocator));
		cartoptionLocator.click();

	}

	// Hover over visible element
	public void hoverOverVisibleElementandClickaddToCart(String element) {
		if (element.equals("First Product")) {
			WebElement mainCartButton1 = driver.findElement(By.xpath("(//a[contains(.,'Add to cart')])[1]"));
			WebElement mainCartButton2 = driver.findElement(By.xpath("(//a[contains(.,'Add to cart')])[2]"));
			Actions builder = new Actions(driver);
			builder.moveToElement(mainCartButton1).build().perform();
			builder.click();
			mainCartButton2.click();

		} else if (element.equals("Second Product")) {
			WebElement mainCartButton1 = driver.findElement(By.xpath("(//a[contains(.,'Add to cart')])[3]"));
			WebElement mainCartButton2 = driver.findElement(By.xpath("(//a[contains(.,'Add to cart')])[4]"));
			Actions builder = new Actions(driver);
			builder.moveToElement(mainCartButton1).build().perform();
			builder.click();
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
	public void VerifyTheCartDetails(String price,String quantity, String totalprice ) {
	  WebElement priceDetails=driver.findElement(By.xpath("//td[@class='cart_price']//p[contains(text(),'"+price+"')]"));
	  WebElement quantityDetails=driver.findElement(By.xpath("//tr[@id='product-1']//button[@class='disabled'][normalize-space()='"+quantity+"']"));
	  WebElement totalpriceDetails=driver.findElement(By.xpath("//p[@class='cart_total_price'][normalize-space()='"+totalprice+"']"));
	  Assert.assertEquals(true, priceDetails.isDisplayed());
	  Assert.assertEquals(true, quantityDetails.isDisplayed());
	  Assert.assertEquals(true, totalpriceDetails.isDisplayed());
			
		
	}
    //clicking on view cart link
	public void clickOnviewProductLink() {
		wait.until(ExpectedConditions.visibilityOf(viewProduct));
		viewProduct.click();
		
	}
    //adding quantity number
	public void addQuantity(String quantity) {
		wait.until(ExpectedConditions.visibilityOf(quantityField));
		quantityField.clear();
		quantityField.sendKeys(quantity);
		
	}
     //clicking on add to cart button
	public void clickonAddtoCart() {
		wait.until(ExpectedConditions.visibilityOf(addToCart));
		addToCart.click();
		
	}
    //Verifying Product Details
	public void verifyProductDetails(String productName) {
		WebElement product_name = driver.findElement(By.xpath("//*[normalize-space()='" + productName + "']"));
		Assert.assertEquals(true, product_name.isDisplayed());

		
	}

}
