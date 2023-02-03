package Companypages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigatetocompany {

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
		
		Thread.sleep(3000);
		
		//Element for Master menu
		WebElement master=driver.findElement(By.xpath("//span[@class='ant-menu-title-content'][normalize-space()='Master']"));
		Thread.sleep(2000);
		
		//Navigation to master menu
		Actions act=new Actions(driver);
		act.moveToElement(master).build().perform();
		
		//Navigation to Company main module
		
		Thread.sleep(2000);
		WebElement company=driver.findElement(By.xpath("//span[@class='ant-menu-title-content'][normalize-space()='Company']"));
		act.moveToElement(company).perform();
		
		
		
		//Navigation to Company sub-module
		act.moveToElement(company).sendKeys(Keys.chord(Keys.TAB,Keys.ARROW_RIGHT)).perform();
		act.moveToElement(company).sendKeys(Keys.ENTER).perform();
		
		//Closing master menu
		act.moveByOffset(150, 200).build().perform();
	
	}

}
