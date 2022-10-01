package computers;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.ComputersPage;
import pomRepository.DesktopPage;

public class TC_002_ToHandleDropdown  extends Base_Class{
	@Test
	public void ToHandleDropdown() {
		homePage.getComputersModuleLink().click();
		String actualTitle=driver.getTitle();
	    Assert.assertEquals("Demo Web Shop. Computers", actualTitle);
	    Reporter.log("Computer page displayed successfully",true);
	    ComputersPage computerPage=new ComputersPage(driver);
	    computerPage.getDesktopModuleLink().click();
	    String actualTitleDesktopPage=driver.getTitle();
	    Assert.assertEquals("Demo Web Shop. Desktops", actualTitleDesktopPage);
	    Reporter.log("Desktops page displayed successfully",true);
	   DesktopPage deskstopPage=new DesktopPage(driver);
	   Select select=new Select(deskstopPage.getSortByDropDown());
	   select.selectByVisibleText("Price: Low to High");
	   Reporter.log("Price: Low to High is selected successfully",true);
	}
}
