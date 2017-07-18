package SingleMode;

/**
 * 饿汉模式(线程安全)
 */
public class HungerMode {

    /**
     * 将构造方法私有化，不允许外部直接创建对象
     */
    private HungerMode() {
    }

    /**
     * 创建类的唯一实例，使用private static修饰
     */
    private static HungerMode instance = new HungerMode();

    /**
     * 提供一个用于获取实例的方法，使用public static修饰
     * 
     * @return
     */
    public static HungerMode getInstance() {
        return instance;
    }
}
