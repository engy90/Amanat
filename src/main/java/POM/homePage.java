package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	public WebDriver driver;

	By sideBar1 = By.xpath("//*[text()='إيصالات القبض']");
	By sideBar2 = By.xpath("//*[text()='سندات الصرف']");
	By sideBar3 = By.xpath("//*[text()='الادارة']");
	By sideBar4 = By.xpath("//*[text()='التقارير']");
	By sideBar5 = By.xpath("//*[text()='الدعاوى القديمة']");
	By sideBar6 = By.xpath("//*[text()='معلومات الخبراء']");
	By advanceSearch = By.xpath("//i[@class=\"icon-amanat-search\"]");
	By myTaskBtn = By.xpath("//i[@class=\"icon-amanat-my-tasks\"]");

	public homePage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement sideBar1() {
		// TODO Auto-generated constructor stub

		return driver.findElement(sideBar1);

	}

	public WebElement sideBar2() {
		// TODO Auto-generated constructor stub

		return driver.findElement(sideBar2);

	}

	public WebElement sideBar3() {
		// TODO Auto-generated constructor stub

		return driver.findElement(sideBar3);

	}

	public WebElement sideBar4() {
		// TODO Auto-generated constructor stub

		return driver.findElement(sideBar4);

	}

	public WebElement sideBar5() {
		// TODO Auto-generated constructor stub

		return driver.findElement(sideBar5);

	}

	public WebElement sideBar6() {
		// TODO Auto-generated constructor stub

		return driver.findElement(sideBar6);

	}

	public WebElement advanceSearch() {
		// TODO Auto-generated constructor stub

		return driver.findElement(advanceSearch);

	}
	public WebElement TasksBtn() {
		// TODO Auto-generated constructor stub

		return driver.findElement(advanceSearch);

	}

}
