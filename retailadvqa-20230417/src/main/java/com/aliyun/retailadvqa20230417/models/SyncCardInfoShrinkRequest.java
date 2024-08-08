// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class SyncCardInfoShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static SyncCardInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncCardInfoShrinkRequest self = new SyncCardInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SyncCardInfoShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
