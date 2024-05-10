// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateOnceTaskRequest extends TeaModel {
    /**
     * <p>The additional information.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The source of the scan task.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The name of the scan task. Valid values:</p>
     * <br>
     * <p>*   **CLIENT_PROBLEM_CHECK**: a client diagnosis task</p>
     * <p>*   **CLIENT_DEV_OPS**: an O\\&M task of Cloud Assistant</p>
     * <p>*   **ASSET_SECURITY_CHECK**: a task of asset information collection</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the scan task. Valid values:</p>
     * <br>
     * <p>*   **CLIENT_PROBLEM_CHECK**: a client diagnosis task</p>
     * <p>*   **CLIENT_DEV_OPS**: an O\\&M task of Cloud Assistant</p>
     * <p>*   **ASSET_SECURITY_CHECK**: a task of asset information collection</p>
     * <br>
     * <p>This parameter is required.</p>
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
