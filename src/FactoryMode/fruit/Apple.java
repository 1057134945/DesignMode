package FactoryMode.fruit;

import FactoryMode.Fruit;

/**
 * 苹果
 */
public class Apple extends Fruit {

    public Apple() {
        setFruitName("苹果");
    }

    @Override
    public void eat() {
        System.out.println("吃" + this.getFruitName());
    }

}
