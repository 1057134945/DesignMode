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

    private static Map<String, String> instance = new PropertiesReader().getProperties();

    private PropertiesReader() {
    }

    public static String getInstance(String name) throws IOException {
        return instance.get(name);
    }

    private Map<String, String> getProperties() {
        Properties props = new Properties();
        Map<String, String> map = new HashMap<String, String>();
        InputStream in = PropertiesReader.class.getClassLoader().getResourceAsStream("Type.properties");
        try {
            props.load(in);
            Enumeration<?> en = props.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String property = props.getProperty(key);
                map.put(key, property);
                System.out.println(key + "<====>" + property);
            }
        } catch (IOException e) {
        }
        System.out.println("====================================================================");
        return map;
    }
}
