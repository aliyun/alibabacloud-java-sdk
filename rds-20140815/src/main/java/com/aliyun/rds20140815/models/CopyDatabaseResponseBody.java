// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseResponseBody extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>test02</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The status of the database. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong></li>
     * <li><strong>Running</strong></li>
     * <li><strong>Deleting</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Creating</p>
     */
    @NameInMap("DBStatus")
    public String DBStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2562****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CopyDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyDatabaseResponseBody self = new CopyDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyDatabaseResponseBody setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CopyDatabaseResponseBody setDBStatus(String DBStatus) {
        this.DBStatus = DBStatus;
        return this;
    }
    public String getDBStatus() {
        return this.DBStatus;
    }

    public CopyDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyDatabaseResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
