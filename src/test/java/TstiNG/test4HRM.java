package TstiNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class test4HRM {
    WebDriver driver;

    @BeforeClass
    public void p1() {
        driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

    }

    @Test
    public void p2() {
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
    }
     @Test
    public void p3() {
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']"))).click();
        for(int i=2;i<30;i++)
        {   String st="(//div[@role='row'])["+i+"]/div[6]";
            String mm=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(st))).getText();
            if(mm.equalsIgnoreCase("Terminated"))
            {  String sa="(//div[@role='row'])["+i+"]/div[3]";
                String ss=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sa))).getText();
                System.out.println("name of terminated employe is "+ss);
            }
        }
         }






}




