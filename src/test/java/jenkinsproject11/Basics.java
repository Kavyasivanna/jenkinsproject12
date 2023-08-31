package jenkinsproject11;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics {
public static void main (String [] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("google.com");
	System.out.println("hi");
	
}
}
