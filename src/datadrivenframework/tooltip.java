package datadrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	public static void main(String[] args) {
		//Webdriver code:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
				
		// Get URL:
			driver.get("https://20005.claimatic.net");
			
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//b[contains(text(),'Please enter your username')]"))).build().perform();
			String usernametooltip = driver.findElement(By.xpath("//b[contains(text(),'Please enter your username')]")).getText();
			System.out.println(usernametooltip);
			if(usernametooltip.equalsIgnoreCase("Please enter your username")) {
				System.out.println("Pass. Tooltip for Username matching with expected value.");
			}else {
				System.out.println("Fail. Tooltip for Username is not matching with expected value.");
			}
				
				
				
				
				
				
				
				
	}

}
