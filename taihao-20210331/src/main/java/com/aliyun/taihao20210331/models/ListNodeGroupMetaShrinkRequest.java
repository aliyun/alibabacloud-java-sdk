// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodeGroupMetaShrinkRequest extends TeaModel {
    // listNodeGroupMetaParam
    @NameInMap("listNodeGroupMetaParam")
    public String listNodeGroupMetaParamShrink;

    public static ListNodeGroupMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupMetaShrinkRequest self = new ListNodeGroupMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupMetaShrinkRequest setListNodeGroupMetaParamShrink(String listNodeGroupMetaParamShrink) {
        this.listNodeGroupMetaParamShrink = listNodeGroupMetaParamShrink;
        return this;
    }
    public String getListNodeGroupMetaParamShrink() {
        return this.listNodeGroupMetaParamShrink;
    }

}
