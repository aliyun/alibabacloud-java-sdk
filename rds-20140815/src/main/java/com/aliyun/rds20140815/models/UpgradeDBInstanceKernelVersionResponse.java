// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceName")
    @Validation(required = true)
    public String DBInstanceName;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("TargetMinorVersion")
    @Validation(required = true)
    public String targetMinorVersion;

    public static UpgradeDBInstanceKernelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceKernelVersionResponse self = new UpgradeDBInstanceKernelVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceKernelVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeDBInstanceKernelVersionResponse setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpgradeDBInstanceKernelVersionResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpgradeDBInstanceKernelVersionResponse setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

}
