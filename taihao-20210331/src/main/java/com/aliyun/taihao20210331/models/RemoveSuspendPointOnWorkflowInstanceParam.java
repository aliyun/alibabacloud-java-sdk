// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RemoveSuspendPointOnWorkflowInstanceParam extends TeaModel {
    // workflowInstanceId
    @NameInMap("workflowInstanceId")
    public Long workflowInstanceId;

    public static RemoveSuspendPointOnWorkflowInstanceParam build(java.util.Map<String, ?> map) throws Exception {
        RemoveSuspendPointOnWorkflowInstanceParam self = new RemoveSuspendPointOnWorkflowInstanceParam();
        return TeaModel.build(map, self);
    }

    public RemoveSuspendPointOnWorkflowInstanceParam setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

}
