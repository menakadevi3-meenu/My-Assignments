package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		//Instantisation of the object and passing the object options
		ChromeDriver driver=new ChromeDriver(options);
		//To open the Website
		driver.get("http://leaftaps.com/opentaps/");
		//To maximise the application
		driver.manage().window().maximize();
		//To enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//To enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//Click On OK button in the message pop-up
		//Clicking the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Clicking on the CRM/SFA Image
		driver.findElement(By.partialLinkText("SFA")).click();
		//click leads
				driver.findElement(By.linkText("Leads")).click();
				//createlead
				driver.findElement(By.linkText("Create Lead")).click();
				//company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				//firstname
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("James");
				//lastname
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Henry");
				//locate the source DD
				WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
				//instantiate the select class
				Select select=new Select(sourceDD);
				select.selectByIndex(9);
				//locate the Marketing campaign (MC)
				WebElement MC=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				//instantiate the select class
				Select s1=new Select(MC);
				s1.selectByVisibleText("Catalog Generating Marketing Campaigns");
				//locate the Ownership(OW)
				WebElement Ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				//instantiate the select class
				Select s2=new Select(Ownership);
				s2.selectByValue("OWN_PARTNERSHIP");
				//Click on Create Lead button
				driver.findElement(By.className("smallSubmit")).click();
				//GEt the title
				String title = driver.getTitle();
				System.out.println(title);
				//To quit the browser
				driver.quit();
	}

}
