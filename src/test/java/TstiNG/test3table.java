package TstiNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test3table {

    WebDriver driver;

    @BeforeClass
    public void p1()
    {
        driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-table/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    @Test
    public void p2()
    {
        List<String> ss=new ArrayList<>();
        for(int i=1;i<10;i++)
        {
            //for(int j=1;j<7;j++)
            {
                String s="//table[@id=\"courses_table\"]/tbody/tr["+i+"]/td[2]";
                String b=driver.findElement(By.xpath(s)).getText();
                System.out.println(b);

                ss.add(b);
            }
        }
        Collections.sort(ss);
        System.out.println(ss);
    }

}
