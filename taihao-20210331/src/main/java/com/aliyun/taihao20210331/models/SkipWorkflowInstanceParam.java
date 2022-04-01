// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SkipWorkflowInstanceParam extends TeaModel {
    // ActivityIdCollectionRequiredSkip
    @NameInMap("ActivityIdCollectionRequiredSkip")
    public java.util.List<Long> activityIdCollectionRequiredSkip;

    // WorkflowInstanceId
    @NameInMap("WorkflowInstanceId")
    public Long workflowInstanceId;

    public static SkipWorkflowInstanceParam build(java.util.Map<String, ?> map) throws Exception {
        SkipWorkflowInstanceParam self = new SkipWorkflowInstanceParam();
        return TeaModel.build(map, self);
    }

    public SkipWorkflowInstanceParam setActivityIdCollectionRequiredSkip(java.util.List<Long> activityIdCollectionRequiredSkip) {
        this.activityIdCollectionRequiredSkip = activityIdCollectionRequiredSkip;
        return this;
    }
    public java.util.List<Long> getActivityIdCollectionRequiredSkip() {
        return this.activityIdCollectionRequiredSkip;
    }

    public SkipWorkflowInstanceParam setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

}
