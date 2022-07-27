package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aabc {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.navigate().to("https://www.flipkart.com/");
Thread.sleep(3000);
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.navigate().to("https://www.facebook.com/login/");
Thread.sleep(3000);

System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.navigate().back();
Thread.sleep(4000);
driver.navigate().refresh();
driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
driver.findElement(By.name("pass")).sendKeys("omkar12");
driver.findElement(By.name("login")).click();
Thread.sleep(3000);

	}

}
