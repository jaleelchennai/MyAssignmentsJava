package homeassignment.six;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJioMensBags {

	public static void main(String[] args) throws InterruptedException {
		//Set WebDriver
		WebDriver driver = new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the AJio website
		driver.get("https://www.ajio.com");
		
		//Find the Search field
		WebElement sBox = driver.findElement(By.name("searchVal"));
		sBox.sendKeys("bags");
		//Find the Search Button and click
		WebElement sButton = driver.findElement(By.className("ic-search"));
		sButton.click();
		
		//Find the gender Men and click
		WebElement genderMen = driver.findElement(By.xpath("//label[contains(text(), 'Men')]"));
		genderMen.click();
		
		Thread.sleep(5000);
		
		//Find the Fashion Bags and click
		WebElement fashionBags = driver.findElement(By.xpath("//label[contains(text(), 'Fashion Bags')]"));
		fashionBags.click();
		
		Thread.sleep(5000);
		
		//Find the price and make a list
		WebElement itemCount = driver.findElement(By.className("length"));
		System.out.println(itemCount.getText());
		
		//Find the brand names from the class = "brand"
		List<WebElement> brands = driver.findElements(By.className("brand"));
		System.out.println("Brands");
		for (WebElement brand : brands) {
			System.out.println(brand.getText());
		}
		
		Thread.sleep(2000);
		
		//Find the bag names from  the class = ""
		List<WebElement> bagNames = driver.findElements(By.className("nameCls"));
		System.out.println("Bag Names");
		for (WebElement bag : bagNames) {
			System.out.println(bag.getText());
		}
		
		
		
		
		
		

	}

}
