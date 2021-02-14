package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogAndDropConcept {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement sourceElement= driver.findElement(By.id("draggable"));
        WebElement targetElement=driver.findElement(By.id("droppable"));
        Actions act = new Actions(driver);
        act.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();


    }

}
