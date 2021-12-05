package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment {

	public static void main(String[] args) {
		
		//open the Browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
		
		//load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// maximize the browser
		driver.manage().window().maximize();
		
		//Enter username
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	 		
		//enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Contacts tab
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click Create contact
		driver.findElement(By.linkText("Create Contact")).click();
		
		// type First name
		driver.findElement(By.id("firstNameField")).sendKeys("Preeti");
				
		//type Last name
		driver.findElement(By.id("lastNameField")).sendKeys("Srivastava");
				
		//Click create Contact  Button
		driver.findElement(By.name("submitButton")).click();
		
		//Print the first name  
		String fname = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(fname);
					
		//Print the browser title
		String title = driver.getTitle();		
		System.out.println(title);
		
		//Close the browser
		driver.close();
		
	}

}
