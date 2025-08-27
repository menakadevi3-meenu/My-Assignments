package week2.day2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
				 //Click "Find leads." - using Linktext xpath
				 driver.findElement(By.linkText("Find Leads")).click();
				 //Click on the "Phone" tab.
				 driver.findElement(By.linkText("Phone")).click();
				 //Enter the phone number - Used attribute based xpath
				 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123");
				 //Click the "Find leads" button - Used link text based xpath
				 driver.findElement(By.linkText("Find Leads")).click();
				 Thread.sleep(1000);
                 // Click the first resulting lead - Advanced Xpath- child to parent relationship
				 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
				 //Enter the captured lead ID 
				 String CaptureLeadID= driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
				 System.out.println(CaptureLeadID);
				// Click the "Delete" button.
				 driver.findElement(By.xpath("//a[text()='Delete']")).click();
				 //Click "Find leads" again
				 driver.findElement(By.linkText("Find Leads")).click();
				 //Navigate to the LeadsID and enter the CapturedID
				 driver.findElement(By.xpath("//input[@name='id']")).sendKeys(CaptureLeadID);
				 //Click "Find leads." - using Linktext xpath
				 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				 Thread.sleep(1000);
				 //Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion
				 boolean is =driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
				 System.out.println(is);
				 //Close the browser.
				 driver.close();
	}
	}