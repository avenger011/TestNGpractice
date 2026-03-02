package TstiNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class testp2Login {

    WebDriver driver;

    @BeforeClass
    public void p1()
    {
        driver=new ChromeDriver();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    @Test
    public void p2()
    {
       WebElement sign_button= driver.findElement(By.xpath("//p/button[text()=\"Sign Up\"]"));
       sign_button.click();
    }

    @Test
    public void p3()
    {
        WebElement name= driver.findElement(By.xpath("//div/input[@placeholder=\"John Doe\"]"));
        name.sendKeys("dondon");
        WebElement email=driver.findElement(By.xpath("(//input[@placeholder='you@example.com'])[1]"));
        email.sendKeys("sg@gmail.com");
        WebElement pass=driver.findElement(By.xpath("(//input[@placeholder='••••••••'])[1]"));
        pass.sendKeys("passssssssss");
        driver.findElement(By.xpath("(//button[normalize-space()='Create Account'])[1]")).submit();


    }

    @Test
    public void p4()
    {
        driver.findElement(By.xpath("//button[text()=\"Transfer Funds\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"relative\"]/input[@placeholder=\"0.00\"]")).sendKeys("35000");
        driver.findElement(By.xpath("(//button[normalize-space()='Continue'])[1]")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='Confirm Transfer'])[1]")).click();
    }



}

