package first_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class first_project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Book for kids");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		
		//1. To get the total count of the list of video links
		List <WebElement> linklist = driver.findElements(By.id("video-title"));
		System.out.println(linklist.size());
		
		
		//2. Text of each links:
		
		for (int i=0; i<linklist.size(); i++) {
			String linktext =linklist.get(i).getText();
			System.out.println(linktext);
		}
		
		
		
		
		
	}

}
