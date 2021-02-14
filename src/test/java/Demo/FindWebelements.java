package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindWebelements {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://fb.com");
   String pagename = driver.getTitle();
        System.out.println(pagename);
        System.out.println(driver.getCurrentUrl());
  WebElement element=  driver.findElement(By.id("email"));
  element.sendKeys("dhakshayanig2019@gmail.com");
  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Dhakshayani@123");
driver.findElement(By.xpath("//button[@name='login']")).click();


    }



}
