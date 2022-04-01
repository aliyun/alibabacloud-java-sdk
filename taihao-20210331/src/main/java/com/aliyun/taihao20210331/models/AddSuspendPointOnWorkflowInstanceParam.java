// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class AddSuspendPointOnWorkflowInstanceParam extends TeaModel {
    // 最后一个暂停点所在的活动实例Id
    @NameInMap("lastSuspendActivityInstanceId")
    public Long lastSuspendActivityInstanceId;

    // 是否闭空间
    @NameInMap("rangeClosed")
    public Boolean rangeClosed;

    // 工作流实例Id
    @NameInMap("workflowInstanceId")
    public Long workflowInstanceId;

    public static AddSuspendPointOnWorkflowInstanceParam build(java.util.Map<String, ?> map) throws Exception {
        AddSuspendPointOnWorkflowInstanceParam self = new AddSuspendPointOnWorkflowInstanceParam();
        return TeaModel.build(map, self);
    }

    public AddSuspendPointOnWorkflowInstanceParam setLastSuspendActivityInstanceId(Long lastSuspendActivityInstanceId) {
        this.lastSuspendActivityInstanceId = lastSuspendActivityInstanceId;
        return this;
    }
    public Long getLastSuspendActivityInstanceId() {
        return this.lastSuspendActivityInstanceId;
    }

    public AddSuspendPointOnWorkflowInstanceParam setRangeClosed(Boolean rangeClosed) {
        this.rangeClosed = rangeClosed;
        return this;
    }
    public Boolean getRangeClosed() {
        return this.rangeClosed;
    }

    public AddSuspendPointOnWorkflowInstanceParam setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

}
