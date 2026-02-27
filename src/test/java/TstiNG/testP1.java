package TstiNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testP1 {
    WebDriver driver;

    @BeforeMethod
    public void p1(){
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");

    }
    @Test
    public void p2(){
        String st="Google";
        Assert.assertEquals(st,driver.getTitle());
       WebElement searchbar= driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]"));
       searchbar.sendKeys("dog");
        searchbar.submit();

    }

    @Test
    public void p3(){
        WebElement searchbar= driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]"));
        searchbar.submit();
   }

    @AfterMethod
    public void p4(){
        driver.quit();
    }

}
