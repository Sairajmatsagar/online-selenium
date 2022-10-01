package computers;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.ComputersPage;
import pomRepository.DesktopPage;

public class TC_003_ToHandleDisplayAropDown extends Base_Class{
@Test
public void ToHandleDisplayAropDown() {
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
   Select select=new Select(deskstopPage.getDisplayDropDown());
   select.selectByVisibleText("12");
   Reporter.log("12 is selected successfully",true);
}
}
