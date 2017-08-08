package DesignMode.StateMode.LightStatePackAge;

import DesignMode.StateMode.LightContext;
import DesignMode.StateMode.LightState;

/**  
 * 电灯具体状态类, 开
 */
public class LightOn implements LightState {

    /**      
     * 在开状态下，按下开关则切换到关的状态。 
     * @param light
     * @see DesignMode.StateMode.LightState#PressSwich(DesignMode.StateMode.LightContext)
     */ 
    @Override
    public void PressSwich(LightContext light) {
        System.out.println("Turn off the light.");
        light.setState(new LightOff());
    }

}
