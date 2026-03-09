package TstiNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class test7SpiceJet  {
    WebDriver driver;
    @BeforeClass
    public void p1(){
        driver=new ChromeDriver();
        driver.get("https://www.booking.com");
        driver.manage().window().maximize();


    }

    @Test
    public void p2(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));

       String xx="//div[@role=\"dialog\"]/div/div[1]/div[1]/div/div/button[@type=\"button\"]";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xx))).click();
       driver.findElement(By.xpath("(//a[@id='flights'])[1]")).click();
        //div[@class="AutoComplete-module__inputInner___4gegD"]/input[@aria-controls="flights-searchbox_suggestions"]
       WebElement goingPlace= driver.findElement(By.xpath("//button[@data-ui-name=\"input_location_to_segment_0\"]/div/span[2]"));
        //WebElement insidefeild= driver.findElement(By.xpath("//div[@class=\"AutoComplete-module__inputInner___4gegD\"]/input[@aria-controls=\"flights-searchbox_suggestions\"]"));

        WebElement Input=driver.findElement(By.xpath("//div[@data-ui-name=\"segment_origin_destination_0\"]/button[3]"));
        Actions actions = new Actions(driver);
        actions.click(Input)
                .sendKeys("del");





    }
}
