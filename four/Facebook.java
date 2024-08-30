package homeassignment.four;

import java.time.Duration;
import java.time.Year;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://en-gb.facebook.com");
		
		//maximise the window
		driver.manage().window().maximize();
		
		//add an implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//find Create new account button and click
		driver.findElement(By.xpath("//a[contains(@data-testid, 'open-registration-form-button')]")).click();
		
		//Enter the Firstname
		driver.findElement(By.xpath("//input[contains(@name, 'firstname')]")).sendKeys("Jaleel");
		
		//Enter the Surname
		driver.findElement(By.xpath("//input[contains(@name, 'lastname')]")).sendKeys("shah");
		
		//Enter the emailAddress
		driver.findElement(By.xpath("//input[contains(@name, 'reg_email__')]")).sendKeys("jaleel@yahoo.com");
		
		//Enter the Password
		driver.findElement(By.xpath("//input[contains(@name, 'reg_passwd__')]")).sendKeys("One23Four");
		
		//Find Date
		WebElement DateWE = driver.findElement(By.xpath("//select[contains(@name, 'birthday_day')]"));
		
		Select DateDD = new Select(DateWE);
		DateDD.selectByValue("26");
		
		//Find Month
		WebElement MonthWE = driver.findElement(By.xpath("//select[contains(@name, 'birthday_month')]"));
		
		Select MonthDD = new Select(MonthWE);
		MonthDD.selectByIndex(11);
		
		//Find Year
		WebElement YearWE = driver.findElement(By.xpath("//select[contains(@name, 'birthday_year')]"));
		
		Select YearDD = new Select(YearWE);
		YearDD.selectByVisibleText("1980");
		
		//Find Gender RadioButton
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		
		
		
		
		
				
				
		
		

	}

}
