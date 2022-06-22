package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicselenium {

	WebDriver driver;

	public void createLead() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Apple");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("santhoshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("j");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("santo");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Chemical engineer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Devolper");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Santhoshinidgm@gmail.com");

		// driver.findElement(By.name("primaryEmail")).sendKeys("Santhoshinidgm@gmail.com");
		// driver.findElement(By.id("Country"));
		Select drpCountry = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		drpCountry.selectByVisibleText("India");
		Thread.sleep(3000);
		Select drpState = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		drpState.selectByVisibleText("TAMILNADU");
		// Create Lead
		driver.findElement(By.xpath("//*[@value='Create Lead']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();

		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("Lead is succesfully created");
		}

		else {
			System.out.println("Lead is not succesfully created");
		}

	}
	
	public void editLead() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Apple");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("santhoshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("j");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("santo");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Chemical engineer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Devolper");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Santhoshinidgm@gmail.com");

		// driver.findElement(By.name("primaryEmail")).sendKeys("Santhoshinidgm@gmail.com");
		// driver.findElement(By.id("Country"));
		Select drpCountry = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		drpCountry.selectByVisibleText("United States");
		Thread.sleep(3000);
		Select drpState = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		drpState.selectByVisibleText("New York");
		// Create Lead
		driver.findElement(By.xpath("//*[@value='Create Lead']")).click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Edit']")).click();	
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("Tester");
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("AnyText");
		driver.findElement(By.xpath("//*[@value='Update']")).click();
		String title = driver.getTitle();

		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("Lead is succesfully Updated");
		}

		else {
			System.out.println("Lead is not succesfully Updated");
		}
		
		

		
	}
	
	public void DuplicateLead() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Apple");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("santhoshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("j");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("santo");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Chemical engineer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Devolper");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Santhoshinidgm@gmail.com");

		// driver.findElement(By.name("primaryEmail")).sendKeys("Santhoshinidgm@gmail.com");
		// driver.findElement(By.id("Country"));
		Select drpCountry = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		drpCountry.selectByVisibleText("United States");
		Thread.sleep(3000);
		Select drpState = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		drpState.selectByVisibleText("New York");
		// Create Lead
		driver.findElement(By.xpath("//*[@value='Create Lead']")).click();
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='Duplicate Lead']")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Orange");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santo");
		
		driver.findElement(By.xpath("//*[@value='Create Lead']")).click();
		String title = driver.getTitle();
		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("Lead is succesfully Updated");
		}

		else {
			System.out.println("Lead is not succesfully Updated");
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Basicselenium bs = new Basicselenium();
	//	bs.createLead();
	//	bs.editLead();
		bs.DuplicateLead();
		
		

	}

}
