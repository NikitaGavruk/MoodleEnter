package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertiesReader {
    public static String getUserName() {
        getProperties();
        return getProperties().getProperty("moodleUsername");
    }

    public static String getPassword() {
        getProperties();
        return getProperties().getProperty("moodlePassword");
    }

    public static String getMoodleLink() {
        getProperties();
        return getProperties().getProperty("moodleLink");
    }

    public static Properties getProperties() {
        String appConfigPath = "./src/test/resources/config.properties";
        Properties appProps = new Properties();
        try {
            appProps.load(new FileInputStream(appConfigPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appProps;

    }

}
