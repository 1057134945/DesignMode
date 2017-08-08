package DesignMode.StateMode;

/**  
 * 电灯状态接口
 */
public interface LightState {
    public abstract void PressSwich(LightContext light);
}
