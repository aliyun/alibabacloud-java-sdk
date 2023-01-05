// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetTaskByUuidRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("WithConversations")
    public Boolean withConversations;

    public static GetTaskByUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskByUuidRequest self = new GetTaskByUuidRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskByUuidRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTaskByUuidRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetTaskByUuidRequest setWithConversations(Boolean withConversations) {
        this.withConversations = withConversations;
        return this;
    }
    public Boolean getWithConversations() {
        return this.withConversations;
    }

}
