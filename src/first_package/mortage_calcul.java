package first_package;
// mouse over, Action class//
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mortage_calcul {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navnit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,	TimeUnit.SECONDS );
		driver.get("https://www.mortgagecalculator.org/");
		Actions overto = new Actions(driver);
		overto.moveToElement(driver.findElement(By.linkText("Mortgage Calcs"))).build().perform();
		//driver.findElement(By.linkText("Mortgage Calcs")).click();
		driver.findElement(By.linkText("30 yr Fixed")).click();
		driver.findElement(By.name("HomeValue")).sendKeys("412500");
		driver.findElement(By.name("Amount")).sendKeys("300000");
		driver.findElement(By.name("Interest")).sendKeys("5.00");
		driver.findElement(By.name("Length")).sendKeys("28");
		driver.findElement(By.name("PropertyTaxes")).sendKeys("3000");
		driver.findElement(By.id("PropertyTaxesSel0")).click();
		driver.findElement(By.name("Insurance")).sendKeys("1500");
		driver.findElement(By.id("PropertyTaxesSel1")).click();
		driver.findElement(By.name("PMI")).sendKeys("0.50");
		driver.findElement(By.name("PDFEmail")).click();
		driver.findElement(By.name("PDFEmailTo")).sendKeys("sweetynavanee@gmail.com");
		driver.findElement(By.name("calculate")).click();
		
		
		
	}

}
