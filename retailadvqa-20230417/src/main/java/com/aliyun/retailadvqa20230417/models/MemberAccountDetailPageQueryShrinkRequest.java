// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class MemberAccountDetailPageQueryShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static MemberAccountDetailPageQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MemberAccountDetailPageQueryShrinkRequest self = new MemberAccountDetailPageQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MemberAccountDetailPageQueryShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
