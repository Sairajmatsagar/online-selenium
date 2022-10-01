package computers;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.ComputersPage;
import pomRepository.DesktopPage;

public class TC_001_ToAddCheapComputerInCart extends Base_Class{
	
	@Test(groups ={"smoke"})
	public void toAddCheapComputerInCart() throws InterruptedException {
		homePage.getComputersModuleLink().click();
		String actualTitle=driver.getTitle();
	    Assert.assertEquals("Demo Web Shop. Computers", actualTitle);
	    Reporter.log("Computer page displayed successfully",true);
	    ComputersPage computerPage=new ComputersPage(driver);
	    computerPage.getDesktopModuleLink().click();
	    String actualTitleDesktopPage=driver.getTitle();
	    Assert.assertEquals("Demo Web Shop. Desktops", actualTitleDesktopPage);
	    Reporter.log("Desktops page displayed successfully",true);
	    DesktopPage desktopPage=new DesktopPage(driver);
	    Thread.sleep(2000);
	    desktopPage.getDesktop1().click();
	    String cheapComputerTitle=driver.getTitle();
	    Assert.assertEquals("Demo Web Shop. Build your own cheap computer", cheapComputerTitle);
	    Reporter.log("click on build computer done successfully",true);
	    desktopPage.getAddToCart().click();
	    Reporter.log("product is added successfully in cart");
	}

}
