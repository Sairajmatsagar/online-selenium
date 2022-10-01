package Books;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.Assert;
import genericLibrary.Base_Class;

import pomRepository.BookPage;
import pomRepository.ComputersPage;
import pomRepository.DesktopPage;

public class TC_001_ToAddBookInCart  extends Base_Class {
@Test
	public  void toAddBookInCart() {
		homePage.getBooksModuleLink().click();
		String actualTitle=driver.getTitle();
	    Assert.assertEquals("Demo Web Shop. Books", actualTitle);
	    Reporter.log("Books page displayed successfully",true);
	    BookPage bookPage=new BookPage(driver);
	    bookPage.getBook1().click();
	    String actualTitleBookPage=driver.getTitle();
	    Assert.assertEquals("Demo Web Shop. Computing and Internet", actualTitleBookPage);
	    Reporter.log("Computing and Internet Book page displayed successfully",true);
	   Reporter.log("click on Computing and Internet Book done successfully",true);
	   bookPage.getAddToCart().click();
	   Reporter.log("product is added successfully in cart");
	 
	}

}
