// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>An internal parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The number of proxy instances that are enabled. If the value of this parameter is 0, the database proxy feature is disabled for the instance. Valid values: **1** to **60**.</p>
     * <br>
     * <p>>  The capability of the database proxy to process requests increases with the number of proxy instances that are enabled. You can monitor the load on the instance and specify an appropriate number of proxy instances based on the load monitoring data.</p>
     */
    @NameInMap("DBProxyInstanceNum")
    public String DBProxyInstanceNum;

    /**
     * <p>The type of database proxy that is enabled for the instance. Set the value to **DedicatedProxy**.</p>
     */
    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    /**
     * <p>The point in time at which you want to apply the new database proxy settings. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>>  If you set the **EffectiveTime** parameter to **SpecificTime**, you must specify the EffectiveSpecificTime parameter.</p>
     */
    @NameInMap("EffectiveSpecificTime")
    public String effectiveSpecificTime;

    /**
     * <p>The time when you want to apply the new database proxy settings. Valid values:</p>
     * <br>
     * <p>*   **Immediate**: ApsaraDB RDS immediately applies the new settings.</p>
     * <p>*   **MaintainTime**: ApsaraDB RDS applies the new settings during the maintenance window that you specified. For more information, see [Modify the maintenance window](~~26249~~).</p>
     * <p>*   **SpecificTime**: ApsaraDB RDS applies the new settings at a specified point in time.</p>
     * <br>
     * <p>Default value: **MaintainTime**.</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the instance resides. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    public static ModifyDBProxyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyInstanceRequest self = new ModifyDBProxyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBProxyInstanceRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public ModifyDBProxyInstanceRequest setDBProxyInstanceNum(String DBProxyInstanceNum) {
        this.DBProxyInstanceNum = DBProxyInstanceNum;
        return this;
    }
    public String getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    public ModifyDBProxyInstanceRequest setDBProxyInstanceType(String DBProxyInstanceType) {
        this.DBProxyInstanceType = DBProxyInstanceType;
        return this;
    }
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    public ModifyDBProxyInstanceRequest setEffectiveSpecificTime(String effectiveSpecificTime) {
        this.effectiveSpecificTime = effectiveSpecificTime;
        return this;
    }
    public String getEffectiveSpecificTime() {
        return this.effectiveSpecificTime;
    }

    public ModifyDBProxyInstanceRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyDBProxyInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBProxyInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBProxyInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBProxyInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBProxyInstanceRequest setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

}
