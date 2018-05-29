package com.example.administrator.jingdong.kuangjia;

import com.example.administrator.jingdong.shouye.bean.Sousuoxiangqingbean;

import java.util.List;


public interface Isousuoxaingqing {
    String getname();
    void setmyadapter(List<Sousuoxiangqingbean.DataBean> data);
    void jiazaigengduo(List<Sousuoxiangqingbean.DataBean> data);
}
