package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {
	public static void openChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
	}
}
