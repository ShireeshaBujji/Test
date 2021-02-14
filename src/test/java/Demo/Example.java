package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("http://demo.automationtesting.in/Register.html"));
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sirisha");
        driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("seshu");


        Thread.sleep(3000);
        driver.findElement(By.id("msdd")).click();
        Thread.sleep(3000);
        List<WebElement> lang = driver.findElements(By.xpath("//li[@class='ng-scope']/a"));

        for (int i= 0; i<lang.size();i++){
            if(lang.get(i).getText().equalsIgnoreCase("English") || lang.get(i).getText().equalsIgnoreCase("Hindi")){
                lang.get(i).click();
            }
        }

        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("knpalyam");
        driver.findElement(By.xpath("//input [@type='email']")).sendKeys("sirishabujji598@gmail.com");
        driver.findElement(By.xpath("//input [@ng-model='Phone']")).sendKeys("9846328675");
        driver.findElement(By.xpath("//input[@value='FeMale']")).click();
        driver.findElement(By.xpath("//input[@value='Movies']")).click();
//        driver.findElement(By.xpath("//label[text()='languages']")).click();

//        Thread.sleep(3000);
//        driver.findElement(By.id("msdd")).click();
//        Thread.sleep(3000);
//        List<WebElement> lang = driver.findElements(By.xpath("//li[@class='ng-scope']/a"));
//
//        for (int i= 0; i<lang.size();i++){
//            if(lang.get(i).getText().equalsIgnoreCase("English") || lang.get(i).getText().equalsIgnoreCase("Hindi")){
//                lang.get(i).click();
//            }
//        }

        Select skill = new Select(driver.findElement(By.id("Skills")));
        skill.selectByIndex(3);
        Select country= new Select(driver.findElement(By.id("countries")));
        country.selectByValue("Algeria");
        Thread.sleep(3000);
       // Select dropdown2 = new Select(driver.findElement());
        driver.findElement(By.xpath("//span[@id='select2-country-container']/..")).click();
        List<WebElement> countrey = driver.findElements(By.xpath("//ul[@id='select2-country-results']/li[@aria-selected='false']"));

        for(int i=0; i<countrey.size();i++){
            if (countrey.get(i).getText().equalsIgnoreCase("India")){
                countrey.get(i).click();
                break;
            }
        }

Thread.sleep(3000);

        Select year = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
        year.selectByIndex(2);
        Select month = new Select(driver.findElement(By.xpath("// select[@ng-model='monthbox']")));
        month.selectByIndex(4);
        Select day = new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
        day.selectByIndex(3);
        driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("siri@123");
        driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("siri@123");
        driver.findElement(By.xpath("//button[@name='signup']")).click();








    }
}
