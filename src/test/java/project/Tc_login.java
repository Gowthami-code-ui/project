package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Tc_login {
	public void login_Test() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options=new ChromeOptions();
		//Options.addArguments("--disable-notifications");
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		driver.close();
	}

}
