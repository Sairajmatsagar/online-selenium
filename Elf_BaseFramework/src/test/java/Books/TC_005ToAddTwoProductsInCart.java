package Books;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.BookPage;

public class TC_005ToAddTwoProductsInCart extends Base_Class{
@Test
public void toAddTwoProductsInCart() throws InterruptedException {
	homePage.getBooksModuleLink().click();
	String actualTitle=driver.getTitle();
    Assert.assertEquals("Demo Web Shop. Books", actualTitle);
    Reporter.log("Books page displayed successfully",true);
    BookPage bookPage=new BookPage(driver);
    bookPage.getBook1().click();
    String actualTitleBookPage=driver.getTitle();
    Assert.assertEquals("Demo Web Shop. Computing and Internet", actualTitleBookPage);
   Reporter.log("click on Computing and Internet Book done successfully",true);
   bookPage.getAddToCart().click();
   Reporter.log("product1 is added successfully in cart",true);
   driver.navigate().back();
   bookPage.getBook2().click();
   String actualTitleBook1Page=driver.getTitle();
   Assert.assertEquals("Demo Web Shop. Fiction", actualTitleBook1Page);
   Reporter.log("click on Fictioon Book done successfully",true);
   bookPage.getAddToCart().click();
   Reporter.log("product2 is added successfully in cart",true);
   Thread.sleep(20000);
}
}
