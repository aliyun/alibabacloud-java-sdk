// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseResponseBody extends TeaModel {
    @NameInMap("DBName")
    public String DBName;

    @NameInMap("DBStatus")
    public String DBStatus;

    @NameInMap("RequestId")
    public String requestId;

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
