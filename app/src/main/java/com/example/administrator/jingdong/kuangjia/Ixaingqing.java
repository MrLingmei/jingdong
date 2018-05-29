package com.example.administrator.jingdong.kuangjia;

import com.example.administrator.jingdong.bean.Shop_xiangqing;


public interface Ixaingqing {
    String getpid();
   void getxiangqingjson(Shop_xiangqing.DataBean data);

   //添加购物车成功
    void chenggong(String s);

}
