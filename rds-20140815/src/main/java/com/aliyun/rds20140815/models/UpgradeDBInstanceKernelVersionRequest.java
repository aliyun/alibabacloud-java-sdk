// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SwitchTime")
    public String switchTime;

    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

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
