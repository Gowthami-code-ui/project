package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	@Test
	public void logib() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options=new ChromeOptions();
		//Options.addArguments("--disable-notifications");
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.close();
	}

}
