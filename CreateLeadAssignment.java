package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Browser in Guest mode
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Guest");
		//Instantiate the driver
		ChromeDriver driver=new ChromeDriver(options);
		//Load the URL http://leaftaps.com/opentaps/
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//To enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//To enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
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
		//Enter a company name
		driver.findElement(By.name("companyName")).sendKeys("TestLeaf");
		//Enter a title
		driver.findElement(By.xpath("//input[@name='generalProfTitle']")).sendKeys("Testing");
		//Create Lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//GEt the title
		String title = driver.getTitle();
		System.out.println(title);
		//Close the browser
		//driver.close();		
	}

}
