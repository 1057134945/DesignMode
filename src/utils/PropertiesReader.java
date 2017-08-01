package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Properties资源文件读取工具
 */
public class PropertiesReader {

    private static Map<String, String> instance;

    private PropertiesReader() {
    }

    public static String getInstance(String name) throws IOException {
        if (instance == null) {
            instance = new PropertiesReader().getProperties();
        }
        return instance.get(name);
    }

    private Map<String, String> getProperties() throws IOException {
        Properties props = new Properties();
        Map<String, String> map = new HashMap<String, String>();
        InputStream in = PropertiesReader.class.getClassLoader().getResourceAsStream("Type.properties");
        props.load(in);
        Enumeration<?> en = props.propertyNames();
        while (en.hasMoreElements()) {
            String key = (String) en.nextElement();
            String property = props.getProperty(key);
            map.put(key, property);
            System.out.println(key + "<====>" + property);
        }
        System.out.println("====================================================================");
        return map;
    }
}
