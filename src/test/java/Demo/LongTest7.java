package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LongTest7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(("http://demo.automationtesting.in/Register.html"));
        Actions action = new Actions(driver);
       action.moveToElement(driver.findElement(By.xpath("//a[text()='Interactions ']"))).build().perform();
       action.moveToElement(driver.findElement(By.xpath("//a[text()='Drag and Drop ']"))).build().perform();
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Static ']"))).click().build().perform();
       Thread.sleep(5000);

      // driver.switchTo().frame(driver.findElement(By.id("aswift_2")));

//        WebElement popup = (driver.findElement(By.xpath("//div[@id='dismiss-button']//div/child::*"));
//        if (driver.findElement(By.xpath("//div[@id='dismiss-button']//div/child::*")).isDisplayed()){
            driver.findElement(By.xpath("//div[@id='dismiss-button']//div/child::*")).click();
//        }
    //    driver.switchTo().defaultContent();

     //   WebElement angular = driver.findElement(By.id("angular"));
    //    WebElement mango = driver.findElement(By.id("mongo"));
    //    WebElement droparea = driver.findElement(By.id("droparea"));

     //   action.dragAndDrop(angular,droparea).build().perform();
    }
}
