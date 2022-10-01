package Books;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.BookPage;

public class TC_003_ToHandleDislpayDropdown extends Base_Class{
 @Test
 public void toHandleDislpayDropdown() {
		homePage.getBooksModuleLink().click();
		String actualTitle=driver.getTitle();
	    Assert.assertEquals("Demo Web Shop. Books", actualTitle);
	    Reporter.log("Books page displayed successfully",true);
	    BookPage bookPage=new BookPage(driver);
	    Select select=new Select(bookPage.getDisplayDropDown());
		   select.selectByVisibleText("12");
		   Reporter.log("12 is selected successfully",true);
	}
 
}
