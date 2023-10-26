package project2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderLBC_ID {
	@FindBy(xpath="//*[@href='/login']") WebElement login;
	@FindBy(xpath="//*[@data-product-id='1']") WebElement product1;
	@FindBy(xpath="//*[@class='modal-dialog modal-confirm']//following::*[text()='View Cart']") WebElement viewcart;
	@FindBy(xpath="//*[text()='Proceed To Checkout']") WebElement proceedToCheck;
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
	@FindBy(xpath="//*[@class='btn btn-primary']") WebElement continu;
}
