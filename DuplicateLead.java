package week2.day1.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Caresoft");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");	
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Krti");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing purpose");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("krtipranu@gmail.com");
		
		WebElement state= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select=new Select(state);
		select.selectByVisibleText("New York");	
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();{
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Caresoft Global");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthi");
		driver.findElement(By.className("smallSubmit")).click();
		}
		
		
		String pgtitle=driver.getTitle();
		if(pgtitle.contains("View Lead")) 
		{
			System.out.println("I am on View Lead page");	
		}
	}

}
