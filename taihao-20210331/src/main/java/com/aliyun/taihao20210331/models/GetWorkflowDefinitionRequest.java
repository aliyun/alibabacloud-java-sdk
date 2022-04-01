// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetWorkflowDefinitionRequest extends TeaModel {
    // 获取工作流定义对象
    @NameInMap("getWorkflowDefinitionParam")
    public GetWorkflowDefinitionParam getWorkflowDefinitionParam;

    public static GetWorkflowDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDefinitionRequest self = new GetWorkflowDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDefinitionRequest setGetWorkflowDefinitionParam(GetWorkflowDefinitionParam getWorkflowDefinitionParam) {
        this.getWorkflowDefinitionParam = getWorkflowDefinitionParam;
        return this;
    }
    public GetWorkflowDefinitionParam getGetWorkflowDefinitionParam() {
        return this.getWorkflowDefinitionParam;
    }

}
