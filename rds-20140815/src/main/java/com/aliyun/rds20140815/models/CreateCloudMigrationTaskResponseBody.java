// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateCloudMigrationTaskResponseBody extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The name of the task.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateCloudMigrationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudMigrationTaskResponseBody self = new CreateCloudMigrationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudMigrationTaskResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateCloudMigrationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloudMigrationTaskResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public CreateCloudMigrationTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
