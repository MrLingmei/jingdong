package com.example.administrator.jingdong.wode.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;



public class Myadapter extends RecyclerView.Adapter<Myadapter.Myhodler> {

    @Override
    public Myhodler onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(Myhodler holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class Myhodler extends RecyclerView.ViewHolder{
        public Myhodler(View itemView) {
            super(itemView);
        }
    }
}
