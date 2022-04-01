// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetWorkflowDefinitionParam extends TeaModel {
    // 工作流定义Id
    @NameInMap("workflowDefinitionId")
    public Long workflowDefinitionId;

    public static GetWorkflowDefinitionParam build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDefinitionParam self = new GetWorkflowDefinitionParam();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDefinitionParam setWorkflowDefinitionId(Long workflowDefinitionId) {
        this.workflowDefinitionId = workflowDefinitionId;
        return this;
    }
    public Long getWorkflowDefinitionId() {
        return this.workflowDefinitionId;
    }

}
