package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        WebElement rightClickButton= driver.findElement(By.cssSelector(".context-menu-one"));
        act.contextClick(rightClickButton).build().perform();
        WebElement copy= driver.findElement(By.cssSelector(".context-menu-icon-copy"));
       String copyText= copy.getText();
       System.out.println(copyText);
       copy.click();


    }
}
