package main;

import DesignMode.StateMode.LightContext;
import DesignMode.StateMode.LightStatePackAge.LightOff;

/**
 * 状态模式
 */
public class StateMode {

    public static void main(String[] args) {
        // 初始化电灯，原始状态为关
        LightContext light = new LightContext(new LightOff());
        int num = 1;
        while (true) {
            System.out.print("No." + String.format("%1$05d", num) + " : ");
            light.PressSwich();
            num++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.exit(0);
            }
        }
    }

}
