package TstiNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test5 extends CommonClassForT5 {

    @Test
    public void p1(){
        openpage("https://awesomeqa.com/hr/web/index.php/auth/login");
        waitFindPut("//input[@name=\"username\"]","admin");
        waitFindPut("//input[@name=\"password\"]","Hacker@4321");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
    }
}
