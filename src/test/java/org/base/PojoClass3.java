package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass3 extends AdactinHotelTask{
   public PojoClass3() {
	   PageFactory.initElements(driver, this);
}
   @FindBy(xpath="//input[@type='radio']")
  private WebElement rdobtn;
  @FindBy(id="continue")
 private WebElement Con;
public WebElement getRdobtn() {
	return rdobtn;
}
public WebElement getCon() {
	return Con;
}
  
}
