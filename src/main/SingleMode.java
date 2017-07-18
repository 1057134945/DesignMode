package main;

import DesignMode.SingleMode.HungerMode;
import DesignMode.SingleMode.LazyMode;

/**  
 * 单例模式
 * 应用场合：有些对象只需要一个就足够了
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉模式、懒汉模式
 * 区别：饿汉模式的特点是加载类时比较慢，但运行时获取对象的速度比较快，线程安全
 *     懒汉模式的特点是加载类时比较快，但运行时获取对象的速度比较慢，线程不安全
 */
public class SingleMode {
    public static void main(String[] args) {
        // 饿汉模式
        HungerMode hungerMode1 = HungerMode.getInstance();
        HungerMode hungerMode2 = HungerMode.getInstance();
        if (hungerMode1 == hungerMode2) {
            System.out.println("hungerMode1\t和 hungerMode2\t是同一个实例");
        } else {
            System.out.println("hungerMode1\t和 hungerMode2\t不是同一个实例");
        }
        // 懒汉模式
        LazyMode lazyMode1 = LazyMode.getInstance();
        LazyMode lazyMode2 = LazyMode.getInstance();
        if (lazyMode1 == lazyMode2) {
            System.out.println("lazyMode1\t和 lazyMode2\t是同一个实例");
        } else {
            System.out.println("lazyMode1\t和 lazyMode2\t不是同一个实例");
        }
    }
}
