package TstiNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testP1 {
    WebDriver driver=new ChromeDriver();

    @BeforeMethod
    public void p1(){
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");

    }
    @Test
    public void p2(){
        String st="Google";
        Assert.assertEquals(st,driver.getTitle());
        driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]")).sendKeys("dog");

    }
    @AfterMethod
    public void p3(){
        driver.quit();
    }

}
