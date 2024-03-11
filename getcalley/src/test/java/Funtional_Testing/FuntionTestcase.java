package Funtional_Testing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FuntionTestcase {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("https://demo.dealsdray.com/");
		Thread.sleep(1000);

		driver.findElement(By.id("mui-1")).sendKeys("prexo.mis@dealsdray.com");

		driver.findElement(By.id("mui-2")).sendKeys("prexo.mis@dealsdray.com");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		WebElement others_btn = driver.findElement(By.xpath("(//button[@type='button'])[2]"));

		Actions act = new Actions(driver);

		act.moveToElement(others_btn).click().perform();

		driver.findElement(By.xpath("//span[text()='Orders']")).click();

		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();

		driver.findElement(By.id("mui-7")).sendKeys("C:\\Users\\rohit\\eclipse-workspace\\getcalley\\excel_file\\demo-data.xlsx");

		driver.findElement(By.xpath("//button[text()='Import']")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("C:\\Users\\rohit\\eclipse-workspace\\getcalley\\excel_file\\funtionaltestcase.png");

		FileHandler.copy(temp, perm);
		
		Thread.sleep(3000);

		driver.quit();
	}
	

}
