// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLastOnceTaskInfoRequest extends TeaModel {
    /**
     * <p>The source of the task.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The name of the task. Valid values:</p>
     * <br>
     * <p>*   **CLIENT\_PROBLEM_CHECK**: client diagnosis task</p>
     * <p>*   **CLIENT\_DEV_OPS**: O\&M task of Cloud Assistant</p>
     * <p>*   **ASSETS_COLLECTION**: asset collection task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the task. Valid values:</p>
     * <br>
     * <p>*   **CLIENT\_PROBLEM_CHECK**: client diagnosis task</p>
     * <p>*   **CLIENT\_DEV_OPS**: O\&M task of Cloud Assistant</p>
     * <p>*   **ASSETS\_COLLECTION**: asset collection task</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetLastOnceTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLastOnceTaskInfoRequest self = new GetLastOnceTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLastOnceTaskInfoRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetLastOnceTaskInfoRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public GetLastOnceTaskInfoRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
