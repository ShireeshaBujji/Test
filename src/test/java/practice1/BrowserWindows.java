package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindows {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Register.html");
      String titlename=  driver.getTitle();
      System.out.println("title of this page:"+titlename);
     String  currentpage =  driver.getCurrentUrl();
     System.out.println("url of this page :"+currentpage);
    String pagesource= driver.getPageSource();
    System.out.println("url source :"+pagesource);







    }
}
