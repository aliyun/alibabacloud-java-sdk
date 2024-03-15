// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class AllocateInstancePublicConnectionResponseBody extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public Long taskId;

    public static AllocateInstancePublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateInstancePublicConnectionResponseBody self = new AllocateInstancePublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateInstancePublicConnectionResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public AllocateInstancePublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocateInstancePublicConnectionResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
