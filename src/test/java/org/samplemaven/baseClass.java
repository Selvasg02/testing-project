package org.samplemaven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class baseClass {

	public static WebDriver driver;

	public static Actions a;

	public static void openWindow() {
		driver = new ChromeDriver();
	}

	public static void enterUrl(String urls) {
		driver.get(urls);
	}

	public static void maxScreen() {
		driver.manage().window().maximize();
	}

	public static void sendData(WebElement webRefName, String datavalue) {
		webRefName.sendKeys(datavalue);
	}

	public static void clk(WebElement webrefdata) {
		webrefdata.click();
	}

	public static void timeManage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void mElements(WebElement webref) {
		a.moveToElement(webref);
	}

	public static void refresher() {
		driver.navigate().refresh();
	}

	public static void resend() {
		// TODO Auto-generated method stub

	}

}
