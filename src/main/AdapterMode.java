package main;

import DesignMode.AdapterMode.ClassAdapter;
import DesignMode.AdapterMode.DateAdapter;
import DesignMode.AdapterMode.Target;

/**
 * 适配器模式
 */
public class AdapterMode {
    public static void main(String[] args) {
        // 类适配器
        Target classAdapterTarget = new ClassAdapter();
        classAdapterTarget.request();
        // 对象适配器
        Target dataAdapterTarget = new DateAdapter();
        dataAdapterTarget.request();
    }
}
