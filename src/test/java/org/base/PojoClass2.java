package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass2 extends AdactinHotelTask{
	public PojoClass2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private  WebElement room;
	@FindBy(id="room_nos")
	private WebElement noofroom;
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement ckindate;
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement ckoutdate;
	@FindBy(id="adult_room")
	private WebElement altroom;
	@FindBy(id="child_room")
	private WebElement chldroom;
	@FindBy(xpath="//input[@value='Search']")
	private WebElement search;
	public WebElement getLocation() {
		return location;
	}
	public void setLocation(WebElement location) {
		this.location = location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public void setRoom(WebElement room) {
		this.room = room;
	}
	public WebElement getNoofroom() {
		return noofroom;
	}
	public void setNoofroom(WebElement noofroom) {
		this.noofroom = noofroom;
	}
	public WebElement getCkindate() {
		return ckindate;
	}
	public void setCkindate(WebElement ckindate) {
		this.ckindate = ckindate;
	}
	public WebElement getCkoutdate() {
		return ckoutdate;
	}
	public void setCkoutdate(WebElement ckoutdate) {
		this.ckoutdate = ckoutdate;
	}
	public WebElement getAltroom() {
		return altroom;
	}
	public void setAltroom(WebElement altroom) {
		this.altroom = altroom;
	}
	public WebElement getChldroom() {
		return chldroom;
	}
	public void setChldroom(WebElement chldroom) {
		this.chldroom = chldroom;
	}
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}
	
	
	
	
}
