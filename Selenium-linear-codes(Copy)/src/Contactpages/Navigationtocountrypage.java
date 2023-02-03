package Contactpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigationtocountrypage {

	public static void main(String[] args) throws InterruptedException {
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
		
		
	//Navigation To Country
		
		Actions act=new Actions(driver);  //Action class to handle Hover on element
		act.moveToElement(master).perform();    
		
		
	//Hover on Contact
		
		Thread.sleep(2000);
		
		WebElement contact=driver.findElement(By.xpath("//span[@class='ant-menu-title-content'][normalize-space()='Contacts']")); //Element for Employee
		act.moveToElement(contact).perform();
	

	
		
	//Navigation to County listing page
		Thread.sleep(2000);
		
		WebElement country=driver.findElement(By.xpath("//span[@class='ant-menu-title-content'][normalize-space()='Country']"));  //Element For Designation
		act.moveToElement(country).click().perform();

	}

}
