package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


        WebElement source = driver.findElement(By.xpath(" //div[text()='Rome']"));
        WebElement destination = driver.findElement(By.xpath("//div[text()='Italy']"));
       // act.clickAndHold(source).moveToElement(destination).release().build().perform();
        act.dragAndDrop(source,destination).build().perform();

    }
}







