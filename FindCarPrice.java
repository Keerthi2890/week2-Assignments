package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FindCarPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.zoomcar.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='multiselect__tags']")).click();
		driver.findElement(By.xpath("//span[text()='India']")).click();
		driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//button[text()[normalize-space()='Confirm']]")).click();		
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//div[text()[normalize-space()='Pick Up City, Airport, Address or Hotel']]")).click();
		driver.findElement(By.className("ellipsis")).click();
		driver.findElement(By.className("field-date")).click();
		driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Find cars')]")).click();		
		String price=driver.findElement(By.xpath("//h3[text()='Maruti Swift Dzire']/following::div[@class='price-book-ctr']/div/div")).getText();
				System.out.println(price.replace("₹",""));		
	}
}
