// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pxc-hzjasd****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>polarx-kernel_5.4.7-16001481_xcluster-20200910</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <strong>example:</strong>
     * <p>422922413</p>
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
