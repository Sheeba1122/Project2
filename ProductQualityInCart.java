package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductQualityInCart {
	public FirefoxDriver driver;
	
	@FindBy(xpath="//*[text()='View Product']") WebElement viewproduct;
	@FindBy(id="quantity") WebElement quantity;
	@FindBy(xpath="//*[@class='btn btn-default cart']//following::*[@class='fa fa-shopping-cart']") WebElement addtocart;
	@FindBy(xpath="//*[@class='modal-dialog modal-confirm']//following::*[@href='/view_cart']") WebElement viewcart;
	@FindBy(xpath="//*[text()='Blue Top']") WebElement product1;
	@FindBy(xpath="//*[text()='4']")WebElement displayquantity;
	@FindBy(xpath="//div[@class='modal-dialog modal-confirm']") WebElement popup;
	
	@BeforeTest
	public void launchapp() {
		System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
		driver = new FirefoxDriver();
		driver.get("https://automationexercise.com");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@Test(priority=1)
	public void productQuality() {
		boolean homepage = driver.findElement(By.xpath("//*[text()=' Home']")).isEnabled();
		System.out.println(homepage + ": " + driver.findElement(By.xpath("//*[text()=' Home']")).getText());
		ProductQualityInCart p = PageFactory.initElements(driver, ProductQualityInCart.class);
		p.viewproduct.click();
		p.quantity.clear();
		p.quantity.sendKeys("4");
		p.addtocart.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}
	@Test(priority=2)
	public void viewCart() {
		ProductQualityInCart p = PageFactory.initElements(driver, ProductQualityInCart.class);
		p.viewcart.click();
		p.product1.isDisplayed();
		System.out.println("Product is Displayed : "+ p.product1.getText());
		p.displayquantity.isDisplayed();
		System.out.println("Product Quantity is : "+ p.displayquantity.getText());
	}
	@AfterTest
	public void closeApp() {
		driver.close();
	}
	
}
