// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateReplicationLinkResponseBody extends TeaModel {
    /**
     * <p>The instance ID of the disaster recovery instance.</p>
     * 
     * <strong>example:</strong>
     * <p>PostgreSQL：pgm-<strong><strong>.pg.rds.aliyuncs.com
     * SQL Server：92</strong></strong></p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>442FC501-C4DD-1349-B70A-DE13D189072E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>159****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>zbtest</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateReplicationLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReplicationLinkResponseBody self = new CreateReplicationLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReplicationLinkResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateReplicationLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateReplicationLinkResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public CreateReplicationLinkResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
