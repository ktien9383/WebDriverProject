package appTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
        WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
        UserName.sendKeys("abc@xyz.com");
        
        WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
        Password.sendKeys("qweeqwe@xyz");
        
        WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
        LoginBtn.click();
        
        WebElement TextSearch = driver.findElement(By.xpath("//*[text()='Facebook helps you connect and share with the people in your life.']"));
        TextSearch.click();
        
        WebElement H2Search = driver.findElement(By.xpath("//h2"));
        H2Search.click();
        
        WebElement Footer = driver.findElement(By.xpath("//div[contains(@id,'Footer')]"));
        Footer.click();
        
        WebElement LoginImage = driver.findElement(By.xpath("//a[@class='logo']/img"));
        LoginImage.click();
	}

}
