// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBProxyInstanceKernelVersionRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The specific point in time when you want to perform the upgrade. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> If you set **UpgradeTime** to **SpecificTime**, you must specify SwitchTime.</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The time when you want to upgrade the database proxy version of the instance. Valid values:</p>
     * <br>
     * <p>*   **MaintainTime** (default): performs the upgrade during the maintenance window that you specified. For more information, see [Modify the maintenance window](~~610402~~).</p>
     * <p>*   **Immediate**: performs the upgrade immediately.</p>
     * <p>*   **SpecificTime**: performs the upgrade at a specified point in time.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If the instance runs MySQL, you can set this parameter to **MaintainTime**, **Immediate**, or **SpecificTime**.</p>
     * <br>
     * <p>*   If the instance runs PostgreSQL, you can set this parameter to **MaintainTime** or **Immediate**.</p>
     */
    @NameInMap("UpgradeTime")
    public String upgradeTime;

    public static UpgradeDBProxyInstanceKernelVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBProxyInstanceKernelVersionRequest self = new UpgradeDBProxyInstanceKernelVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setUpgradeTime(String upgradeTime) {
        this.upgradeTime = upgradeTime;
        return this;
    }
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

}
