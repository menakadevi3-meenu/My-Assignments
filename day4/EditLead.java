package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//To open in guest mode
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Guest");
		// Initialise the Chrome driver
		ChromeDriver driver = new ChromeDriver(options);
		//Load URL
		 driver.get(" http://leaftaps.com/opentaps/");
		 //Maximize the browser window
		 driver.manage().window().maximize();
		 //Enter the Username as "DemoSalesManager" 
		 driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		 //the Password as "crmsfa"
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 //Click on the Login Button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //Click on the CRM/SFA Link with Partial attribute text xpath
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 //Click on the Leads Button.
		 driver.findElement(By.linkText("Leads")).click();
		 //Click on Create Lead.
		 driver.findElement(By.linkText("Create Lead")).click();
		 //Enter the CompanyName Field Using Xpath- I used Index value
		 driver.findElement(By.xpath(("(//input[@name='companyName'])[2]"))).sendKeys("Testing Company");
		 //Enter the FirstName Field Using Xpath - I used Attribute value
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Teste1r");
		 //Enter the LastName Field Using Xpath - - I used Attribute value
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Tester 22");
		 //Enter the Department Field Using any Locator of Your Choice.
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		 //Enter the Description Field Using any Locator of your choice.
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("New");
		 //Enter your email in the E-mail address Field using the locator of your choice.
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test123@gmail.com");
		 //Select State/Province as NewYork Using Visible Text.
		 WebElement States = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select state=new Select(States);
		 state.selectByContainsVisibleText("New York");
		 //Click on the Create Button.
		 driver.findElement(By.name("submitButton")).click();
		 //Click on the edit button
		 driver.findElement(By.linkText("Edit")).click();
		 //Clear the Description Field
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		 //Fill the Important Note Field with Any text - Used the attribute based xpath
		 driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Important Notes");
		 //Click on the update button
		 driver.findElement(By.name("submitButton")).click();
		 //Get the Title of the Resulting Page.
		 String title = driver.getTitle();
		System.out.println(title);
		 //Close the browser window
		 //driver.close();
		 
		 

		
	}

}
