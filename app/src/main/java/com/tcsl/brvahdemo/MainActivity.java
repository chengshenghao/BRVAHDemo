package com.tcsl.brvahdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tcsl.brvahdemo.adapter.HomeAdapter;
import com.tcsl.brvahdemo.bean.MultipleItem;

import java.util.ArrayList;

/**
 * 描述:主界面
 * <p/>作者：ss
 * <br/>创建时间：2019/5/6 10: 20
 */

public class MainActivity extends AppCompatActivity {

    private MultipleItem multipleItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<MultipleItem> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            if (i > 10) {
                multipleItem = new MultipleItem(1);
            } else {
                multipleItem = new MultipleItem(2);
            }
            list.add(multipleItem);
        }
        HomeAdapter homeAdapter = new HomeAdapter(list);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(homeAdapter);
        //条目点击
        homeAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, position + "", Toast.LENGTH_SHORT).show();
            }
        });
        //条目长按
        homeAdapter.setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, "onItemLongClick" + position, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        //子控件点击
        homeAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, "onItemChildClick" + position, Toast.LENGTH_SHORT).show();
            }
        });
        //子控件长按
        homeAdapter.setOnItemChildLongClickListener(new BaseQuickAdapter.OnItemChildLongClickListener() {
            @Override
            public boolean onItemChildLongClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, "onItemChildLongClick" + position, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        //添加列表加载动画  默认提供5种方法（渐显、缩放、从下到上，从左到右、从右到左）
        homeAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
    }
}
