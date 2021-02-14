package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Windows_handle {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("http://demo.automationtesting.in/Windows.html"));
        String parent = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();
        Thread.sleep(5000);
        Set<String> child = driver.getWindowHandles();
        for (String childs : child){
            if(!parent.equals(childs)){
                driver.switchTo().window(childs);
            }
        }
       String heading = driver.findElement(By.xpath("//h1[1]")).getText();
        System.out.println("Heading : "+ heading);



    }

}
