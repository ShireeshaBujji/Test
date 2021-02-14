import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
       // driver.switchTo().alert().accept(); // closes alert window by using ok button
        driver.switchTo().alert().dismiss();
    }
}
