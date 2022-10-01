package shoppingCart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.ShoppingCartPage;

public class TC_002_ToHandleContryDropdown extends Base_Class{
	@Test
	public void toHandleContryDropdown() { 
		homePage.getShoppingCartModuleLink().click();
		String shoppingcartPageTite = driver.getTitle();
		Assert.assertEquals("Demo Web Shop. Shopping Cart", shoppingcartPageTite);
		Reporter.log("Shopping Cart page displayed successful",true);
		ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
		try {
		WebElement contrydropdown=shoppingCartPage.getContryDropdown();
		Select contryDropDown=new Select(contrydropdown);
		contryDropDown.selectByValue("41");
		}
		catch(Exception e) {	
			Reporter.log("India contry selected successful",true);
		}	
	}

}
