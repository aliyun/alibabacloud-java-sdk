// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class StartTairKVCacheCustomInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>AD425AD3-CC7B-4EE2-A5CB-2F61BA73****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>11111****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StartTairKVCacheCustomInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartTairKVCacheCustomInstanceResponseBody self = new StartTairKVCacheCustomInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartTairKVCacheCustomInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartTairKVCacheCustomInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartTairKVCacheCustomInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
