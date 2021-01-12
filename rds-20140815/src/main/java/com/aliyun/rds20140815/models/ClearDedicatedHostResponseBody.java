// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ClearDedicatedHostResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    public static ClearDedicatedHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearDedicatedHostResponseBody self = new ClearDedicatedHostResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearDedicatedHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClearDedicatedHostResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ClearDedicatedHostResponseBody setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

}
