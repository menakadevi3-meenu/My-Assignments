package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassRoomSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Driver Instantiation 
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver= new EdgeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
//Load the URL
driver.get("https://www.facebook.com/");
//Maximize the browser
driver.manage().window().maximize();
//GEt the title
String title = driver.getTitle();
System.out.println(title);
//driver.quit();
	}
}
