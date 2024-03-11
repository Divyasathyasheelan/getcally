package genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BASE_CLASS {
	public static WebDriver driver;
	public WebDriverWait wait;

	@Parameters("browser")
	@BeforeClass
	public static void openapp(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("safari")) {

			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();

		}

	}

	@AfterClass
	public void closeapp() {
		driver.quit();
	}
}
