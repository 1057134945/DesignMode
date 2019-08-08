package DesignMode.AdapterMode;

import com.google.gson.Gson;

import vo.Vo1;
import vo.Vo2;

/**
 * 对象适配器
 */
public class DateAdapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request(String json) {
        Vo2 v2 = new Gson().fromJson(json, Vo2.class);
        adaptee.adapteeRequest(new Vo1(v2.getTelNo(), v2.getIdCard(), v2.getName()));
    }
}