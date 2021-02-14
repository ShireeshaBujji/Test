package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='No, thanks!']")).click();
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]")).click();
        driver.findElement(By.id("user-message")).sendKeys("hello india");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        String message = driver.findElement(By.id("display")).getText();
        System.out.println("Message : "+message);
//        driver.close();

    }

}
