// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class ValidateKnowLedgeShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static ValidateKnowLedgeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateKnowLedgeShrinkRequest self = new ValidateKnowLedgeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ValidateKnowLedgeShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
