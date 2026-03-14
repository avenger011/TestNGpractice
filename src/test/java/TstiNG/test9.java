package TstiNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;             //put in vwo login and upload file
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class test9 {

    WebDriver driver;

    @BeforeClass
    public void p1(){

        driver=new ChromeDriver();
        driver.manage().window().maximize();


    }

    @Test
    public void p2() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(27));
        driver.get("https://app.vwo.com/");
        //name
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"login-username\"]"))).sendKeys("meswfw9608@supermmw.online");
        //password
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"login-password\"]"))).sendKeys("bqVki#5EhJtb-95");
        //submit
        driver.findElement(By.xpath("//button[@type=\"submit\" and @data-qa=\"sibequkica\"]")).click();
//click on settings
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='navbar-btn-label ng-binding'][normalize-space()='Settings'])[2]"))).click();
        //click on profile details

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label=\"Profile details\"]"))).click();

        //upload button cklick
        WebElement uploadele=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@id='profile-picture-upload'])[1]")));

         uploadele.sendKeys("C:\\Users\\ganesh\\Pictures\\Screenshots\\Screenshot (19).png");

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@vwo-async-click=\"vm.uploadProfilePic()\"]"))).click();




             //meswfw9608@supermmw.online
             //bqVki#5EhJtb-95
        }

    }




