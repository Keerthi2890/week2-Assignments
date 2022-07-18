package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='_8icz']/following-sibling::div[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Keerthi");
		driver.findElement(By.name("lastname")).sendKeys("Pranesh");
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[3]")).sendKeys("8197235966");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("P@ssw0rd$");
		WebElement birthdayday = driver.findElement(By.id("day")); 
		new Select(birthdayday).selectByValue("28");
		WebElement birthdaymonth = driver.findElement(By.id("month")); 
		new Select(birthdaymonth).selectByVisibleText("Jan"); 
		WebElement birthdayyear = driver.findElement(By.id("year")); 
		new Select(birthdayyear).selectByValue("1990"); 
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		//driver.findElement(By.name("websubmit")).click();
		
	}

}
