package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aa {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://web.whatsapp.com/");
driver.manage().window().maximize();


driver.navigate().to("https://www.facebook.com/login/");
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(3000);

driver.findElement(By.name("email")).sendKeys("omkaedde");
driver.findElement(By.name("pass")).sendKeys("akss1244");
driver.findElement(By.name("login")).click();
Thread.sleep(4000);
driver.quit();








	}

}
