package project2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductInCart_ID {
	@FindBy(xpath="//*[@href='/products']") WebElement productpage;
	@FindBy(xpath="//*[@data-product-id='1'][1]") WebElement product1;
	@FindBy(xpath="//*[@class='modal-footer']//following::*[text()='Continue Shopping']") WebElement continueshopping;
	@FindBy(xpath="//*[@data-product-id='2'][1]") WebElement product2;
	@FindBy(xpath="//*[@class='modal-dialog modal-confirm']//following::*[@href='/view_cart']") WebElement viewcart;
	@FindBy(xpath="//*[text()='Blue Top']//following::*[@class='cart_price'][1]") WebElement p1price;
	@FindBy(xpath="//*[text()='Blue Top']//following::*[@class='cart_quantity'][1]") WebElement p1quantity;
	@FindBy(xpath="//*[text()='Blue Top']//following::*[@class='cart_total'][1]") WebElement item1totalprice;
	@FindBy(xpath="//*[text()='Men > Tshirts']//following::*[@class='cart_price'][1]") WebElement p2price;
	@FindBy(xpath="//*[text()='Men > Tshirts']//following::*[@class='cart_quantity'][1]") WebElement p2quantity;
	@FindBy(xpath="//*[text()='Men > Tshirts']//following::*[@class='cart_total'][1]") WebElement item2totalprice;
}
