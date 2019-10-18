package datadrivenframework;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.excel.utility.Xls_Reader;

import junit.framework.Assert;



public class DDF_java {

	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		//Webdriver code:
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Get URL:
		driver.get("https://20005.claimatic.net");
		
		// Get test data from excel:
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Navnit\\eclipse-workspace\\mur_gan\\src\\com\\testdata\\DDF_Testdata.xlsx");
		int rowCount = reader.getRowCount("Login_Credentials");
		System.out.println(rowCount);
		
		
		
		for(int rowNum = 2;rowNum<=rowCount;rowNum++) {
	
		
		String Username = reader.getCellData("Login_Credentials", "Username", rowNum);
		System.out.println(Username);
		
		String Password = reader.getCellData("Login_Credentials", "Password", rowNum);
		System.out.println(Password);
	
		//sending login credentials:
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Username);
		
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		/*
		//mouse hover on my profile:
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Welcome')]"))).build().perform();
		*/
		
		// Get text for Welcome User:
		String welcometext = driver.findElement(By.xpath("//span[contains(text(),'Welcome')]")).getText();
		System.out.println(welcometext);
		driver.findElement(By.xpath("//div[2]/div/div/div/ul/li/a/i")).click();
		driver.findElement(By.xpath("//a[contains(.,'My Profile')]")).click();
		Thread.sleep(2000);
		
		String firstnametext = driver.findElement(By.xpath("//input[@id='form_firstName']")).getAttribute("value");
		System.out.println(firstnametext);
		String lastnametext  = driver.findElement(By.xpath("//input[@id='form_lastName']")).getAttribute("value");
		System.out.println(lastnametext);
		String myprofile = (("Welcome") +" " + firstnametext + " " + lastnametext);
		System.out.println(myprofile);


		/*if(welcometext.equalsIgnoreCase(myprofile)){ 
			 System.out.println("Pass : Profile matches.");
			 }
			 else{ 
			 System.out.println("Fail : Profile NOT matching."); 
			 } */
	
		
		
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		
		
		
		 }	
		
		
		
		
		
		
		
		
		
		
		
	 }

	
	}

	


