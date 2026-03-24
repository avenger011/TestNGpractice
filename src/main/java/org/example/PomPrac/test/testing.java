package org.example.PomPrac.test;

import org.example.PomPrac.login.DriverHelper;
import org.example.PomPrac.login.login;
import org.example.PomPrac.login.propertyfile;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.example.PomPrac.login.DriverHelper.driver;

public class testing {

    Logger logger= LogManager.getLogger(testing.class);
    @Test
    public void test1(){
        //DriverHelper.Browserdriv(propertyfile.run("BROW"));
         String status=DriverHelper.Browserdriv(propertyfile.run("BROW"));

         if(status==null)
         {
             logger.info("the browser is nulllll");
         }
         else{
            logger.info(status);
        }
        logger.info("starting of new");

        driver.get(propertyfile.run("URL"));
        login ll=new login(driver);
        ll.part1(propertyfile.run("ID"),propertyfile.run("PASS"));


    }
}
