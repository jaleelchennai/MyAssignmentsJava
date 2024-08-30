package homeassignment.four;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		
		//Click the Create Lead button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jaleel");
		
		//Enter the Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("shah");
		
		//Enter the Company name as LeafTaps
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTaps");

		//Enter Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead Developer");
		
		
		//Click the Create Account Button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Check the title and print
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//Close the Browser
		driver.close();
		
		

	}

}
