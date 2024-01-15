package org.selmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
	
	
	
public static void main(String[] args) {
	
	
	WebDriver driver=new ChromeDriver();
	
   driver.get("https://www.facebook.com");
   
 //  WebElement ss=driver.findElement(By.id("email"));
  // ss.sendKeys("aravind");
   
  //	 WebElement aa=driver.findElement(By.id("pass"));
   //	aa.sendKeys("111111");
   
  //	 WebElement yy=driver.findElement(By.name("login"));
  // yy.click();
   
   // WebElement qq=driver.findElement(By.className("fb_logo _8ilh img"));
   // qq.click();
   
   WebElement rr=driver.findElement(By.xpath("//a[text()='Create a Page']"));
    rr.click();
    
    WebElement xx=driver.findElement(By.xpath("//a[@role='button']"));
    xx.click();
    
    WebElement fst=driver.findElement(By.name("firstname"));
    fst.sendKeys("aravind");
    
    WebElement sur=driver.findElement(By.name("lastname"));
    sur.sendKeys("rvr");
    
    WebElement mm=driver.findElement(By.xpath("//input[@type='text']"));
    mm.sendKeys("aravindrrrrr");
    
   
 
   
  
  
	
}
	
	

	
	
	
	
	

}
