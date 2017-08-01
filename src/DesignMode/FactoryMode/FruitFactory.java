package DesignMode.FactoryMode;

import java.io.IOException;

import utils.PropertiesReader;

/**
 * 水果工厂
 */
public class FruitFactory {

    public static Fruit getFruit(Class<?> clazz) throws Exception {
        try {
            return (Fruit) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            System.err.println("水果工厂出错,实例化错误");
            throw new Exception("水果工厂出错,实例化错误");
        } catch (IllegalAccessException e) {
            System.err.println("水果工厂出错,非法访问错误");
            throw new Exception("水果工厂出错,非法访问错误");
        } catch (ClassNotFoundException e) {
            System.err.println("水果工厂出错,类找不到错误");
            throw new Exception("水果工厂出错,类找不到错误");
        }
    }

    public static Fruit getFruit(String fruitName) throws Exception {
        try {
            return (Fruit) Class.forName(PropertiesReader.getInstance(fruitName)).newInstance();
        } catch (IOException e) {
            System.err.println("水果工厂出错," + e);
            throw new Exception("水果工厂出错,{}", e);
        } catch (NullPointerException e) {
            System.err.println("水果工厂出错,水果名错误");
            throw new Exception("水果工厂出错,水果名错误");
        } catch (InstantiationException e) {
            System.err.println("水果工厂出错,实例化错误");
            throw new Exception("水果工厂出错,实例化错误");
        } catch (IllegalAccessException e) {
            System.err.println("水果工厂出错,非法访问错误");
            throw new Exception("水果工厂出错,非法访问错误");
        } catch (ClassNotFoundException e) {
            System.err.println("水果工厂出错,类找不到错误");
            throw new Exception("水果工厂出错,类找不到错误");
        }
    }
}
