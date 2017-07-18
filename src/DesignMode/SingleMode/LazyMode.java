package DesignMode.SingleMode;

/**
 * 懒汉模式(线程不安全)
 */
public class LazyMode {

    /**
     * 将构造方法私有化，不允许外部直接创建对象
     */
    private LazyMode() {
    }

    /**
     * 声明类的唯一实例，使用private static修饰
     */
    private static LazyMode instance;

    /**
     * 提供一个用于获取实例的方法，使用public static修饰
     * 
     * @return
     */
    public static LazyMode getInstance() {
        if (instance == null) {
            instance = new LazyMode();
        }
        return instance;
    }
}
