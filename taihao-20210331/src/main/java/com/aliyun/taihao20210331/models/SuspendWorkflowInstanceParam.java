// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SuspendWorkflowInstanceParam extends TeaModel {
    // 工作流实例Id
    @NameInMap("workflowInstanceId")
    public Long workflowInstanceId;

    public static SuspendWorkflowInstanceParam build(java.util.Map<String, ?> map) throws Exception {
        SuspendWorkflowInstanceParam self = new SuspendWorkflowInstanceParam();
        return TeaModel.build(map, self);
    }

    public SuspendWorkflowInstanceParam setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

}
