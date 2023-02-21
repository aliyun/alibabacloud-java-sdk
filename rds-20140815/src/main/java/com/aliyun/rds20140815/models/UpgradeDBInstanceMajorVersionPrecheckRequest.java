// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceMajorVersionPrecheckRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>The instance must meet the following requirements:</p>
     * <br>
     * <p>*   The instance runs PostgreSQL 12, PostgreSQL 11, PostgreSQL 10, or PostgreSQL 9.4.</p>
     * <p>*   The instance runs RDS High-availability Edition or RDS Basic Edition.</p>
     * <p>*   The instance resides in a virtual private cloud (VPC). If the instance resides in the classic network, you must migrate the instance to a VPC before you call this operation. For more information about how to view or change the network type of an instance, see [Change the network type of an ApsaraDB RDS for PostgreSQL instance](~~96761~~).</p>
     * <p>*   The instance cannot be a read-only instance and cannot be created in a dedicated cluster.</p>
     * <p>*   The ID of the instance does not start with `pg-cn`.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The new major engine version of the instance. The new major engine version must be later than the original major engine version.</p>
     * <br>
     * <p>For example, if the original major engine version is PostgreSQL 9.4, the new major engine version can be PostgreSQL 10, PostgreSQL 11, PostgreSQL 12, or PostgreSQL 13.</p>
     */
    @NameInMap("TargetMajorVersion")
    public String targetMajorVersion;

    public static UpgradeDBInstanceMajorVersionPrecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceMajorVersionPrecheckRequest self = new UpgradeDBInstanceMajorVersionPrecheckRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceMajorVersionPrecheckRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBInstanceMajorVersionPrecheckRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeDBInstanceMajorVersionPrecheckRequest setTargetMajorVersion(String targetMajorVersion) {
        this.targetMajorVersion = targetMajorVersion;
        return this;
    }
    public String getTargetMajorVersion() {
        return this.targetMajorVersion;
    }

}
