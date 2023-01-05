// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobGroupExportTaskProgressRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskId")
    public String taskId;

    public static DescribeJobGroupExportTaskProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobGroupExportTaskProgressRequest self = new DescribeJobGroupExportTaskProgressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobGroupExportTaskProgressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeJobGroupExportTaskProgressRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
