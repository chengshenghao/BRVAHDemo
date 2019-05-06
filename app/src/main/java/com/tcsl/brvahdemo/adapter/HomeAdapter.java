package com.tcsl.brvahdemo.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tcsl.brvahdemo.R;

import java.util.List;

/**
 * 描述:文字显示适配器
 * <p/>作者：ss
 * <br/>创建时间：2019/5/6 10: 30
 */

public class HomeAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public HomeAdapter(@Nullable List<String> data) {
        super(R.layout.item_text, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_text, item)
                .setText(R.id.tv_child, item + "点击我啊")
                .addOnClickListener(R.id.tv_child)
                .addOnLongClickListener(R.id.tv_child);
    }
}
