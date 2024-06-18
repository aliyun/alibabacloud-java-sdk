// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateToOtherZoneRequest extends TeaModel {
    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: RDS Basic Edition</li>
     * <li><strong>HighAvailability</strong>: RDS High-availability Edition</li>
     * <li><strong>AlwaysOn</strong>: SQL Server on RDS Cluster Edition</li>
     * <li><strong>cluster</strong>: MySQL on RDS Cluster Edition</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The new instance type of the instance. You can change the instance type of the instance. You cannot change the storage type of the instance. If you set <strong>IsModifySpec</strong> to <strong>true</strong>, you must specify at least one of DBInstanceClass and <strong>DBInstanceStorage</strong>.</p>
     * <p>For more information about instance types, see <a href="https://help.aliyun.com/document_detail/276975.html">Primary ApsaraDB RDS for MySQL instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.x4.xlarge.2</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The new storage capacity of the instance. If you set <strong>IsModifySpec</strong> to <strong>true</strong>, you must specify at least one of DBInstanceStorage and <strong>DBInstanceClass</strong>.</p>
     * <p>Unit: GB. The available storage capacity range varies based on the instance type of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/276975.html">Primary ApsaraDB RDS for MySQL instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("DBInstanceStorage")
    public Long DBInstanceStorage;

    /**
     * <p>The time when you want the change to take effect. Valid values:</p>
     * <ul>
     * <li><strong>Immediately</strong> (default): The change immediately takes effect.</li>
     * <li><strong>MaintainTime</strong>: The change takes effect during the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
     * <li><strong>ScheduleTime</strong>: The change takes effect at the point in time that you specify.</li>
     * </ul>
     * <blockquote>
     * <p> If you set this parameter to <strong>ScheduleTime</strong>, you must specify the <strong>SwitchTime</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IoAccelerationEnabled")
    public String ioAccelerationEnabled;

    /**
     * <p>Specifies whether to change the specifications of the instance during the cross-zone migration. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: You want to change the specifications of the instance during the cross-zone migration. If you set this parameter to <strong>true</strong>, you must specify at least one of <strong>DBInstanceClass</strong> and <strong>DBInstanceStorage</strong>.</li>
     * <li><strong>false</strong> (default): You do not want to change the specifications of the instance during the cross-zone migration.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter applies only to instances that run MySQL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>The migration time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>This parameter is used with <strong>EffectiveTime</strong>. You must specify this parameter only when <strong>EffectiveTime</strong> is set to <strong>ScheduleTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-12-14T15:15:15Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The ID of the virtual private cloud (VPC). Do not change the VPC of the instance when you migrate the instance across zones.</p>
     * <ul>
     * <li>This parameter must be specified when the instance resides in a VPC.</li>
     * <li>If the instance runs SQL Server, you can change the VPC of the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxxxxxx</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * <ul>
     * <li>This parameter must be specified when the instance resides in a VPC. You can call the DescribeVSwitches operation to query existing vSwitches.</li>
     * <li>If the instance runs PostgreSQL or SQL Server and a secondary zone is specified for the instance, you can specify multiple vSwitch IDs, each of which corresponds to a zone. Separate the vSwitch IDs with commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6adz52c2pxxxxxxx</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the destination zone. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The secondary zone 1 of the instance.</p>
     * <blockquote>
     * <p> This parameter must be configured if the instance runs RDS editions other than RDS Basic Edition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-c</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>The secondary zone 2 of the instance.</p>
     * <blockquote>
     * <p> You can specify this parameter only for instances that run RDS Enterprise Edition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-d</p>
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

    public MigrateToOtherZoneRequest setIoAccelerationEnabled(String ioAccelerationEnabled) {
        this.ioAccelerationEnabled = ioAccelerationEnabled;
        return this;
    }
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
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
