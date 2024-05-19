package test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("test");
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://cvc18--qax2.sandbox.my.site.com/Customers/s/login/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("niravtalks+876@gmail.com");
		//Thread.sleep(20);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement pwd = driver.findElement(By.xpath("//input[@name='Password']"));
		pwd.sendKeys("Test@123456ns");
		//Thread.sleep(20);
		//String element1 = driver.findElement(By.xpath("//input[@type='password']")).getText();
		//Thread.sleep(50);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@title='Login']")).click();
		driver.findElement(By.xpath("//button[@title='Forgot']")).click();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(10000);
		//driver.findElement(By.id("Login")).click();
	}
}
