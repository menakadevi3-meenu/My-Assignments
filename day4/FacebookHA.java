package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Driver Instantiation 
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Create a new account	
        driver.findElement(By.linkText("Create new account")).click();
//Enter the first name
        driver.findElement(By.name("firstname")).sendKeys("George");
        //Enter the last name
        driver.findElement(By.name("lastname")).sendKeys(" Amitharaj");
        //Select the Date DD
        WebElement DateDD=driver.findElement(By.xpath("//select[@id='day']"));
        Select Date=new Select(DateDD);
        Date.selectByValue("29");
        //Select the Month DD
        WebElement MonthDD=driver.findElement(By.xpath("//select[@id='month']"));
        Select Month=new Select(MonthDD);
        Month.selectByIndex(5);
        //Select the YearDD
        WebElement YearDD=driver.findElement(By.name("birthday_year"));
        Select Year=new Select(YearDD);
        Year.selectByContainsVisibleText("2017");
        //Select the Gender
        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
        // Enter the Mobile number or email address.
        driver.findElement(By.name("reg_email__")).sendKeys("test123@gmail.com");
        //Enter the password
        driver.findElement(By.name("reg_passwd__")).sendKeys("1234567");
		//Get the title
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
