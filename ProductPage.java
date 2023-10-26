package project2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ProductPage {
	public FirefoxDriver driver;
	
	
	@BeforeTest
	public void launchapp() {
	System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
	driver = new FirefoxDriver();
	driver.get("https://automationexercise.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void productpage() {
		boolean homepage = driver.findElement(By.xpath("//*[text()=' Home']")).isEnabled();
		System.out.println(homepage + ": " + driver.findElement(By.xpath("//*[text()=' Home']")).getText());
		ProductPage_ID p = PageFactory.initElements(driver, ProductPage_ID.class);
		p.productpage.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean allproducts = driver.findElement(By.xpath("//*[text()='All Products']")).isEnabled();
		System.out.println(allproducts + ": " + driver.findElement(By.xpath("//*[text()='All Products']")).getText());
		List<WebElement> productlist = driver.findElements(By.xpath("//*[@alt='ecommerce website products']/following::p"));
		for(WebElement plist : productlist) {
			System.out.println(plist.getText());
		}
	}
	@Test(priority=2)
	public void productDetails() {
		ProductPage_ID p = PageFactory.initElements(driver, ProductPage_ID.class);
		p.product1.click();
		boolean productdetails = driver.findElement(By.xpath("//*[text()='Blue Top']")).isEnabled();
		System.out.println(productdetails + ": " + driver.findElement(By.xpath("//*[text()='Blue Top']")).getText());
		System.out.println(p.pname.isDisplayed());
		System.out.println(p.pname.getText());
		System.out.println(p.pcategory.isDisplayed());
		System.out.println(p.pcategory.getText());
		System.out.println(p.pprice.isDisplayed());
		System.out.println(p.pprice.getText());
		System.out.println(p.pavailability.isDisplayed());
		System.out.println(p.pavailability.getText());
		System.out.println(p.pconditions.isDisplayed());
		System.out.println(p.pconditions.getText());
		System.out.println(p.pbrand.isDisplayed());
		System.out.println(p.pbrand.getText());
	}
	@AfterTest
	public void closeApp() {
		driver.close();
	}
}
