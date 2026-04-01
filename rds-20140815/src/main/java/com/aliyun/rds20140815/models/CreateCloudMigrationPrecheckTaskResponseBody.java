// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateCloudMigrationPrecheckTaskResponseBody extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp102g323jd4****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>60F9A12A-16B8-4728-B099-4CA38D32C31C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>439946016</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>slf7w7wj3g</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateCloudMigrationPrecheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudMigrationPrecheckTaskResponseBody self = new CreateCloudMigrationPrecheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudMigrationPrecheckTaskResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateCloudMigrationPrecheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloudMigrationPrecheckTaskResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public CreateCloudMigrationPrecheckTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
