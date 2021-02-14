package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
      //  driver.findElement(By.id("txtUsername")).clear();
    boolean d =    driver.findElement(By.id("btnLogin")).isDisplayed();
    boolean e = driver.findElement(By.id("btnLogin")).isEnabled();
    boolean s = driver.findElement(By.id("btnLogin")).isSelected();
    System.out.println("is displayed:"+d);
        System.out.println("is enabled :"+ e);
        System.out.println("isSelected :"+s);
      String str=  driver.findElement(By.linkText("Forgot your password?")).getText();
      System.out.println("link Text is:" +str);




    }
}
