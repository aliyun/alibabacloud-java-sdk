// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class SaveAutomlJobIdRequest extends TeaModel {
    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("TaskId")
    public Long taskId;

    public static SaveAutomlJobIdRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAutomlJobIdRequest self = new SaveAutomlJobIdRequest();
        return TeaModel.build(map, self);
    }

    public SaveAutomlJobIdRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public SaveAutomlJobIdRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public SaveAutomlJobIdRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
