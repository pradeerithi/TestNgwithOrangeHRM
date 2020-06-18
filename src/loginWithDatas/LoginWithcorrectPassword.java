package loginWithDatas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginWithcorrectPassword {

	
	@Test
	public void loginWithBothcorrect() {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\OrangeHRMTestNg\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin1");
		
		WebElement passWord = driver.findElement(By.id("txtPassword"));
		passWord.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();

	}
}
