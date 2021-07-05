// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestartDedicatedHostResponseBody extends TeaModel {
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static RestartDedicatedHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartDedicatedHostResponseBody self = new RestartDedicatedHostResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartDedicatedHostResponseBody setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public RestartDedicatedHostResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public RestartDedicatedHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
