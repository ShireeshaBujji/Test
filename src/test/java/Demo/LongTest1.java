package Demo;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LongTest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Thydula");
        driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Shireesha");

        driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("sirishabujji598@gmail.com");
        driver.findElement(By.xpath("//input[@ng-model= 'Phone']")).sendKeys("9121744760");
        driver.findElement(By.id("firstpassword")).sendKeys("12345@");
        driver.findElement(By.id("secondpassword")).sendKeys("14356786");
        driver.findElement(By.id("submitbtn")).click();
      //  driver.findElement(By.xpath("//button[@values='Refresh']")).click();

        List<WebElement> radio = driver.findElements(By.xpath("//input[@name='radiooptions']"));

//        for (int i=0 ; i<radio.size();i++){
//            System.out.println("Gender : "+ radio.get(i).getText());
//            if(radio.get(i).getText().equalsIgnoreCase("FeMale")){
//                radio.get(i).click();
//            }
//        }

        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("checkbox1")).click();
       driver.close();


    }
}









