package homeassignment.four;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximise the browser
		driver.manage().window().maximize();
		
		//to load the URL
		driver.get("http://leaftaps.com/opentaps");
		
		//locate the username field
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//locate the password field
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click the CRM/SFA button
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click the Create Account button
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter the Account name and add description
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		
		//Enter a number of Employees
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		
		//Enter the Site Name as LeafTaps
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//Click the Create Account Button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Check the title and print
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//Close the Browser
		driver.close();
		
		

	}

}
