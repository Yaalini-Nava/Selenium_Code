package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class IteLearnlogin {
	
	WebDriver driver;
    
@Test
  public void logintest() throws InterruptedException {
	 
	  boolean b = driver.findElement(By.xpath("//a[@class='btn lgn-top']")).isDisplayed();
	  //driver.findElement(By.xpath("//a[@class='btn lgn-top']")).click();
	  driver.findElement(By.linkText("Login")).click();
	  Thread.sleep(2000);
	  String Username, Password;
	  Username = "Yaalini";
	  Password = "Testing";
	  driver.findElement(By.name("log")).sendKeys(Username);
	  driver.findElement(By.id("sidebar-user-pass")).sendKeys(Password);
	  // driver.findElement(By.xpath("//*[@id=\"vbp-login-form\"]/button")).click();
	  driver.findElement(By.className("btn-primary")).click();
	  Thread.sleep(2000);
	  boolean L = driver.findElement(By.id("login_error")).isDisplayed();
	  System.out.println(driver.findElement(By.id("login_error")).getText());
	  System.out.println(driver.findElement(By.id("loginform")).getText());
	 
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,	TimeUnit.SECONDS );
		driver.get("https://itelearn.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
