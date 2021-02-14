package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckboxes {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        WebElement radiobutton = driver.findElement(By.xpath("//input[@value='FeMale']"));

        radiobutton.click();
        WebElement checkboxes = driver.findElement(By.xpath("//input[@value='Cricket']"));
        checkboxes.click();
        WebElement checkboxes1 = driver.findElement(By.xpath("//input[@value='Movies']"));
        System.out.println("rbtn:"+ radiobutton.isSelected());
        System.out.println("cbs:"+ checkboxes.isSelected());
        System.out.println("cbs1:"+ checkboxes1.isSelected());


    }
}
