package test_script;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import genric.BASE_CLASS;
import genric.Constants;
import genric.genric_resolutions;

public class Desktop_test extends BASE_CLASS implements Constants {

	@Test(priority = 1)
	public static void end_end1() {
		driver.manage().window().setSize(genric_resolutions.resolutions(resolutions_width, resolutions_ht));
		driver.get(URL1);

		Date d = new Date();
		String converted = d.toString().replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(SCREENSHOT_PATH + browser + resolutions_width + "x" + resolutions_ht + converted + ".png");
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public static void end_end2() {
		driver.manage().window().setSize(genric_resolutions.resolutions(resolutions_width, resolutions_ht));
		driver.get(URL2);

		Date d = new Date();
		String converted = d.toString().replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(SCREENSHOT_PATH + browser + resolutions_width + "x" + resolutions_ht + converted + ".png");
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 3)
	public static void end_end3() {
		driver.manage().window().setSize(genric_resolutions.resolutions(resolutions_width, resolutions_ht));
		driver.get(URL3);

		Date d = new Date();
		String converted = d.toString().replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(SCREENSHOT_PATH + browser + resolutions_width + "x" + resolutions_ht + converted + ".png");
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 4)
	public static void end_end4() {
		driver.manage().window().setSize(genric_resolutions.resolutions(resolutions_width, resolutions_ht));
		driver.get(URL4);

		Date d = new Date();
		String converted = d.toString().replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(SCREENSHOT_PATH + browser + resolutions_width + "x" + resolutions_ht + converted + ".png");
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}


	@Test(priority = 5)
	public static void end_end5() {
		driver.manage().window().setSize(genric_resolutions.resolutions(resolutions_width, resolutions_ht));
		driver.get(URL5);

		Date d = new Date();
		String converted = d.toString().replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(SCREENSHOT_PATH + browser + resolutions_width + "x" + resolutions_ht + converted + ".png");
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
