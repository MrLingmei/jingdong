package com.example.administrator.jingdong.kuangjia;

import com.example.administrator.jingdong.bean.Sousuobean;

import java.util.List;


public interface Isousuo {
    String getid();
    void setadapter(List<Sousuobean.DataBean> data);
    void jiazai(List<Sousuobean.DataBean> data);
}
