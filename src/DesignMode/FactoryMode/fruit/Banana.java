package DesignMode.FactoryMode.fruit;

import DesignMode.FactoryMode.Fruit;

/**
 * 香蕉
 */
public class Banana extends Fruit {

    public Banana() {
        setFruitName("香蕉");
    }

    @Override
    public void eat() {
        System.out.println("-" + this.getFruitName() + "-");
        System.out.println("拨皮");
        System.out.println("吃");
        System.out.println();
    }
}
