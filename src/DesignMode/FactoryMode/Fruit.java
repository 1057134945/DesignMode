package DesignMode.FactoryMode;

/**
 * 水果接口
 */
public class Fruit {

    private String fruitName;

    public Fruit() {
        this.fruitName = "水果";
    }

    public void eat() {
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
}
