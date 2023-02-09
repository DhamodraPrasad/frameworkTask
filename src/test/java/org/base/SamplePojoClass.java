package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SamplePojoClass extends AdactinHotelTask {
	public static void main(String[] args) throws InterruptedException {
		openChromeBrowser();
		launchurl("https://adactinhotelapp.com/");
		holdExecution(5000);
		maxwindow();
		PojoClass1 p1 = new PojoClass1();
		WebElement txtuser = p1.getTxtuser();
		fillTextBox(txtuser, "DHAMODRAPRASAD44");
		WebElement txtpass = p1.getTxtpass();
		fillTextBox(txtpass, "Guru4471@");
		WebElement btnlogin = p1.getBtnlogin();
		toClickButton(btnlogin);
		holdExecution(2000);
		PojoClass2 p2 = new PojoClass2();
		WebElement location = p2.getLocation();
		dropDown(location, "Melbourne");
		 WebElement hotel = p2.getHotel();
		 dropDown(hotel, "Hotel Sunshine");
		 WebElement room = p2.getRoom();
		 dropDown(room, "Double");
		 WebElement noofroom = p2.getNoofroom();
		 dropDown(noofroom, "3 - Three");
		   WebElement ckindate = p2.getCkindate();
		   passValueByJavaExecutor("12/12/2022", ckindate);
		   WebElement ckoutdate = p2.getCkoutdate();
		   passValueByJavaExecutor("15/12/2022", ckoutdate);
		   WebElement altroom = p2.getAltroom();
		   dropDown(altroom, "2 - Two");
		   WebElement chldroom = p2.getChldroom();
		   dropDown(chldroom, "2 - Two");
		   WebElement search = p2.getSearch();
		   toClickButton(search);
		   PojoClass3 p3 = new PojoClass3();
		   WebElement rdobtn = p3.getRdobtn();
		   toClickByMouse(rdobtn);
		   WebElement Con = p3.getCon();
		   toClickByMouse(Con);
		   PojoClass4 p4 = new PojoClass4();
		   WebElement fname = p4.getFname();
		   fillTextBox(fname, "DHAMODRA PRASAD");
		   WebElement lname = p4.getLname();
		   fillTextBox(lname, "GURU");
		   WebElement Address = p4.getAddress();
		   fillTextBox(Address, "no.2 chennai");
		   WebElement ccNo = p4.getCcNo();
		   fillTextBox(ccNo, "1234567890123456");
		   WebElement ccType = p4.getCcType();
		   dropDown(ccType, "VISA");
		   WebElement ccExpmonth = p4.getCcExpmonth();
		   dropDown(ccExpmonth, "July");
		   WebElement ccExpyear = p4.getCcExpyear();
		   dropDown(ccExpyear, "2021");
		   WebElement cvvno = p4.getCvvno();
		   fillTextBox(cvvno, "589");
		   WebElement booknow = p4.getBooknow();
		   toClickButton(booknow);
		 holdExecution(10000);
		 PojoClass5 p5=new PojoClass5();
		 WebElement orderno = p5.getOrderno();
		 String text = orderno.getAttribute("value");
		 System.out.println("BOOKING ORDER NO : "+text);
		
	}

}
