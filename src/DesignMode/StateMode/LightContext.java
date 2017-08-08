package DesignMode.StateMode;

/**
 * 电灯Context
 */
public class LightContext {

    private LightState state;

    public LightContext(LightState state) {
        this.state = state;
    }

    /**
     * 按下电灯开关
     */
    public void PressSwich() {
        state.PressSwich(this);
    }

    public LightState getState() {
        return state;
    }

    public void setState(LightState state) {
        this.state = state;
    }
}
