// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class GetTaskStatusRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static GetTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusRequest self = new GetTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetTaskStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
