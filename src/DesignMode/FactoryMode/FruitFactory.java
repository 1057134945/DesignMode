package DesignMode.FactoryMode;

import java.io.IOException;
import java.util.Map;

import utils.PropertiesReader;

/**
 * 水果工厂
 */
public class FruitFactory {

    public static Fruit getFruit(Class<?> clazz) {
        try {
            Fruit fruit = (Fruit) Class.forName(clazz.getName()).newInstance();
            return fruit;
        } catch (InstantiationException e) {
            System.err.println("水果工厂出错,实例化错误");
        } catch (IllegalAccessException e) {
            System.err.println("水果工厂出错,非法访问错误");
        } catch (ClassNotFoundException e) {
            System.err.println("水果工厂出错,类找不到错误");
        }
        return new Fruit();
    }

    public static Fruit getFruit(String fruitName) {
        try {
            Map<String, String> typeMap = new PropertiesReader().getProperties("FactoryType");
            Fruit fruit = (Fruit) Class.forName(typeMap.get(fruitName)).newInstance();
            return fruit;
        } catch (IOException e) {
            System.err.println("水果工厂出错,水果名错误");
        } catch (NullPointerException e) {
            System.err.println("水果工厂出错,水果名错误");
        } catch (InstantiationException e) {
            System.err.println("水果工厂出错,实例化错误");
        } catch (IllegalAccessException e) {
            System.err.println("水果工厂出错,非法访问错误");
        } catch (ClassNotFoundException e) {
            System.err.println("水果工厂出错,类找不到错误");
        }
        return new Fruit();
    }
}
