package IHorizons.Amanat;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.homePage;
import resources.base;

public class taskPage extends base {

	public WebDriver driver;
	// TODO Auto-generated method stub

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://sjcmv2adamt01.sjcdev.local/home/system/?authID==CordysBuiltIn");
		driver.manage().window().maximize();
	}

	@Test
	public void checkTaskContent() {
		driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Actions build = new Actions(driver);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(driver.findElement(By.id("desktop")));
		driver.switchTo().frame(driver.findElement(By.id("app_iframe")));

		driver.findElement(By.xpath("//*[@id='username']")).click();

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Sysadmin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Aman@SJC2020");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//*[@id=\"buttonOK\"]")).click();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://sjcmv2adamt01.sjcdev.local/home/system/amanat/sjc-base/html/Index.html");
		homePage task = new homePage(driver);

		if (task.sideBar1().isDisplayed()) {
			System.out.println(task.sideBar1().getText().equals("إيصالات القبض"));
			task.sideBar1().getText();

		} else
		{
			System.out.println("Not displayed ");
		}

		if (task.sideBar2().isDisplayed())
		{
			task.sideBar2().getText();
			System.out.println(task.sideBar2().getText());
		} else {
			System.out.println("Not displayed ");
		}
		
		
	}

	@AfterTest
	public void closing() {

		driver.close();

	}
}
