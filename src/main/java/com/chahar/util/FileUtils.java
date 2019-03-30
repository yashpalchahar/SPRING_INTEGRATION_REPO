package com.chahar.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileUtils {

    public static Properties readPropFromFile(String fileName){
        Properties props = new Properties();
        try {
            final String propFileLocation = FileUtils.class.getClassLoader()
                    .getResource(fileName).getFile();

            System.out.println("prop file location: " + propFileLocation);

            FileInputStream propInputStream =  new FileInputStream(new File(propFileLocation));
            props.load(propInputStream);

            System.out.println("Loaded properties: " + props.stringPropertyNames() +" from file: "+ propFileLocation);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return props;
    }

}
