package org.example.PomPrac.login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {
    public static String run(String key) {
        Properties p;
        String firdt_halfpat=System.getProperty("user.dir");
        String file_path=firdt_halfpat+"/src/main/java/org/example/PomPrac/data.properties";
        //String path = "C:\Users\ganesh\IdeaProjects\TestNGpractice/src/main/java/org/example/PomPrac/data.properties";
        FileInputStream fileInputStream;

        {
            try {
                fileInputStream = new FileInputStream(file_path);
                p=new Properties();
                p.load(fileInputStream);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        return p.getProperty(key);
    }
}
