// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bpxxxxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DA2ECBA0-4745-4491-9166-799FF8984AC9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The new minor engine version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>xcluster80_20210305</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>226917****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpgradeDBInstanceKernelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceKernelVersionResponseBody self = new UpgradeDBInstanceKernelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceKernelVersionResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpgradeDBInstanceKernelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeDBInstanceKernelVersionResponseBody setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    public UpgradeDBInstanceKernelVersionResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
