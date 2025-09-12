// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateKnowLedgeShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static CreateKnowLedgeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowLedgeShrinkRequest self = new CreateKnowLedgeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowLedgeShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
