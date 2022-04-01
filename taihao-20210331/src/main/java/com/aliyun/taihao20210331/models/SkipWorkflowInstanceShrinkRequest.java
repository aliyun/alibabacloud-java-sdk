// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SkipWorkflowInstanceShrinkRequest extends TeaModel {
    // SkipWorkflowInstanceParam
    @NameInMap("skipWorkflowInstanceParam")
    public String skipWorkflowInstanceParamShrink;

    public static SkipWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipWorkflowInstanceShrinkRequest self = new SkipWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SkipWorkflowInstanceShrinkRequest setSkipWorkflowInstanceParamShrink(String skipWorkflowInstanceParamShrink) {
        this.skipWorkflowInstanceParamShrink = skipWorkflowInstanceParamShrink;
        return this;
    }
    public String getSkipWorkflowInstanceParamShrink() {
        return this.skipWorkflowInstanceParamShrink;
    }

}
