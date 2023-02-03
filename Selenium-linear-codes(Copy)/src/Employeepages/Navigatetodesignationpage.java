package Employeepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatetodesignationpage
{
    public static void main(final String[] args) throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://3.109.51.172/login");
		driver.manage().window().maximize();
		
		//Element for Username field
		WebElement uname=driver.findElement(By.xpath("//*[@id=\"root\"]/section/form/div/div[2]/div/div[1]/div/div/div/div/span/input"));
		
		//Element for Password field
		WebElement pwd=driver.findElement(By.xpath("//*[@id=\"root\"]/section/form/div/div[2]/div/div[2]/div/div/div/div/span/input"));

		//Element for login button
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"root\"]/section/form/div/div[2]/div/div[4]/button"));
		
		//Sending in username field
		uname.sendKeys("HARDIK2497");
		
		//Sending in password field 
		pwd.sendKeys("Hp@1234567890");
		
		//Clicking on login button
		submit.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Thread.sleep(3000);
		
		//Element for Master menu
		WebElement master=driver.findElement(By.xpath("//span[@class='ant-menu-title-content' ][normalize-space()='Master']"));
		Thread.sleep(2000);
		
		
	/*	Unimproved Code  Please Ignore This Code
	 * //Navigation to master menu
		Actions act=new Actions(driver);
		act.moveToElement(master).build().perform();
		
		//Navigation to Employee main module
		 act.moveToElement(master).sendKeys(Keys.chord(Keys.TAB,Keys.ARROW_DOWN)).build().perform();
		
		 //Navigation to Employee sub module
		 act.moveToElement(master).sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_RIGHT )).build().perform();
		 
		 Thread.sleep(2000);
		 //Navigation to Designation module
		 act.moveToElement(master).sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER)).build().perform();
		 
		 act.moveByOffset(150, 200).build().perform(); */
		

		
		
//Optimized Code
		
		Actions act=new Actions(driver);  //Action class to handle Hover on element
		act.moveToElement(master).perform();   
		
		
	//Hover on Employee
		
		Thread.sleep(2000);
		
		WebElement emp=driver.findElement(By.xpath("//span[@class='ant-menu-title-content'][normalize-space()='Employee']")); //Element for Employee
		act.moveToElement(emp).perform();
	

	
		
	//Hover on Designation	
		Thread.sleep(2000);
	
		WebElement des=driver.findElement(By.xpath("//span[@class='ant-menu-title-content'][normalize-space()='Designation']"));  //Element For Designation
		act.moveToElement(des).click().perform();
     
	
		
    }
}