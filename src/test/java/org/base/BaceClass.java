package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaceClass {
	
	static WebDriver driver;
	
	public static void openChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void openEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	public static  void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void minWindow() {
		driver.manage().window().minimize();
	}
	public static void closeBrowser() {
		driver.quit();
	}
	public static void closeCurrentUrl() {
		driver.close();
	}
	public static void reLoadPage() {
		driver.navigate().refresh();
	}
	public static void fetchTitle() {
		String titlename = driver.getTitle();
		System.out.println("TitleName :"+titlename);
	}
	public static void fetchCurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL : "+currentUrl);
	}
	public static void fillTextBox(WebElement element , String input) {
		element.sendKeys(input);
	}
	public static void launchurl(String pgUrl) {
		driver.get(pgUrl);
	}
	public static void holdExecution(int time) throws InterruptedException {
		Thread.sleep(time);
	}
}
