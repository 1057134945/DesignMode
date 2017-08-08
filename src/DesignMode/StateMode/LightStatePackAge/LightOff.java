package DesignMode.StateMode.LightStatePackAge;

import DesignMode.StateMode.LightContext;
import DesignMode.StateMode.LightState;

/**  
 * 电灯具体状态类, 关
 */
public class LightOff implements LightState {

    /**      
     * 在关状态下，按下开关则切换到开的状态。 
     * @param light
     * @see DesignMode.StateMode.LightState#PressSwich(DesignMode.StateMode.LightContext)
     */ 
    @Override
    public void PressSwich(LightContext light) {
        System.out.println("Turn on the light.");
        light.setState(new LightOn());
    }

}
