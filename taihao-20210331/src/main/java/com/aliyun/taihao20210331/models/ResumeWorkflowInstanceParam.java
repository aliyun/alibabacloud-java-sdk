// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ResumeWorkflowInstanceParam extends TeaModel {
    // 工作流实例Id
    @NameInMap("workflowInstanceId")
    public Long workflowInstanceId;

    public static ResumeWorkflowInstanceParam build(java.util.Map<String, ?> map) throws Exception {
        ResumeWorkflowInstanceParam self = new ResumeWorkflowInstanceParam();
        return TeaModel.build(map, self);
    }

    public ResumeWorkflowInstanceParam setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

}
