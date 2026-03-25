package org.example.PomPrac.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverHelper {
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public static WebDriver driver;

    public static String Browserdriv(String browser)
    {  String message;
        switch (browser)
        {
            case "chrome":
                driver=new ChromeDriver();
                return  message="the browser is chorme";

            case "edge":
                driver=new EdgeDriver();
                return message="the browser is edge";
            default:
                return message=null;


        }



    }

}
