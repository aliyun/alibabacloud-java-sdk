// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If your instance runs PostgreSQL, you must make sure that the instance uses **cloud disks**. If the instance is equipped with local disks, you must call the [RestartDBInstance](~~26230~~) operation to restart the instance. The system automatically updates the instance to the latest minor engine version during the restart.</p>
     * <br>
     * <p>*   If your instance runs SQL Server, you must make sure that the instance runs SQL Server 2019.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The update time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> This parameter takes effect only when you set **UpgradeTime** to **SpecifyTime**.</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The minor engine version to which you want to update the instance. Format:</p>
     * <br>
     * <p>*   **PostgreSQL**: `rds_postgres_<Major engine version>00_<Minor engine version>`. Example: `rds_postgres_1200_20200830`.</p>
     * <br>
     * <p>*   **MySQL**: `<RDS edition and MySQL version>_<Minor engine version>`. Examples: `rds_20200229`, `xcluster_20200229`, and `xcluster80_20200229`. The following RDS editions and MySQL versions are supported:</p>
     * <br>
     * <p>    *   **rds**: The instance runs RDS Basic Edition or RDS High-availability Edition.</p>
     * <p>    *   **xcluster**: The instance runs MySQL 5.7 on RDS Enterprise Edition.</p>
     * <p>    *   **xcluster80**: The instance runs MySQL 8.0 on RDS Enterprise Edition.</p>
     * <br>
     * <p>*   **SQLServer**: `<Minor engine version>`. Example: `15.0.4073.23`.</p>
     * <br>
     * <p>If you do not specify this parameter, the instance is updated to the latest minor engine version.</p>
     * <br>
     * <p>> For more information about minor engine versions, see [Release notes of minor AliPG versions](~~126002~~), [Release notes of minor AliSQL versions](~~96060~~), and [Release notes of minor engine versions of ApsaraDB RDS for SQL Server](~~213577~~).</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The time when the update takes effect. Valid values:</p>
     * <br>
     * <p>*   **Immediate** (default): The update takes effect immediately.</p>
     * <p>*   **MaintainTime**: The update takes effect during the maintenance window that you specify. For more information about how to change the maintenance window, see [ModifyDBInstanceMaintainTime](~~26249~~).</p>
     * <p>*   **SpecifyTime**: The update takes effect at the point in time you specify.</p>
     */
    @NameInMap("UpgradeTime")
    public String upgradeTime;

    public static UpgradeDBInstanceKernelVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceKernelVersionRequest self = new UpgradeDBInstanceKernelVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceKernelVersionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBInstanceKernelVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeDBInstanceKernelVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeDBInstanceKernelVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeDBInstanceKernelVersionRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public UpgradeDBInstanceKernelVersionRequest setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    public UpgradeDBInstanceKernelVersionRequest setUpgradeTime(String upgradeTime) {
        this.upgradeTime = upgradeTime;
        return this;
    }
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

}
