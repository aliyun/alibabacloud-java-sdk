// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListWorkflowActivityInstancesParam extends TeaModel {
    // 工作流实例Id
    @NameInMap("workflowInstanceId")
    public Long workflowInstanceId;

    public static ListWorkflowActivityInstancesParam build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowActivityInstancesParam self = new ListWorkflowActivityInstancesParam();
        return TeaModel.build(map, self);
    }

    public ListWorkflowActivityInstancesParam setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

}
