// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The migration task ID. This parameter is available only for instances that are created in dedicated clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>740</p>
     */
    @NameInMap("MigrationId")
    public Integer migrationId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A417FB41-A3D9-464E-AD0A-C7FE05C72E98</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>238028563</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static StartDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDBInstanceResponseBody self = new StartDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDBInstanceResponseBody setMigrationId(Integer migrationId) {
        this.migrationId = migrationId;
        return this;
    }
    public Integer getMigrationId() {
        return this.migrationId;
    }

    public StartDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartDBInstanceResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
