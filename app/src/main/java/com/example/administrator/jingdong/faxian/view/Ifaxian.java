package com.example.administrator.jingdong.faxian.view;

import com.example.administrator.jingdong.faxian.bean.User;

import java.util.List;



public interface Ifaxian {
    void setmyadapter(List<User.DataBean> data);

    void jiazaigengduo(List<User.DataBean> data);
}
