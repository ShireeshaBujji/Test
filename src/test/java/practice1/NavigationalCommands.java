package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        // backward
       Thread.sleep(3000);
        driver.navigate().back();
        //forward
        Thread.sleep(3000);
        driver.navigate().forward();
        //refresh
        driver.navigate().refresh();
    }
}
