// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLastOnceTaskInfoRequest extends TeaModel {
    /**
     * <p>The number of tasks that have been completed.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the latest scan task.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The total number of entries returned.</p>
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
