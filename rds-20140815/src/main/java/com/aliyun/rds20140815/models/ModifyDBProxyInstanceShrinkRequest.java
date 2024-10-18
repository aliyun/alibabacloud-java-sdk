// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n3a****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A deprecated parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The number of database proxies. If you set this parameter to 0, the database proxy feature is disabled for the instance. Valid values: <strong>1</strong> to <strong>16</strong>.</p>
     * <blockquote>
     * <p> The capability of the database proxy feature to process requests increases with the number of database proxies that are enabled. You can monitor the load on the instance and specify an appropriate number of database proxies based on the load monitoring data.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBProxyInstanceNum")
    public String DBProxyInstanceNum;

    /**
     * <p>The database proxy type. Valid values:</p>
     * <ul>
     * <li><strong>common</strong>: general-purpose database proxy</li>
     * <li><strong>exclusive</strong> (default): dedicated database proxy</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DedicatedProxy</p>
     */
    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    @NameInMap("DBProxyNodes")
    public String DBProxyNodesShrink;

    /**
     * <p>The point in time that you want to specify. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p> If the <strong>EffectiveTime</strong> parameter is set to <strong>SpecificTime</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-07-10T13:15:12Z</p>
     */
    @NameInMap("EffectiveSpecificTime")
    public String effectiveSpecificTime;

    /**
     * <p>The effective time. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong>: The effective time is immediate.</li>
     * <li><strong>MaintainTime</strong>: The effective time is within the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
     * <li><strong>SpecificTime</strong>: The effective time is a specified point in time.</li>
     * </ul>
     * <p>Default value: <strong>MaintainTime</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MaintainTime</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("MigrateAZ")
    public String migrateAZShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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

    /**
     * <p>The ID of the vSwitch in the destination zone. You can call the <a href="https://help.aliyun.com/document_detail/610431.html">DescribeVSwitches</a> operation to query existing vSwitches.</p>
     * <blockquote>
     * <p> Only database proxies for ApsaraDB RDS for MySQL instances that use cloud disks can be migrated to different zones.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6adz52c2p****</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    public static ModifyDBProxyInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyInstanceShrinkRequest self = new ModifyDBProxyInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyInstanceShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBProxyInstanceShrinkRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public ModifyDBProxyInstanceShrinkRequest setDBProxyInstanceNum(String DBProxyInstanceNum) {
        this.DBProxyInstanceNum = DBProxyInstanceNum;
        return this;
    }
    public String getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    public ModifyDBProxyInstanceShrinkRequest setDBProxyInstanceType(String DBProxyInstanceType) {
        this.DBProxyInstanceType = DBProxyInstanceType;
        return this;
    }
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    public ModifyDBProxyInstanceShrinkRequest setDBProxyNodesShrink(String DBProxyNodesShrink) {
        this.DBProxyNodesShrink = DBProxyNodesShrink;
        return this;
    }
    public String getDBProxyNodesShrink() {
        return this.DBProxyNodesShrink;
    }

    public ModifyDBProxyInstanceShrinkRequest setEffectiveSpecificTime(String effectiveSpecificTime) {
        this.effectiveSpecificTime = effectiveSpecificTime;
        return this;
    }
    public String getEffectiveSpecificTime() {
        return this.effectiveSpecificTime;
    }

    public ModifyDBProxyInstanceShrinkRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyDBProxyInstanceShrinkRequest setMigrateAZShrink(String migrateAZShrink) {
        this.migrateAZShrink = migrateAZShrink;
        return this;
    }
    public String getMigrateAZShrink() {
        return this.migrateAZShrink;
    }

    public ModifyDBProxyInstanceShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBProxyInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBProxyInstanceShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBProxyInstanceShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBProxyInstanceShrinkRequest setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

}
