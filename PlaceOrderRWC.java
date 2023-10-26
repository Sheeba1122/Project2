package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PlaceOrderRWC {
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
	public void addToCart() {
		PlaceOrderRWC_ID p =PageFactory.initElements(driver, PlaceOrderRWC_ID.class);
		p.product1.click();
		System.out.println("Product added to cart");
		p.viewcart.click();
		System.out.println("Viewed the cart");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.proceedToCheck.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.register.click();
		}
		@Test(priority=2)
		public void registerWhileCheckout() {
		PlaceOrderRWC_ID p =PageFactory.initElements(driver, PlaceOrderRWC_ID.class);
		p.login.click();
		p.name.sendKeys("Test");
		p.emailid.sendKeys("testcheck7899@gmail.com");
		p.btn.click();
		
		boolean eai = driver.findElement(By.xpath("//*[text()='Enter Account Information']")).isDisplayed();
		if(eai=true) {
			System.out.println(eai + " " + driver.findElement(By.xpath("//*[text()='Enter Account Information']")).getText());
		}
		else {
			System.out.println("Not displayed");
		}
		p.title.click();
		p.psd.sendKeys("Test789@");
		WebElement day = driver.findElement(By.id("days"));
		Select obj1 = new Select(day);
		obj1.selectByValue("29");
		WebElement months = driver.findElement(By.id("months"));
		Select obj2 = new Select(months);
		obj2.selectByVisibleText("July");
		WebElement years = driver.findElement(By.id("years"));
		Select obj3 = new Select(years);
		obj3.selectByValue("1995");
		p.chk1.click();
		p.chk2.click();
		p.firstname.sendKeys("Shalini");
		p.lastname.sendKeys("Deol");
		p.company.sendKeys("Software Testing");
		p.addrs1.sendKeys("789,near pheonix mall");
		p.addrs2.sendKeys("Street no. 5, Software Testing");
		WebElement country = driver.findElement(By.id("country"));
		Select obj4 = new Select(country);
		obj4.selectByVisibleText("India");
		p.state.sendKeys("Maharahtra");
		p.city.sendKeys("Pune");
		p.zipcode.sendKeys("411048");
		p.mobnumber.sendKeys("1234567891");
		p.createaccbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean accc= driver.findElement(By.xpath("//*[text()='Account Created!']")).isDisplayed();
		if(accc=true) {
			System.out.println(accc + " "+ driver.findElement(By.xpath("//*[text()='Account Created!']")).getText() );
			}
		else {
			System.out.println("Not displayed");
		}
		p.continu.click();
		boolean logged = driver.findElement(By.xpath("//*[contains(@class,'fa fa-user')]")).isDisplayed();
		if(logged=true) {
			System.out.println(logged + " "+ driver.findElement(By.xpath("//*[contains(@class,'fa fa-user')]")).getText());
			}
		else {
			System.out.println("Not displayed");
		}
		p.cart.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.proceedToCheck.click();
		
	}
	@Test(priority=3)
	public void checkoutDetails() {
		PlaceOrderRWC_ID p =PageFactory.initElements(driver, PlaceOrderRWC_ID.class);
		System.out.println(p.deliveryaddress.isDisplayed() + ":" + p.deliveryaddress.getText());
		System.out.println(p.billingaddress.isDisplayed() + ":" + p.billingaddress.getText());
		System.out.println(p.revieworder.isDisplayed() + ":" + p.revieworder.getText());
		p.message.sendKeys("Thanks");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.placeorder.click();
	}
	@Test(priority=4)
	public void paymentdetails() {
		PlaceOrderRWC_ID p =PageFactory.initElements(driver, PlaceOrderRWC_ID.class);
		p.nameOnCard.sendKeys("Shalini Deol");
		p.cardnumber.sendKeys("123456789121");
		p.cvc.sendKeys("123");
		p.expirymonth.sendKeys("02");
		p.expiryyear.sendKeys("2028");
		p.payandconfirm.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	boolean orderplaced= driver.findElement(By.xpath("//*[text()='Order Placed!']")).isDisplayed();
		boolean orderplacedmsg= driver.findElement(By.xpath("//*[text()='Congratulations! Your order has been confirmed!']")).isDisplayed();
		System.out.println(orderplaced + ": " + orderplacedmsg );
		p.continu.click();
	}
		@Test(priority=5)
		public void deleteAccount() {
		PlaceOrderRWC_ID p =PageFactory.initElements(driver, PlaceOrderRWC_ID.class);
		p.delacc.click();
		boolean delact =driver.findElement(By.xpath("//*[text()='Account Deleted!']")).isDisplayed();
		if(delact=true) {
			System.out.println(delact + " "+ driver.findElement(By.xpath("//*[text()='Account Deleted!']")).getText());
			}
		else {
			System.out.println("Not displayed");
		}
		p.continu.click();
	}
	@AfterTest
	public void closeApp() {
		driver.close();
	}
}
