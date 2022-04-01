// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RestartWorkflowInstanceParam extends TeaModel {
    // 工作流实例Id
    @NameInMap("workflowInstanceId")
    public Long workflowInstanceId;

    public static RestartWorkflowInstanceParam build(java.util.Map<String, ?> map) throws Exception {
        RestartWorkflowInstanceParam self = new RestartWorkflowInstanceParam();
        return TeaModel.build(map, self);
    }

    public RestartWorkflowInstanceParam setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

}
