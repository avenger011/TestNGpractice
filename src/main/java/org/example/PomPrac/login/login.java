package org.example.PomPrac.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class  login {
    WebDriver driver;

    public login(WebDriver driver)
    {
        this.driver=driver;
    }

    By NameV= By.xpath("//input[@name=\"username\"]");
    By PassV=By.xpath("//input[@name=\"password\"]");
    By Submit=By.xpath("//button[@type=\"submit\"]");


    public void part1(String user,String pas)
    {
          WaitHelper waitHelper=new WaitHelper();
          waitHelper.VisibleWait(driver,NameV,10);
          //VisibleWait(driver,NameV,10);
          driver.findElement(NameV).sendKeys("");        //--------------->
          driver.findElement(PassV).sendKeys("");
          driver.findElement(Submit).click();

    }



}


//    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
//        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Hacker@4321");
//        driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
//





