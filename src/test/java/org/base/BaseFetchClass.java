package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseFetchClass extends AdactinHotelTask {
	
	public static void main(String[] args) throws InterruptedException {
		openChromeBrowser();
		launchurl("https://adactinhotelapp.com/");
		holdExecution(5000);
		maxwindow();
		WebElement txtuser = driver.findElement(By.id("username"));
		fillTextBox(txtuser, "DHAMODRAPRASAD44");
		WebElement txtpass = driver.findElement(By.id("password"));
		fillTextBox(txtpass, "Guru4471@");
		WebElement btnlogin = driver.findElement(By.id("login"));
		toClickButton(btnlogin);
		holdExecution(2000);
		WebElement location = driver.findElement(By.id("location"));
		dropDown(location, "Melbourne");
		 WebElement hotel = driver.findElement(By.id("hotels"));
		 dropDown(hotel, "Hotel Sunshine");
		 WebElement room = driver.findElement(By.id("room_type"));
		 dropDown(room, "Double");
		 WebElement noofroom = driver.findElement(By.id("room_nos"));
		 dropDown(noofroom, "3 - Three");
		   WebElement ckindate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		   passValueByJavaExecutor("12/12/2022", ckindate);
		   WebElement ckoutdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		   passValueByJavaExecutor("15/12/2022", ckoutdate);
		   WebElement altroom = driver.findElement(By.id("adult_room"));
		   dropDown(altroom, "2 - Two");
		   WebElement chldroom = driver.findElement(By.id("child_room"));
		   dropDown(chldroom, "2 - Two");
		   WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
		   toClickButton(search);
		   WebElement rdobtn = driver.findElement(By.xpath("//input[@type='radio']"));
		   toClickByMouse(rdobtn);
		   WebElement Con = driver.findElement(By.id("continue"));
		   toClickByMouse(Con);
		   WebElement fname = driver.findElement(By.id("first_name"));
		   fillTextBox(fname, "DHAMODRA PRASAD");
		   WebElement lname = driver.findElement(By.id("last_name"));
		   fillTextBox(lname, "GURU");
		   WebElement Address = driver.findElement(By.id("address"));
		   fillTextBox(Address, "no.2 chennai");
		   WebElement ccNo = driver.findElement(By.id("cc_num"));
		   fillTextBox(ccNo, "1234567890123456");
		   WebElement ccType = driver.findElement(By.id("cc_type"));
		   dropDown(ccType, "VISA");
		   WebElement ccExpmonth = driver.findElement(By.id("cc_exp_month"));
		   dropDown(ccExpmonth, "July");
		   WebElement ccExpyear = driver.findElement(By.id("cc_exp_year"));
		   dropDown(ccExpyear, "2021");
		   WebElement cvvno = driver.findElement(By.id("cc_cvv"));
		   fillTextBox(cvvno, "589");
		   WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
		   toClickButton(booknow);
		 holdExecution(10000);
		 WebElement orderno = driver.findElement(By.xpath("//input[@name='order_no']"));
		 String text = orderno.getAttribute("value");
		 System.out.println("BOOKING ORDER NO : "+text);
		 
	}

}
