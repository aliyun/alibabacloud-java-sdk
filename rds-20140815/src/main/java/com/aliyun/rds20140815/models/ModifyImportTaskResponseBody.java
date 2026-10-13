// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyImportTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>069EB9B1-DE12-54B9-8C20-822****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the data import task.</p>
     * 
     * <strong>example:</strong>
     * <p>IMPORTING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>41698****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>task_1234</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static ModifyImportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyImportTaskResponseBody self = new ModifyImportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyImportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyImportTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyImportTaskResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ModifyImportTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
