/**
 * 
 */
package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * 
 */
public class BaseClass {
	protected WebDriver driver;
	public void initWebdriver(String browserName) {
		//WebDriver driver;
		switch (browserName.toLowerCase()) {
			case "firefox" :
				FirefoxOptions optionsFirefox = new FirefoxOptions();
				driver = new FirefoxDriver(optionsFirefox);

			case "chrome" :
			default :
				ChromeOptions optionsChromeDriver = new ChromeOptions();
				driver = new ChromeDriver(optionsChromeDriver);
				break;
		};
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60))
				.implicitlyWait(Duration.ofSeconds(10));
		
	}

	public void initWebdriver() {
		 initWebdriver("chrome");
	}

	public void quitWebDriver() {
		driver.quit();
	}

	public String getScreenShotPath(String testCaseName, WebDriver driver)
			throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\"
				+ testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
}
