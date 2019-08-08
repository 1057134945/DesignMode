package DesignMode.AdapterMode;

/**
 * 类适配器
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}