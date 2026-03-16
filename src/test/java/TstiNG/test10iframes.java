package TstiNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test10iframes {

  WebDriver driver;
@BeforeClass
        public void part1()
{
    driver=new ChromeDriver();
    driver.get("https://vinothqaacademy.com/iframe/");

}

@Test
    public void navigationIframew(){
    //driver.switchTo().frame("iframe-container");
    driver.switchTo().frame("employeetable");
    driver.findElement(By.xpath("//input[@id='nameInput']")).sendKeys("saiganesh");
    driver.switchTo().defaultContent();
    driver.switchTo().frame("registeruser");
    driver.findElement(By.xpath("//li[@id=\"item-vfb-5\"]/input[@id=\"vfb-5\"]")).sendKeys("sai");
    driver.findElement(By.xpath("//input[@id=\"vfb-7\"]")).sendKeys("ganesh");
    driver.findElement(By.xpath("//span[@class=\"vfb-span\"]/input[@value=\"Other\"]")).click();
    driver.findElement(By.xpath("//input[@type=\"email\" and @id=\"vfb-14\"]")).sendKeys("sao@gmail.com");


    //disecting of an verifation process
    String ss=driver.findElement(By.xpath("//span[@class=\"vfb-span\"]/input[@id=\"vfb-3\"]/following-sibling::label\n")).getText();
    String[] ss2=ss.split(" ");
    driver.findElement(By.xpath("//span[@class=\"vfb-span\"]/input[@id=\"vfb-3\"]")).sendKeys(ss2[1]);


}










}
