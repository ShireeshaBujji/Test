package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Radio_Buttons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.get("http://demo.automationtesting.in/Register.html");
//        boolean btn = driver.findElement(By.xpath("//button[@id='idOfButton']")).isEnabled();
//        System.out.println("Button status : "+btn);
        WebElement radioButton = driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']"));
        boolean rbtn = radioButton.isSelected();
        System.out.println("Radio Button status : " + rbtn);
        if (rbtn == false) {
            radioButton.click();
        }
        rbtn = radioButton.isSelected();
        System.out.println("Radio Button status : " + rbtn);

        WebElement logo = driver.findElement(By.xpath("//img[@id='imagetrgt']"));
        boolean logoStatus = logo.isDisplayed();
        System.out.println("logo status : " + logoStatus);

        rbtn = radioButton.isSelected();
        System.out.println("Radio Button status : " + rbtn);


        WebElement checkboxes = driver.findElement(By.xpath("//input[@type='checkbox' and      @value='Cricket']"));
        boolean cbs = checkboxes.isSelected();
        System.out.println("check boxes status:" + cbs);
        if (cbs == false) {
            checkboxes.click();
        }
        cbs = checkboxes.isSelected();
        System.out.println("checkboxes:" + cbs);
    }

}
