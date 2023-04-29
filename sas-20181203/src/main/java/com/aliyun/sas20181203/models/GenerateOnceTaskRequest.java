// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateOnceTaskRequest extends TeaModel {
    /**
     * <p>The collection time.</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The total number of scan tasks.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the last scan task.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>Indicates whether you can create more scan tasks. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     * <br>
     * <p>> By default, a maximum of 10 scan tasks can be running at the same time. If 10 image scan tasks are running, you cannot create a scan task by calling this operation. You must wait for at least one of the 10 existing scan tasks to complete before you can create a scan task.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GenerateOnceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateOnceTaskRequest self = new GenerateOnceTaskRequest();
        return TeaModel.build(map, self);
    }

    public GenerateOnceTaskRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public GenerateOnceTaskRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GenerateOnceTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public GenerateOnceTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
