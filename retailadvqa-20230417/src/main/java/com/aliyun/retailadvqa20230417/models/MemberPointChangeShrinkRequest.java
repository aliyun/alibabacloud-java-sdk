// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class MemberPointChangeShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static MemberPointChangeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MemberPointChangeShrinkRequest self = new MemberPointChangeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MemberPointChangeShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
