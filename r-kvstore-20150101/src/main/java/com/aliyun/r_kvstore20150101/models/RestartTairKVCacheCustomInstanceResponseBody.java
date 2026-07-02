// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RestartTairKVCacheCustomInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

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
