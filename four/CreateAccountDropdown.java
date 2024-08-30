package homeassignment.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDropdown {

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
		
		//Select ComputerSoftware as the Industry
		WebElement IndustryWE = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		
		Select IndustryDD = new Select(IndustryWE);
		IndustryDD.selectByValue("IND_SOFTWARE");
		
		//Select  S-corporation as ownership using SelectByVisibleText
		WebElement OwnershipWE = driver.findElement(By.name("ownershipEnumId"));
		
		Select OwnershipDD = new Select(OwnershipWE);
		OwnershipDD.selectByVisibleText("S-Corporation");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement CampaignWE = driver.findElement(By.name("marketingCampaignId"));
		
		Select CampainDD = new Select(CampaignWE);
		CampainDD.selectByIndex(6);
		
		//Select "Texas" as the state/province using SelectByValue
		WebElement StateWE = driver.findElement(By.id("generalStateProvinceGeoId"));
		
		Select StateDD = new Select(StateWE);
		StateDD.selectByValue("TX");
		
		
		
		
				
		//Enter the Site Name as LeafTaps
		//driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//Click the Create Account Button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Check the title and print
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//Close the Browser
		driver.close();
		
		

	}

}
