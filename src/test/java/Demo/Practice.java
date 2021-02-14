package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
       // driver.findElement(By.cssSelector( "input[id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector( " input[ name='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.cssSelector( "input[      id='btnLogin']")).click();


    }
}
