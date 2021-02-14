package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;

public class LongTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://MySoftwares//drivers//chromeDriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword" )).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();

















    }
}
