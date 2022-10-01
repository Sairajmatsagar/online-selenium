package Books;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.BookPage;

public class TC_002_ToHandleSortByDroppdown  extends Base_Class {
@Test
 void toHandleSortByDroppdown() {
	homePage.getBooksModuleLink().click();
	String actualTitle=driver.getTitle();
    Assert.assertEquals("Demo Web Shop. Books", actualTitle);
    Reporter.log("Books page displayed successfully",true);
    BookPage bookPage=new BookPage(driver);
    Select select=new Select(bookPage.getSortDropDown());
	   select.selectByVisibleText("Price: Low to High");
	   Reporter.log("Price: Low to High is selected successfully",true);
}
}
