// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateEventsAttentionShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static UpdateEventsAttentionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventsAttentionShrinkRequest self = new UpdateEventsAttentionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventsAttentionShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
