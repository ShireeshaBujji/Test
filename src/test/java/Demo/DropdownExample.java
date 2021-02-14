package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownExample {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
    Select s = new Select(    driver.findElement(By.xpath("//select[@id='first']")));
  //  s.selectByIndex(2);
        List<WebElement>list1= s.getOptions();
       // int size = list1.size();
      //  System.out.println(size);
      //  for(int i = 0; i< list1.size(); i++){
       //     String s1 = list1.get(i).getText();
        //    System.out.println(s1);
        String s2 = list1.get(2).getText();
        System.out.println(s2);
        WebElement element = driver.findElement(By.xpath(" //select[@id='animals']"));
        Select s4= new Select(element);
        s4.selectByValue("babycat");

        }






    }

