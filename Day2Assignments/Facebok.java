package week2.Day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Facebok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.partialLinkText("Create new")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("surya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("subramanian");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9677225916");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("password1234");

		WebElement dayField = driver.findElement(By.id("day"));
		Select dayDropDown = new Select(dayField);
		dayDropDown.selectByVisibleText("12");
		
		WebElement monthField = driver.findElement(By.id("month"));
		Select monthDropDown = new Select(monthField);
		monthDropDown.selectByVisibleText("Sep");
		
		WebElement yearField = driver.findElement(By.id("year"));
		Select yearDropDown = new Select(yearField);
		yearDropDown.selectByVisibleText("2022");
		
        WebElement radio1 =driver.findElement(By.xpath("//span[@data-type='radio']/span/input[@value='1']"));
        radio1.click();			
      //span[@data-type="radio"]/span/input[@value='1']
        driver.close();
	}

}
