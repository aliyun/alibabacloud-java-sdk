// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateToOtherZoneRequest extends TeaModel {
    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **Basic**: RDS Basic Edition</p>
     * <p>*   **HighAvailability**: RDS High-availability Edition</p>
     * <p>*   **AlwaysOn**: RDS Cluster Edition</p>
     * <p>*   **Finance**: RDS Enterprise Edition</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The new instance type of the instance. You can change the instance type of the instance. You cannot change the storage type of the instance. If you set the **IsModifySpec** parameter to **true**, you must specify at least one of the DBInstanceClass and **DBInstanceStorage** parameters.</p>
     * <br>
     * <p>For more information about instance types, see [Primary ApsaraDB RDS for MySQL instance types](~~276975~~).</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The new storage capacity of the instance. If you set the **IsModifySpec** parameter to **true**, you must specify at least one of the DBInstanceStorage and **DBInstanceClass** parameters.</p>
     * <br>
     * <p>Unit: GB. The available storage capacity range varies based on the instance type of the instance. For more information, see [Primary ApsaraDB RDS for MySQL instance types](~~276975~~).</p>
     */
    @NameInMap("DBInstanceStorage")
    public Long DBInstanceStorage;

    /**
     * <p>The time at which you want the change to take effect. Valid values:</p>
     * <br>
     * <p>*   **Immediately**: The change immediately takes effect. This is the default value.</p>
     * <p>*   **MaintainTime**: The change takes effect during the maintenance window. For more information, see [ModifyDBInstanceMaintainTime](~~26249~~).</p>
     * <p>*   **ScheduleTime**: The change takes effect at the point in time that you specify.</p>
     * <br>
     * <p>> If you set this parameter to **ScheduleTime**, you must also specify the **SwitchTime** parameter.</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>Specifies whether to change the specifications of the instance during the cross-zone migration. Valid values:</p>
     * <br>
     * <p>*   **true**: You want to change the specifications of the instance during the cross-zone migration. If you set this parameter to **true**, you must specify at least one of the **DBInstanceClass** and **DBInstanceStorage** parameters.</p>
     * <p>*   **false**: You do not want to change the specifications of the instance during the cross-zone migration. This is the default value.</p>
     * <br>
     * <p>> This parameter applies only to instances that run MySQL.</p>
     */
    @NameInMap("IsModifySpec")
    public String isModifySpec;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time at which you want the change to take effect. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> This parameter is used with the **EffectiveTime** parameter. You must specify this parameter only when the **EffectiveTime** parameter is set to **ScheduleTime**.</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The ID of the virtual private cloud (VPC). Do not change the VPC of the instance.</p>
     * <br>
     * <p>> * If the instance resides in a VPC, you must specify this parameter.</p>
     * <p>> * If the instance runs SQL Server, you can change the VPC of the instance.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch.</p>
     * <br>
     * <p>> *   If the instance resides in a VPC, you must specify this parameter. You can call the [DescribeVSwitches](~~35748~~) operation to query the ID of the vSwitch.</p>
     * <p>> *   If the instance runs PostgreSQL or SQL Server and a secondary zone is specified for the instance, you can specify multiple vSwitch IDs, each of which corresponds to a zone. Separate the vSwitch IDs with commas (,).</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the destination zone. You can call the [DescribeRegions](~~26243~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The zone of the secondary instance.</p>
     * <br>
     * <p>> If the instance does not run RDS Basic Edition, you must specify this parameter.</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>The zone of the logger instance.</p>
     * <br>
     * <p>> If the instance runs RDS Enterprise Edition, you must specify this parameter.</p>
     */
    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static MigrateToOtherZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateToOtherZoneRequest self = new MigrateToOtherZoneRequest();
        return TeaModel.build(map, self);
    }

    public MigrateToOtherZoneRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public MigrateToOtherZoneRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public MigrateToOtherZoneRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public MigrateToOtherZoneRequest setDBInstanceStorage(Long DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Long getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public MigrateToOtherZoneRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public MigrateToOtherZoneRequest setIsModifySpec(String isModifySpec) {
        this.isModifySpec = isModifySpec;
        return this;
    }
    public String getIsModifySpec() {
        return this.isModifySpec;
    }

    public MigrateToOtherZoneRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public MigrateToOtherZoneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MigrateToOtherZoneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MigrateToOtherZoneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public MigrateToOtherZoneRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public MigrateToOtherZoneRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public MigrateToOtherZoneRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public MigrateToOtherZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public MigrateToOtherZoneRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    public MigrateToOtherZoneRequest setZoneIdSlave2(String zoneIdSlave2) {
        this.zoneIdSlave2 = zoneIdSlave2;
        return this;
    }
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

}
