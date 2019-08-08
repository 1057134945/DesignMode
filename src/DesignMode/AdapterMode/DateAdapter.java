package DesignMode.AdapterMode;

/**
 * 对象适配器
 */
public class DateAdapter implements Target {
    
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}