package com.tcsl.brvahdemo.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tcsl.brvahdemo.R;
import com.tcsl.brvahdemo.bean.MultipleItem;

import java.util.List;

/**
 * 描述:文字显示适配器
 * <p/>作者：ss
 * <br/>创建时间：2019/5/6 10: 30
 */

public class HomeAdapter extends BaseMultiItemQuickAdapter<MultipleItem, BaseViewHolder> {
    //实体类必须实现MultiItemEntity，在设置数据的时候，需要给每一个数据设置itemType
    //在构造里面addItemType绑定type和layout的关系
    public HomeAdapter(@Nullable List<MultipleItem> data) {
        super(data);
        addItemType(MultipleItem.TEXT, R.layout.item_text);
        addItemType(MultipleItem.TEXT2, R.layout.item_text2);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultipleItem item) {
        switch (helper.getItemViewType()) {
            case MultipleItem.TEXT:
                helper.setText(R.id.tv_text, "ss")
                        .setText(R.id.tv_child, "点击我啊")
                        .addOnClickListener(R.id.tv_child)
                        .addOnLongClickListener(R.id.tv_child);
                break;
            case MultipleItem.TEXT2:
                helper.setText(R.id.tv_text, "ss+ss");
                break;
        }

    }
}
