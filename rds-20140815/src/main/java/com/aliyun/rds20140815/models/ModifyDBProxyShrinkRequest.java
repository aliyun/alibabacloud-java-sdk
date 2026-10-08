// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable, disable, or modify the database proxy. Valid values:</p>
     * <ul>
     * <li><strong>Startup</strong>: Enables the database proxy.</li>
     * <li><strong>Shutdown</strong>: Disables the database proxy.</li>
     * <li><strong>Modify</strong>: Modifies the database proxy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Startup</p>
     */
    @NameInMap("ConfigDBProxyService")
    public String configDBProxyService;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A deprecated parameter. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The number of proxy instances. Valid values: <strong>1</strong> to <strong>16</strong>. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>More proxy instances can handle more requests. You can check the monitoring data to understand the load on proxy instances and then set an appropriate number of proxy instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DBProxyInstanceNum")
    public String DBProxyInstanceNum;

    /**
     * <p>The type of the database proxy instance. Valid values:</p>
     * <ul>
     * <li><strong>common</strong>: general-purpose database proxy</li>
     * <li><strong>exclusive</strong>: dedicated database proxy (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>exclusive</p>
     */
    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    /**
     * <p>The list of proxy nodes.</p>
     */
    @NameInMap("DBProxyNodes")
    public String DBProxyNodesShrink;

    /**
     * <p>The network type of the instance. Only Virtual Private Cloud (VPC) is supported. Set the value to <strong>VPC</strong>.</p>
     * <blockquote>
     * <p>This parameter is required when you enable the database proxy.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable persistent connections. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: enables persistent connections.</li>
     * <li><strong>Disabled</strong>: disables persistent connections.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Only RDS MySQL supports this parameter.</li>
     * <li>To modify the persistent connection status, set <strong>ConfigDBProxyService</strong> to <strong>Modify</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("PersistentConnectionStatus")
    public String persistentConnectionStatus;

    /**
     * <p>The region ID. You can call DescribeRegions to obtain the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The VPC ID of the instance. You can call DescribeDBInstanceAttribute to obtain the VPC ID.</p>
     * <blockquote>
     * <p>This parameter is required when you enable the database proxy.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the instance. You can call DescribeDBInstanceAttribute to obtain the vSwitch ID.</p>
     * <blockquote>
     * <p>This parameter is required when you enable the database proxy.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static ModifyDBProxyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyShrinkRequest self = new ModifyDBProxyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyShrinkRequest setConfigDBProxyService(String configDBProxyService) {
        this.configDBProxyService = configDBProxyService;
        return this;
    }
    public String getConfigDBProxyService() {
        return this.configDBProxyService;
    }

    public ModifyDBProxyShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBProxyShrinkRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public ModifyDBProxyShrinkRequest setDBProxyInstanceNum(String DBProxyInstanceNum) {
        this.DBProxyInstanceNum = DBProxyInstanceNum;
        return this;
    }
    public String getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    public ModifyDBProxyShrinkRequest setDBProxyInstanceType(String DBProxyInstanceType) {
        this.DBProxyInstanceType = DBProxyInstanceType;
        return this;
    }
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    public ModifyDBProxyShrinkRequest setDBProxyNodesShrink(String DBProxyNodesShrink) {
        this.DBProxyNodesShrink = DBProxyNodesShrink;
        return this;
    }
    public String getDBProxyNodesShrink() {
        return this.DBProxyNodesShrink;
    }

    public ModifyDBProxyShrinkRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public ModifyDBProxyShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBProxyShrinkRequest setPersistentConnectionStatus(String persistentConnectionStatus) {
        this.persistentConnectionStatus = persistentConnectionStatus;
        return this;
    }
    public String getPersistentConnectionStatus() {
        return this.persistentConnectionStatus;
    }

    public ModifyDBProxyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBProxyShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDBProxyShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBProxyShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBProxyShrinkRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public ModifyDBProxyShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
