// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class SyncMemberBehaviorInfoShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static SyncMemberBehaviorInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncMemberBehaviorInfoShrinkRequest self = new SyncMemberBehaviorInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SyncMemberBehaviorInfoShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
