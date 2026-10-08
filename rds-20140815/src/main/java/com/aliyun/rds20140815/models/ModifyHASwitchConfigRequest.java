// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyHASwitchConfigRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The primary/secondary switchover setting. Valid values:</p>
     * <ul>
     * <li><strong>Auto</strong>: The system automatically switches over between the primary and secondary instances upon a fault.</li>
     * <li><strong>Manual</strong>: Temporarily disables automatic switchover.</li>
     * </ul>
     * <p>Default value: <strong>Auto</strong>.</p>
     * <blockquote>
     * <p>If you set this parameter to <strong>Manual</strong>, you must also specify the <strong>ManualHATime</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("HAConfig")
    public String HAConfig;

    /**
     * <p>The deadline for temporarily disabling automatic switchover. You can set this parameter to a point in time up to 23:59:59 seven days later. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>HAConfig</strong> is set to <strong>Manual</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-08-29T15:00:00Z</p>
     */
    @NameInMap("ManualHATime")
    public String manualHATime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
