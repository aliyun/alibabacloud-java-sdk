// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartDBInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Integer taskId;

    @NameInMap("MigrationId")
    @Validation(required = true)
    public Integer migrationId;

    public static StartDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDBInstanceResponse self = new StartDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartDBInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartDBInstanceResponse setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public StartDBInstanceResponse setMigrationId(Integer migrationId) {
        this.migrationId = migrationId;
        return this;
    }
    public Integer getMigrationId() {
        return this.migrationId;
    }

}
