package DesignMode.FactoryMode.fruit;

import DesignMode.FactoryMode.Fruit;

/**
 * 苹果
 */
public class Apple extends Fruit {

    public Apple() {
        setFruitName("苹果");
    }

    @Override
    public void eat() {
        System.out.println("-" + this.getFruitName() + "-");
        System.out.println("洗");
        System.out.println("削皮");
        System.out.println("吃");
        System.out.println();
    }
}
