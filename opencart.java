package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opencart {
public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.opencart.com/index.php?route=account/register");
	driver.findElement(By.name("username")).sendKeys("deva1614");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sandeep");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sandeepgeorger@gmail.com");

	WebElement country_id=driver.findElement(By.name("country_id"));
	Select dd1= new Select(country_id);
	dd1.deselectByVisibleText("India");

	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sandeep12");

	
}
}
