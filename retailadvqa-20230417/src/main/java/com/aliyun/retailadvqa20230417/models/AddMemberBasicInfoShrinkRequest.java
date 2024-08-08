// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class AddMemberBasicInfoShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static AddMemberBasicInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMemberBasicInfoShrinkRequest self = new AddMemberBasicInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddMemberBasicInfoShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
