package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebElements {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
   driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
   driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
   driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
   driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
    WebElement  admin=   driver.findElement(By.xpath("//b[text()='Admin']"));
     WebElement management=   driver.findElement(By.xpath("//a[text()='User Management']"));
     WebElement  users=  driver.findElement(By.xpath("//a[text()='Users']"));
        Actions act = new Actions(driver);
        act.moveToElement(admin).moveToElement(management).moveToElement(users).click().build().perform();
        List<WebElement> headers = driver.findElements(By.xpath("//div[@id='tableWrapper']/table/thead/tr/th"));
        for(int i = 1; i< headers.size(); i++){
            System.out.print( headers.get(i).getText()+"    ");
        }
        System.out.println("");

        List<WebElement> tvalues = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        List<WebElement> tColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td"));
        for(int j =1; j<tvalues.size(); j++){
            for (int k =1; k<tColumn.size(); k++){
                String column = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+j+"]/td["+k+"]")).getText();
                System.out.print(column+"    ");
            }
            System.out.println("");
        }


    }
}
