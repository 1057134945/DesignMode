package DesignMode.FactoryMode;

/**
 * 水果接口
 */
public abstract class Fruit {

    private String fruitName;

    public abstract void eat();

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
}
