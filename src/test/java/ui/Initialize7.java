package ui;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import utilities.BaseClass;

public class Initialize7 extends BaseClass {

	@Test
	public void test1() {
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		System.out.println(driver.getTitle());
	}

	@Test
	public void test2() {
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

	@Test
	public void test3() {
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
	}

	@Test
	public void test4() {
		driver.get("https://www.linkedin.com/login");
		System.out.println(driver.getTitle());
	}

	@Test
	public void test5() {
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());
	}

	@BeforeClass
	public void beforeTest() {
		initWebdriver();
	}

	@AfterClass
	public void AfterTest() {
		quitWebDriver();
	}
}


