// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSTaskLogRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetDWSTaskLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSTaskLogRequest self = new GetDWSTaskLogRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSTaskLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSTaskLogRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
