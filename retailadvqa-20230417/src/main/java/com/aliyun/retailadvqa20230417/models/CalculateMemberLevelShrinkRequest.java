// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class CalculateMemberLevelShrinkRequest extends TeaModel {
    @NameInMap("Body")
    public String bodyShrink;

    public static CalculateMemberLevelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CalculateMemberLevelShrinkRequest self = new CalculateMemberLevelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CalculateMemberLevelShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
