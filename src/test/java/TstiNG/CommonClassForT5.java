package TstiNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonClassForT5 {
    public WebDriver driver;

    public void openpage(String link){
        driver=new ChromeDriver();
        driver.get(link);
        driver.manage().window().maximize();

    }

    public void waitFindPut(String xpathhofele,String key){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathhofele))).sendKeys(key);

    }
}
