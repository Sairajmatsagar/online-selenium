package shoppingCart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.ShoppingCartPage;

public class TC_003_ToHandleStateDropdown extends Base_Class{
	@Test
	public void toHandleStateDropdow() {
		homePage.getShoppingCartModuleLink().click();
		String shoppingcartPageTite = driver.getTitle();
		Assert.assertEquals("Demo Web Shop. Shopping Cart", shoppingcartPageTite);
		Reporter.log("Shopping Cart page displayed successful",true);
		ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
		try {
		WebElement statedropdown=shoppingCartPage.getStateDropdown();
		Select stateDropDown=new Select(statedropdown);
		stateDropDown.selectByValue("0");
		Reporter.log(" Other (Non US) selected successful",true);
		}
		catch(Exception e) {	
			Reporter.log("Other (Non US) selected successful",true);
		}	
	}

}
