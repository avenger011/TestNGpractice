package TstiNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;

public class


test6Shoppig extends CommonClassForT5{

    @Test
    public void p1()
    {
        openpage("https://www.flipkart.com/search?q=macmini&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
       // String name = "(//div[@class='RGLWAk']/a[2])["+i+"]";
        //String rate = "//(//div[@class=\'RGLWAk\']/a[@class=\'fb4uj3\'])["+i+"]";
        //             int
    }

    @Test
    public void p2(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        int a=0;
        Map<String,Integer> ss=new HashMap<>();
        List<WebElement> eleme=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("(//div[@class='RGLWAk']/a[2])")));
        for (int i=1;i<=eleme.size();i++)
        {  String hname = "(//div[@class='RGLWAk']/a[2])["+i+"]";

          if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(hname))).getText().contains("Mac"))
          {   String  name=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(hname))).getText();

              String Srate="(//div[@class='RGLWAk']/a[@class='fb4uj3'])["+i+"]/div/div[1]";
              String Ssrate=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Srate))).getText();
              int rate=Integer.parseInt(Ssrate.replaceAll("[^0-9]", ""));
              ss.put(name,rate);

          }

        }
        System.out.println(ss);
        List<Integer> ratelist=new ArrayList<>(ss.values());
        Collections.sort(ratelist);
        int so=ratelist.get(0);
        for (Map.Entry<String,Integer> entry : ss.entrySet())
        {
           if(entry.getValue().equals(so))
           { System.out.println("the cheapet mac is "+entry.getKey());};
        }



    }

    @Test
    public void p3()
    {

    }




}
