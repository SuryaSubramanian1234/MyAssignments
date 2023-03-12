package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To Launch the Browser
				ChromeDriver driver = new ChromeDriver();
				//To load the url
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.findElement(By.id("username")).sendKeys("DemoCSR");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();

				driver.findElement(By.partialLinkText("CRM/SFA")).click();
				driver.findElement(By.partialLinkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("zagon");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Surya");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subramanian");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");

				driver.findElement(By.name("description")).sendKeys("Good");
				
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("surieas@gmail.com");
				
				WebElement stateField = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select stateDropDown = new Select(stateField);
				stateDropDown.selectByVisibleText("New York");

				driver.findElement(By.className("smallSubmit")).click();

				String title = driver.getTitle();
				System.out.println(title);

	}

}
