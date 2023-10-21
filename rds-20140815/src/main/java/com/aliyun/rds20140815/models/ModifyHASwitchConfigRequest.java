// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyHASwitchConfigRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the [DescribeDBInstances](~~610396~~) operation to query the instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The mode of the automatic primary/secondary switchover feature. Valid values:</p>
     * <br>
     * <p>*   **Auto**: The automatic primary/secondary switchover feature is enabled. The system automatically switches your workloads over from the instance to its secondary instance in the event of a fault.</p>
     * <p>*   **Manual**: The automatic primary/secondary switchover feature is disabled. You must manually switch your workloads over from the instance to its secondary instance in the event of a fault.</p>
     * <br>
     * <p>Default value: **Auto**.</p>
     * <br>
     * <p>>  If you set this parameter to **Manual**, you must specify the **ManualHATime** parameter.</p>
     */
    @NameInMap("HAConfig")
    public String HAConfig;

    /**
     * <p>The time to disable the automatic primary/secondary switchover feature. The time can range from the current time to 23:59:59 seven days later. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>>  This parameter takes effect only when you set the **HAConfig** parameter to **Manual**.</p>
     */
    @NameInMap("ManualHATime")
    public String manualHATime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~26243~~) operation to query most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyHASwitchConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHASwitchConfigRequest self = new ModifyHASwitchConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHASwitchConfigRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyHASwitchConfigRequest setHAConfig(String HAConfig) {
        this.HAConfig = HAConfig;
        return this;
    }
    public String getHAConfig() {
        return this.HAConfig;
    }

    public ModifyHASwitchConfigRequest setManualHATime(String manualHATime) {
        this.manualHATime = manualHATime;
        return this;
    }
    public String getManualHATime() {
        return this.manualHATime;
    }

    public ModifyHASwitchConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyHASwitchConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHASwitchConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyHASwitchConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
