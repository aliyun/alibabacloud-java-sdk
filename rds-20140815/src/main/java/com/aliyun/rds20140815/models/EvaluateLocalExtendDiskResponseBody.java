// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class EvaluateLocalExtendDiskResponseBody extends TeaModel {
    /**
     * <p>Specifies whether to query the virtual IP addresses of only healthy CDN POPs. Valid values:</p>
     * <br>
     * <p>*   **on**: healthy CDN edge nodes.</p>
     * <p>*   **off**: all CDN edge nodes.</p>
     */
    @NameInMap("Available")
    public String available;

    /**
     * <p>The ID of the RDS instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The data migration method of the instance. This parameter is available only for instances that are created in dedicated clusters. Valid values:</p>
     * <br>
     * <p>*   **0** (default): The system preferentially upgrades or downgrades the instance without a migration. If the resources on the host on which the instance resides are insufficient, the system migrates the instance to another suitable host.</p>
     * <p>*   **1**: The system upgrades or downgrades the instance without a migration. If the upgrade or downgrade is not supported, the system reports an error.</p>
     * <p>*   **2**: The system migrates the data of the instance from the host on which the instance resides to another host. You must also specify **DedicatedHostGroupId**, **TargetDedicatedHostIdForMaster**, and **TargetDedicatedHostIdForSlave**. If you set DBInstanceTransType to 2, you cannot migrate the data of the instance to the host on which the instance resides. If you migrate the data of the instance to the host on which the instance resides, the migration fails.</p>
     */
    @NameInMap("DBInstanceTransType")
    public String DBInstanceTransType;

    /**
     * <p>Local Disk Restrictions.</p>
     */
    @NameInMap("LocalUpgradeDiskLimit")
    public Long localUpgradeDiskLimit;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EvaluateLocalExtendDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EvaluateLocalExtendDiskResponseBody self = new EvaluateLocalExtendDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public EvaluateLocalExtendDiskResponseBody setAvailable(String available) {
        this.available = available;
        return this;
    }
    public String getAvailable() {
        return this.available;
    }

    public EvaluateLocalExtendDiskResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public EvaluateLocalExtendDiskResponseBody setDBInstanceTransType(String DBInstanceTransType) {
        this.DBInstanceTransType = DBInstanceTransType;
        return this;
    }
    public String getDBInstanceTransType() {
        return this.DBInstanceTransType;
    }

    public EvaluateLocalExtendDiskResponseBody setLocalUpgradeDiskLimit(Long localUpgradeDiskLimit) {
        this.localUpgradeDiskLimit = localUpgradeDiskLimit;
        return this;
    }
    public Long getLocalUpgradeDiskLimit() {
        return this.localUpgradeDiskLimit;
    }

    public EvaluateLocalExtendDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
