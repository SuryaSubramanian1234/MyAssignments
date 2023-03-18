package week2.Day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://acme-test.uipath.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");

		driver.findElement(By.className("btn-primary")).click();

		
		//driver.findElement(By.partialLinkText("Login")).click();

		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.partialLinkText("Log Out")).click();
		driver.close();
		System.out.println("completed");

		}

}
