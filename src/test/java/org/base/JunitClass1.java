package org.base;

import java.time.Duration;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.ContainerDNSConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitClass1 extends BaceClass {
	static WebDriver driver;
		
	@Test
	public void Tc1() {
		String title = driver.getTitle();
		Assert.assertTrue("check title",title.contains("book"));
		System.out.println(title);
		String url = driver.getCurrentUrl();
		Assert.assertTrue("check url", url.isEmpty());
		System.out.println(url);

	}
	@Test
	public void Tc3() {
		WebElement txtemail = driver.findElement(By.id("email"));
	    fillTextBox(txtemail, "guruprasad");
	    String user = txtemail.getAttribute("value");
		Assert.assertEquals("check key", "guruprasad","user");
		WebElement txtpass = driver.findElement(By.id("pass"));
         fillTextBox(txtpass, "123456");
         Assert.assertEquals("chech pass", "123456",txtpass.getAttribute("value"));
         
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
	}
	@Before
	public void bef() {
		Date d1 = new Date();
		System.out.println(d1);
		
	}
	public void aft() {
		Date d2 = new Date();
		System.out.println(d2);
	}
	@BeforeClass
	public static void befcls() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass
	public static void Aftcls() {
       driver.quit();
	}

}
