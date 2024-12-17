// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RestartTairKVCacheCustomInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>tc-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>5D622714-AEDD-4609-9167-F5DDD3D1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>578678678</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RestartTairKVCacheCustomInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartTairKVCacheCustomInstanceResponseBody self = new RestartTairKVCacheCustomInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartTairKVCacheCustomInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RestartTairKVCacheCustomInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartTairKVCacheCustomInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
