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
    public Map<String, String> getProperties(String propsName) throws IOException {
        Properties props = new Properties();
        Map<String, String> map = new HashMap<String, String>();
        InputStream in = getClass().getResourceAsStream(propsName + ".properties");
        props.load(in);
        Enumeration<?> en = props.propertyNames();
        while (en.hasMoreElements()) {
            String key = (String) en.nextElement();
            String property = props.getProperty(key);
            map.put(key, property);
            System.out.println(key + "<====>" + property);
        }
        return map;
    }
}
