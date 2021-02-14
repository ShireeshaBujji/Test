package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LongTest5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("siri");
        driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("reddy");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("k.npalyam");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pandu@gmail.com");
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9121744760");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//input[@value='Cricket']")).click();
        Select dropdown1 = new Select(driver.findElement(By.id("Skills")));
        dropdown1.selectByIndex(4);
        Select select=new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
        select.selectByValue("1999");
        Select sd= new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
        sd.selectByValue("April");
        Select sd1 = new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
        sd1.selectByIndex(2);
      //  Select dropdown2 = new Select(driver.findElement(By.xpath("//Select[@ng-model='country']")));
     //   dropdown2.selectByValue("Afghanistan");
       List<WebElement>list1= dropdown1.getOptions();
        int size = list1.size();
       // System.out.println(size);
        for(int i = 0; i<size; i++){
            String optvalue=list1.get(i).getText();
            System.out.println(optvalue);
        }



            driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("sreddy@123");
            driver.findElement(By.xpath("//[input ng-model='CPassword')]")).sendKeys("r@123");





        }

    }


