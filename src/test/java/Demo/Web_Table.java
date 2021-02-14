package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Web_Table {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.get("http://money.rediff.com/gainers/base/daily/groupa?src=gain_lose");
         List<WebElement> theaders = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
         List<WebElement> tRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
         List<WebElement> tColumn = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));

         Thread.sleep(5000);
         for (int i=0; i<theaders.size(); i++){
             System.out.println("Table Heading : "+theaders.get(i).getText());
             for (int j=1; j<tRows.size(); j++){
                 for (int k=1; k<tColumn.size(); k++) {
                     String column = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+j+"]/td["+k+"]")).getText();
                     System.out.println("Column : " + k + " : "+column);
                 }
             }
             System.out.println("\n Next \n");
         }

    }

}
