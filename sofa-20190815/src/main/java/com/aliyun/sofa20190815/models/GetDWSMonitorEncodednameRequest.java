// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSMonitorEncodednameRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetDWSMonitorEncodednameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSMonitorEncodednameRequest self = new GetDWSMonitorEncodednameRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSMonitorEncodednameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSMonitorEncodednameRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
