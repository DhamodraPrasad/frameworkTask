package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass5 extends AdactinHotelTask{
	public PojoClass5() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement orderno;
	public WebElement getOrderno() {
		return orderno;
	}

}
