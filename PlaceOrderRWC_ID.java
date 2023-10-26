package project2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderRWC_ID {
	@FindBy(xpath="//*[@href='/products']") WebElement productpage;
	@FindBy(xpath="//*[@data-product-id='1'][1]") WebElement product1;
	@FindBy(xpath="//*[@class='modal-dialog modal-confirm']//following::*[text()='View Cart']") WebElement viewcart;
	@FindBy(xpath="//*[text()='Proceed To Checkout']") WebElement proceedToCheck;
	@FindBy(xpath="//*[@class='modal-dialog modal-confirm']//following::a[@href='/login']") WebElement register;
	@FindBy(xpath="//*[@class='shop-menu pull-right']//following::*[@href='/login']") WebElement login;
	@FindBy(name="name") WebElement name;
	@FindBy(xpath="//h2[text()='New User Signup!']//following::input[@name='email']") WebElement emailid;
	@FindBy(xpath="//*[text()='Signup']") WebElement btn;
	@FindBy(id="id_gender2") WebElement title;
	@FindBy(id="days") WebElement Day;
	@FindBy(id="password") WebElement psd;
	@FindBy(id="newsletter") WebElement chk1;
	@FindBy(id="optin") WebElement chk2;
	@FindBy(id="first_name") WebElement firstname;
	@FindBy(id="last_name") WebElement lastname;
	@FindBy(id="company") WebElement company;
	@FindBy(id="address1") WebElement addrs1;
	@FindBy(id="address2") WebElement addrs2;
	@FindBy(id="state") WebElement state;
	@FindBy(id="city") WebElement city;
	@FindBy(id="zipcode") WebElement zipcode;
	@FindBy(id="mobile_number") WebElement mobnumber;
	@FindBy(xpath="//*[text()='Create Account']") WebElement createaccbtn;
	@FindBy(xpath="//*[@class='btn btn-primary']") WebElement continu;
	@FindBy(xpath="//*[@href='/view_cart']") WebElement cart;
	@FindBy(xpath="//*[text()='Your delivery address']") WebElement deliveryaddress;
	@FindBy(xpath="//*[text()='Your billing address']") WebElement billingaddress;
	@FindBy(xpath="//*[text()='Review Your Order']") WebElement revieworder;
	@FindBy(xpath="//*[@name='message']") WebElement message;
	@FindBy(xpath="//*[text()='Place Order']") WebElement placeorder;
	@FindBy(xpath="//*[@name='name_on_card']") WebElement nameOnCard;
	@FindBy(xpath="//*[@name='card_number']") WebElement cardnumber;
	@FindBy(xpath="//*[@name='cvc']") WebElement cvc;
	@FindBy(xpath="//*[@name='expiry_month']") WebElement expirymonth;
	@FindBy(xpath="//*[@name='expiry_year']") WebElement expiryyear;
	@FindBy(xpath="//*[@id='submit']") WebElement payandconfirm;
	@FindBy(xpath="//*[@href='/delete_account']") WebElement delacc;
	
}
