// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOnceTaskResultInfoRequest extends TeaModel {
    /**
     * <p>The number of tasks that were completed.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The ID of the scan task.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetOnceTaskResultInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOnceTaskResultInfoRequest self = new GetOnceTaskResultInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetOnceTaskResultInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetOnceTaskResultInfoRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public GetOnceTaskResultInfoRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
