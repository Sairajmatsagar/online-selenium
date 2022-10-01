package Books;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import genericLibrary.Base_Class;
import pomRepository.ShoppingCartPage;

public class TC_006_ToRemoveProductFromCart  extends Base_Class {
@Test
public void toRemoveProductFromCart() throws InterruptedException {
	homePage.getShoppingCartModuleLink().click();
	String shoppingcartPageTite = driver.getTitle();
	Assert.assertEquals("Demo Web Shop. Shopping Cart", shoppingcartPageTite);
	Reporter.log("Shopping Cart page displayed successful",true);
	ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
	Thread.sleep(10000);
	shoppingCartPage.getCheckBox1().click();
	Reporter.log("checkbox selected successfully",true);
	shoppingCartPage.getRemoveModuleLink().click();
	Reporter.log("product is removed from cart  successfully",true);
}
}
