package DesignMode.AdapterMode;

import com.google.gson.Gson;

import vo.Vo1;
import vo.Vo2;

/**
 * 类适配器
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request(String json) {
        Vo2 v2 = new Gson().fromJson(json, Vo2.class);
        super.adapteeRequest(new Vo1(v2.getTelNo(), v2.getIdCard(), v2.getName()));
    }
}