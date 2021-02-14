package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");
        //  String handle=    driver.getWindowHandle(); // when i use the get window handle it wii display parent browser
        // System.out.println(handle);// we can identify uniuqe values
        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
        Set<String> handle = driver.getWindowHandles();
        for (String h : handle) {
            //  System.out.println(h);
            String title = driver.switchTo().window(h).getTitle();
            // System.out.println(title);

            if (title.equals("Frames &Windows")) {
                driver.close();
            }

        }
    }
}










