package com.tcsl.brvahdemo.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * 实体类必须实现MultiItemEntity，在设置数据的时候，需要给每一个数据设置itemType
 */
public class MultipleItem implements MultiItemEntity {
    //两种文字类型
    public static final int TEXT = 1;
    public static final int TEXT2 = 2;
    private int itemType;

    public MultipleItem(int itemType) {
        this.itemType = itemType;
    }

    @Override
    public int getItemType() {
        return itemType;
    }
}