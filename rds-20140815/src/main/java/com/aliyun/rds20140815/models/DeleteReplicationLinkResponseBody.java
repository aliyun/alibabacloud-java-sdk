// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteReplicationLinkResponseBody extends TeaModel {
    /**
     * <p>The ID of the DR instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1trqb4p1xd****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>847BA085-B377-4BFA-8267-F82345ECE1D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3472****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DeleteReplicationLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteReplicationLinkResponseBody self = new DeleteReplicationLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteReplicationLinkResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteReplicationLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteReplicationLinkResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DeleteReplicationLinkResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
