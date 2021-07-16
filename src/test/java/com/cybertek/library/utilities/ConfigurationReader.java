package com.cybertek.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

        //#1 create properties object
        private static Properties properties = new Properties();

        static {
            //#2 - Load the file info FileInputStream
            try {
                FileInputStream file = new FileInputStream("configuration.properties");

                //#3 - load properties object with the file (conf.prop)
                properties.load(file);

                //close the file
                file.close();
            } catch (IOException e) {
                System.out.println("File not found in Configuration properties.");
            }
        }
        // use the above created logic to create a re-usable static method

        public static String getProperty (String keyWord) {
            return properties.getProperty(keyWord);
        }


    }

