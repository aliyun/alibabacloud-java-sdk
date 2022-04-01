// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceShrinkRequest extends TeaModel {
    @NameInMap("getWorkflowInstanceParam")
    public String getWorkflowInstanceParamShrink;

    public static GetWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceShrinkRequest self = new GetWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceShrinkRequest setGetWorkflowInstanceParamShrink(String getWorkflowInstanceParamShrink) {
        this.getWorkflowInstanceParamShrink = getWorkflowInstanceParamShrink;
        return this;
    }
    public String getGetWorkflowInstanceParamShrink() {
        return this.getWorkflowInstanceParamShrink;
    }

}
