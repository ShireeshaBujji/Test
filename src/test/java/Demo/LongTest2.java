package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LongTest2 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://fb.com");

        driver.findElement(By.id("email")).sendKeys("sirishabujji598@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("sreddy@123");
        driver.findElement(By.name("login")).click();
        driver.close();


    }
}
