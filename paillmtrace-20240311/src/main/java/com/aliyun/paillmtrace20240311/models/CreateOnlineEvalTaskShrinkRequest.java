// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class CreateOnlineEvalTaskShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static CreateOnlineEvalTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOnlineEvalTaskShrinkRequest self = new CreateOnlineEvalTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOnlineEvalTaskShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
