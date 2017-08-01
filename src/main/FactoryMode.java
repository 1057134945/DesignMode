package main;

import DesignMode.FactoryMode.Fruit;
import DesignMode.FactoryMode.FruitFactory;

/**
 * 工厂模式
 */
public class FactoryMode {
    public static void main(String[] args) {
        Fruit fruit;
        try {
            fruit = FruitFactory.getFruit("apple");
            fruit.eat();
        } catch (Exception e) {
            System.out.println("水果获取错误" + e);
        }
        try {
            fruit = FruitFactory.getFruit("banana");
            fruit.eat();
        } catch (Exception e) {
            System.out.println("水果获取错误" + e);
        }
    }
}
