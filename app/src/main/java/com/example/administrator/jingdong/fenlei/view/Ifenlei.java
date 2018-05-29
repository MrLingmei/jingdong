package com.example.administrator.jingdong.fenlei.view;

import com.example.administrator.jingdong.fenlei.bean.Feileirightbean;
import com.example.administrator.jingdong.shouye.bean.Feileileftbean;

import java.util.List;



public interface Ifenlei {
    void setleftadapter(List<Feileileftbean.DataBean> data);

    void setrightadapter(List<Feileirightbean.DataBean> data);
}
