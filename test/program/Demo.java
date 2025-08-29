package program;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String firstProduct = driver.findElement(By.cssSelector(".inventory_item_name")).getText();
		System.out.println("First Product Name: " + firstProduct);
		String firstPrice = driver.findElement(By.cssSelector(".inventory_item_price")).getText();
		System.out.println("First Product Price: " + firstPrice);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Harini");
        driver.findElement(By.id("last-name")).sendKeys("R");
        driver.findElement(By.id("postal-code")).sendKeys("631102");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("confirmation_page.png"); 
        FileUtils.copyFile(srcFile, destFile);

        System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
        driver.quit();
        
        

    }

		
		
		
		
		

	}


