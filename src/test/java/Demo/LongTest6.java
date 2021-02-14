package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LongTest6 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://fb.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       // driver.close();
        driver.navigate().to("https://www.google.com/gmail/about/");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();

    }
}
