package DesignMode.AdapterMode;

import vo.Vo1;

/**
 * 被适配的类
 */
public class Adaptee {

    public void adapteeRequest(Vo1 param) {
        System.out.println("被适配者的方法");
    }
}