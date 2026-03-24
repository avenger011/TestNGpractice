package TstiNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;         //this project fetches the temp mail id and paste in flipkart p[age
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class test8email {
    WebDriver driver;

    @BeforeClass
    public void p1(){

        driver=new ChromeDriver();
        driver.manage().window().maximize();


    }

    @Test
    public void p2() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://www.1secmail.cc/en");
        Thread.sleep(10000);
       String email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"mainEmail\"]"))).getAttribute("value");

        driver.get("http://flipkart.com/");
        Actions action=new Actions(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@class='xkp9Hl ZvCKfk'])[1]"))).sendKeys(email);
        //driver.findElement(By.xpath("(//input[@class='xkp9Hl ZvCKfk'])[1]")).sendKeys(email);

    }
}
