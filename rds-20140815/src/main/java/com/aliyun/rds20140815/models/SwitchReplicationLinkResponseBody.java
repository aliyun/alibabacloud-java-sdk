// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchReplicationLinkResponseBody extends TeaModel {
    /**
     * <p>The ID of the DR instance.</p>
     * 
     * <strong>example:</strong>
     * <p>135****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2F2DD69B-90AF-1E72-923C-87575658A9D9</p>
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

    public static SwitchReplicationLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchReplicationLinkResponseBody self = new SwitchReplicationLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchReplicationLinkResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public SwitchReplicationLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchReplicationLinkResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public SwitchReplicationLinkResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
