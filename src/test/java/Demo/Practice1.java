package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args){
        System. setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testandquiz.com/selenium/testing.html");
    }
}
