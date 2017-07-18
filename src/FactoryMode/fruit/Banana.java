package FactoryMode.fruit;

import FactoryMode.Fruit;

/**
 * 香蕉
 */
public class Banana extends Fruit {

    public Banana() {
        setFruitName("香蕉");
    }

    @Override
    public void eat() {
        System.out.println("吃" + this.getFruitName());
    }

}
