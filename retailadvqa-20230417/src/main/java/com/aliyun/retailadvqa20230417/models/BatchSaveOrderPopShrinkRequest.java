// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class BatchSaveOrderPopShrinkRequest extends TeaModel {
    @NameInMap("Orders")
    public String ordersShrink;

    public static BatchSaveOrderPopShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSaveOrderPopShrinkRequest self = new BatchSaveOrderPopShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchSaveOrderPopShrinkRequest setOrdersShrink(String ordersShrink) {
        this.ordersShrink = ordersShrink;
        return this;
    }
    public String getOrdersShrink() {
        return this.ordersShrink;
    }

}
