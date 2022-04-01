// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RestartWorkflowInstanceShrinkRequest extends TeaModel {
    @NameInMap("restartWorkflowInstanceParam")
    public String restartWorkflowInstanceParamShrink;

    public static RestartWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartWorkflowInstanceShrinkRequest self = new RestartWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RestartWorkflowInstanceShrinkRequest setRestartWorkflowInstanceParamShrink(String restartWorkflowInstanceParamShrink) {
        this.restartWorkflowInstanceParamShrink = restartWorkflowInstanceParamShrink;
        return this;
    }
    public String getRestartWorkflowInstanceParamShrink() {
        return this.restartWorkflowInstanceParamShrink;
    }

}
