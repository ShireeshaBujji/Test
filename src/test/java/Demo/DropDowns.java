package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("siri");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("reddy");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("knpalyam");
        driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("sirishabujji598@gmail.com");
driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9463764532");
driver.findElement(By.xpath("//input[@value='Male']")).click();
driver.findElement(By.xpath("//label[text()= ' Cricket ']")).click();
      Select s= new Select( driver.findElement(By.id("//select[@id='Skills']")));
      s.selectByIndex(2);
      Select s1 = new Select(driver.findElement(By.xpath("//select[@ id='yearbox']")));
      s1.selectByValue("1917");
      Select s3 = new Select(driver.findElement(By.id("daybox")));
      s3.selectByIndex(4);





    }

}
