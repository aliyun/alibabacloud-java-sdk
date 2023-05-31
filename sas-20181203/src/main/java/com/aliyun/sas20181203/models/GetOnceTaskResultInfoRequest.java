// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOnceTaskResultInfoRequest extends TeaModel {
    /**
     * <p>The ID of the scan task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The name of the task. Valid values:</p>
     * <br>
     * <p>*   **CLIENT\_PROBLEM_CHECK**: a task of the Security Center agent</p>
     * <p>*   **CLIENT\_DEV_OPS**: an O\&M task of Cloud Assistant</p>
     * <p>*   **ASSET\_SECURITY_CHECK**: a task of asset information collection</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the task. Valid values:</p>
     * <br>
     * <p>*   **CLIENT\_PROBLEM_CHECK**: a task of the Security Center agent</p>
     * <p>*   **CLIENT\_DEV_OPS**: an O\&M task of Cloud Assistant</p>
     * <p>*   **ASSET\_SECURITY_CHECK**: a task of asset information collection</p>
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
