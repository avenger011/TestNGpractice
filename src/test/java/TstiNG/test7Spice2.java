package TstiNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class test7Spice2 {
    WebDriver driver;
    @BeforeClass
    public void p1(){
        driver=new ChromeDriver();
        driver.get("https://www.booking.com");
        driver.manage().window().maximize();


    }

    @Test
    public void test1(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));

        String xx="//div[@role=\"dialog\"]/div/div[1]/div[1]/div/div/button[@type=\"button\"]";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xx))).click();
        driver.findElement(By.xpath("(//a[@id='flights'])[1]")).click();  //flight click

        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@role='combobox']"))).sendKeys("del");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[6]"))).click();

        driver.findElement(By.xpath("//button[@data-ui-name=\"button_search_submit\"]")).click();

    }
}
