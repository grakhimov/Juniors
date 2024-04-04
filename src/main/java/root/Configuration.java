package root;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

    String token;
    String key;

    public String getToken() {
        return token;
    }

    public String getKey() {
        return key;
    }

    public Configuration init() {
        String configFilePath = "src/main/resources/application.properties";
        FileInputStream propsInput;
        Properties properties = new Properties();
        try {
            propsInput = new FileInputStream(configFilePath);
            properties.load(propsInput);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        token = properties.getProperty("token");
        key = properties.getProperty("key");
        return this;
    }
}
