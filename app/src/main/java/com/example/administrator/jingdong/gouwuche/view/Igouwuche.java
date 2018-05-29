package com.example.administrator.jingdong.gouwuche.view;

import android.content.Context;

import com.example.administrator.jingdong.gouwuche.bean.Gouwuche;

import java.util.List;


public interface Igouwuche {
    void setadapter(Context context, List<Gouwuche.DataBean> data);
    void heji();
}
