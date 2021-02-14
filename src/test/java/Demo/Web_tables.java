package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Web_tables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));


        for (int i = 1; i<= rows.size(); i++) {


            for (int j = 1; j<= columns.size(); j++) {


                String values = driver.findElement(By.xpath("// table[@id='task-table']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                System.out.print(values+ "      ");
            }
            System.out.println();

        }
    }
}
