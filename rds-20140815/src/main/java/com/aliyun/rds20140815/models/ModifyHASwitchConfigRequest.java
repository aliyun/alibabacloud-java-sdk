// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyHASwitchConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("HAConfig")
    public String HAConfig;

    @NameInMap("ManualHATime")
    public String manualHATime;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyHASwitchConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHASwitchConfigRequest self = new ModifyHASwitchConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHASwitchConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public ModifyHASwitchConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
