// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReplaceDedicatedHostResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    public static ReplaceDedicatedHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceDedicatedHostResponseBody self = new ReplaceDedicatedHostResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceDedicatedHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReplaceDedicatedHostResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public ReplaceDedicatedHostResponseBody setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

}
