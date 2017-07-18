package main;

import DesignMode.FactoryMode.Fruit;
import DesignMode.FactoryMode.FruitFactory;

/**
 * 工厂模式
 */
public class FactoryMode {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.getFruit("apple");
        fruit.eat();
        fruit = FruitFactory.getFruit("banana");
        fruit.eat();
    }
}
