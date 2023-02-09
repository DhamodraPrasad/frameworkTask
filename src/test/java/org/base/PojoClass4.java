package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass4 extends AdactinHotelTask{
	public PojoClass4() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement Address;
	@FindBy(id="cc_num")
	private WebElement ccNo;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccExpmonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccExpyear;
	@FindBy(id="cc_cvv")
	 private WebElement cvvno;
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknow;
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCcNo() {
		return ccNo;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcExpmonth() {
		return ccExpmonth;
	}
	public WebElement getCcExpyear() {
		return ccExpyear;
	}
	public WebElement getCvvno() {
		return cvvno;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
}
