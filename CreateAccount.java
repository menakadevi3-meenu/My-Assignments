package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
public static void main(String[] args) {
	//Change the mode to Guest
	ChromeOptions options=new ChromeOptions();
	options.addArguments("Guest");
	//Instantiate the chrome browser
	ChromeDriver driver = new ChromeDriver(options);
	//Load the URL.
	driver.get("http://leaftaps.com/opentaps/");
	//Maximize the browser window
	driver.manage().window().maximize();
	//Enter a username
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	//Enter a password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//Click the "Login" button
	driver.findElement(By.className("decorativeSubmit")).click();	
	//Click on the "CRM/SFA" link
	driver.findElement(By.partialLinkText("SFA")).click();
	//Click on the "Accounts" tab
	driver.findElement(By.linkText("Accounts")).click();
	//Click on the "Create Account" button.
	driver.findElement(By.linkText("Create Account")).click();
	//Enter an account name
	driver.findElement(By.id("accountName")).sendKeys("Test Practice Account Creation56636");
	//Enter a description as "Selenium Automation Tester." using Xpath by attribute
	driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Selenium Automation Tester.");
	//Select "ComputerSoftware" as the industry.
	//Instantiate the Industry DD
	WebElement IndustryDD = driver.findElement(By.name("industryEnumId"));
	Select industry=new Select(IndustryDD);
	//Select "ComputerSoftware" as the industry.
	industry.selectByValue("IND_SOFTWARE");	
	//Select "S-Corporation" as ownership using SelectByVisibleText.
	WebElement Corporation=driver.findElement(By.name("ownershipEnumId"));
	Select Corp=new Select(Corporation);
	Corp.selectByVisibleText("S-Corporation");
	//Select "Employee" as the source using SelectByValue
	WebElement Employee=driver.findElement(By.name("dataSourceId"));
	Select Emp=new Select(Employee);
	Emp.selectByValue("LEAD_EMPLOYEE");
	//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
	WebElement Marketing=driver.findElement(By.id("marketingCampaignId"));
	Select Market=new Select(Marketing);
	Market.selectByIndex(6);
	//Select "Texas" as the state/province using SelectByValue.
	WebElement State=driver.findElement(By.id("generalStateProvinceGeoId"));
	Select St=new Select(State);
	St.selectByValue("TX");
	//Click the "Create Account" button.
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	//Print the account name using collection/index based xpath
	String is=driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
	System.out.println(is);
	//Close the browser window.
	driver.quit();
}
}
