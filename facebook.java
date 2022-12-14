package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	public static class FaceBook {
		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			driver.findElement(By.name("firstname")).sendKeys("sandeep");
		    driver.findElement(By.name("lastname")).sendKeys("R");
			driver.findElement(By.name("reg_email__")).sendKeys("9094654452");
			driver.findElement(By.name("reg_passwd__")).sendKeys("sandeep123");

			WebElement birthday_day= driver.findElement(By.name("birthday_day"));
			Select dd1=new Select(birthday_day);
			dd1.selectByValue("18");

			WebElement birthday_month=driver.findElement(By.name("birthday_month"));
			Select dd2=new Select(birthday_month);
			dd2.selectByVisibleText("Aug");

			WebElement birthday_year=driver.findElement(By.name("birthday_year"));
			Select dd3=new Select(birthday_year);
			dd3.selectByValue("1999");

			driver.findElement(By.xpath("//label[text()='Male']")).click();

		}
	}
}
