package org.example.PomPrac.test;

import org.example.PomPrac.login.login;
import org.example.PomPrac.login.propertyfile;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {
    WebDriver driver;

    @Test
    public void test1(){
        driver=new ChromeDriver();
        driver.get(propertyfile.run("URL"));
        login ll=new login(driver);
        ll.part1(propertyfile.run("ID"),propertyfile.run("PASS"));


    }
}
