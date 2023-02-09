package org.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotelTask {
	static WebDriver  driver;
	public static void openChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void launchurl(String pgurl) {
		driver.get(pgurl);
	}
	public static void maxwindow() {
    driver.manage().window().maximize();
	}
	public static void fillTextBox(WebElement element , String input) {
		element.sendKeys(input);
	}
	public static void toClickButton(WebElement ele) {
		ele.click();
	}
	public static void holdExecution(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	public static void dropDown(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public static void passValueByJavaExecutor(String value,WebElement element) {
	JavascriptExecutor jk =(JavascriptExecutor)driver;
	jk.executeScript("arguments[0].setAttribute('value','"+value+"')", element);
	}
	public static void toClickByMouse(WebElement e) {
     e.click();
	}
	
	

}
