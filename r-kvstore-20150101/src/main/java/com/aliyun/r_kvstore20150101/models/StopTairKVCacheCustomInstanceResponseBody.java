// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class StopTairKVCacheCustomInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>tc-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>20C8341E-B5AD-4B24-BD82-D73241522ABF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>578678678</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StopTairKVCacheCustomInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopTairKVCacheCustomInstanceResponseBody self = new StopTairKVCacheCustomInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopTairKVCacheCustomInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopTairKVCacheCustomInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopTairKVCacheCustomInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
