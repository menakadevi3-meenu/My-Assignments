package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Instantisation of the object
ChromeDriver driver =new ChromeDriver();
//To open the Website
driver.get("https://login.salesforce.com/");
//To enter the username
driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
//To enter the password
driver.findElement(By.name("pw")).sendKeys("Leaf@1234");
//Click On OK button in the message pop-up
//Clicking the login button
driver.findElement(By.id("Login")).click();
//To get the title
String title = driver.getTitle();
//To verify the title
System.out.println(title);
	}

}
