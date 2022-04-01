// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetWorkflowDefinitionShrinkRequest extends TeaModel {
    // 获取工作流定义对象
    @NameInMap("getWorkflowDefinitionParam")
    public String getWorkflowDefinitionParamShrink;

    public static GetWorkflowDefinitionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDefinitionShrinkRequest self = new GetWorkflowDefinitionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDefinitionShrinkRequest setGetWorkflowDefinitionParamShrink(String getWorkflowDefinitionParamShrink) {
        this.getWorkflowDefinitionParamShrink = getWorkflowDefinitionParamShrink;
        return this;
    }
    public String getGetWorkflowDefinitionParamShrink() {
        return this.getWorkflowDefinitionParamShrink;
    }

}
